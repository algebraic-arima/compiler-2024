package src.Optim.Mem2Reg;

import org.antlr.v4.runtime.misc.Pair;
import src.ASM.Operand.Reg;
import src.IR.IRDef.*;
import src.IR.IRInst.*;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

import java.util.*;

public class FuncMem2Reg {

    IRFuncDef func;
    public HashMap<String, IRBlock> irBlocks;
    public HashMap<String, CFGNode> nodes;
    public CFGNode CFGRoot;
    ArrayList<CFGNode> postOrder;
    HashMap<String, IRType> varDefGlobal;
    HashMap<String, IRType> varDefLocal;
    HashMap<String, HashSet<String>> varDefBlocks;
    HashMap<String, Entity> renameMap;
    // (k, v) \in renameMap => the AnonReg k stores the value of the variable v
    // thus, when accessing k, use v instead
    HashMap<String, Integer> counter;
    HashMap<String, Stack<String>> stack;


    public FuncMem2Reg(IRFuncDef func) {
        this.func = func;
        postOrder = new ArrayList<>();
        nodes = new HashMap<>();
        varDefGlobal = new HashMap<>();
        varDefBlocks = new HashMap<>();
        irBlocks = new HashMap<>();
        renameMap = new HashMap<>();
        func.blocks.forEach(e -> {
            nodes.put(e.label.label, new CFGNode(e.label.label));
            irBlocks.put(e.label.label, e);
        });
        HashSet<CFGNode> dom = new HashSet<>(nodes.values());
        for (int i = 0; i < func.blocks.size(); ++i) {
            IRBlock b = func.blocks.get(i);
            CFGNode c = nodes.get(b.label.label);
            terminalIRInst t = (terminalIRInst) b.IRInsts.getLast();
            if (t instanceof Br) {
                CFGNode tt = nodes.get(((Br) t).trueBlock.label.label);
                CFGNode ff = nodes.get(((Br) t).falseBlock.label.label);
                c.setSucc(tt);
                c.setSucc(ff);
                ff.setPred(c);
                tt.setPred(c);
            } else if (t instanceof Jmp) {
                CFGNode tt = nodes.get(((Jmp) t).block.label.label);
                c.setSucc(tt);
                tt.setPred(c);
            }
            c.dom = new HashSet<>(dom);
        }
        CFGRoot = nodes.get("entry");
        CFGRoot.dom.clear();
        CFGRoot.dom.add(CFGRoot);
        computeDom();
        computeIDom();
        computeDF();
        getGlobal();
        renameLocal();
        putPhi();
        rename();
    }

    public void computeDom() {
        visit(CFGRoot, postOrder);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = postOrder.size() - 2; i >= 0; --i) {
                CFGNode node = postOrder.get(i);
                HashSet<CFGNode> tmp = new HashSet<>(nodes.values());
                node.pred.forEach(n -> tmp.retainAll(n.dom));
                tmp.add(node);
                if (!node.dom.equals(tmp)) {
                    node.dom = tmp;
                    changed = true;
                }
            }
        }
    }

    public void visit(CFGNode node, ArrayList<CFGNode> list) {
        if (node.vis) return;
        node.vis = true;
        node.succ.forEach(e -> visit(e, list));
        list.add(node);
    }

    public void computeIDom() {
        for (int i = 0; i < postOrder.size() - 1; ++i) {
            CFGNode node = postOrder.get(i);
            for (CFGNode n : node.dom) {
                if (n.dom.size() == node.dom.size() - 1) {
                    node.iDom = n;
                    break;
                }
            }
        }
    }

    public void computeDF() {
        for (CFGNode node : postOrder) {
            if (node.predNum > 1) {
                for (CFGNode p : node.pred) {
                    CFGNode runner = p;
                    while (runner != null && node.iDom != runner) {
                        runner.DF.add(node);
                        runner = runner.iDom;
                    }
                }
            }
        }
    }

    public void getGlobal() {
        HashMap<String, IRType> allocate = new HashMap<>();
        for (IRInst i : irBlocks.get("entry").IRInsts) {
            if (i instanceof Alloca a) {
                allocate.put(a.dest.name, a.irType);
            }
        }
        varDefLocal = new HashMap<>(allocate);
        for (IRBlock b : func.blocks) {
            HashSet<String> vk = new HashSet<>();
            for (IRInst i : b.IRInsts) {
                if (i instanceof Load) {
                    String x = ((Load) i).src.name;
                    if (!allocate.containsKey(x)) {
                        continue;
                    }
                    if (!vk.contains(x)) {
                        varDefGlobal.put(x, ((Load) i).irType);
                        varDefLocal.remove(x);
                    }
                } else if (i instanceof Store) {
                    String y = i.dest.name;
                    if (!allocate.containsKey(y)) {
                        continue;
                    }
                    vk.add(y);
                    if (!varDefBlocks.containsKey(y)) {
                        varDefBlocks.put(y, new HashSet<>());
                    }
                    varDefBlocks.get(y).add(b.label.label);
                } else if (i instanceof Call c) {
                    for (int cnt = 0; cnt < c.args.size(); ++cnt) {
                        Entity e = c.args.get(cnt);
                        if (e instanceof Register r) {
                            String x = r.name;
                            if (!allocate.containsKey(x)) {
                                continue;
                            }
                            if (!vk.contains(x)) {
                                varDefGlobal.put(x, c.argTypes.get(cnt));
                                varDefLocal.remove(x);
                            }
                        }
                    }
                }
            }
        }
    }

    public void renameLocal() {
        // rename one variable at one time
        // there are no chain renamings
        // just write over
        IRBlock entry = irBlocks.get("entry");
        if ((!func.paramNames.isEmpty()) && func.paramNames.getFirst().equals("%this.val")) {
            func.paramNames.set(0, "%this1");
            for (int i = 0; i < entry.IRInsts.size(); ++i) {
                IRInst inst = entry.IRInsts.get(i);
                if (inst instanceof Alloca a && a.dest.name.equals("%this")) {
                    entry.IRInsts.set(i, null);
                } else if (inst instanceof Store s && s.dest.name.equals("%this")
                        && s.value instanceof Register r && r.name.equals("%this.val")) {
                    entry.IRInsts.set(i, null);
                } else if (inst instanceof Load l && l.src.name.equals("%this") && l.dest.name.equals("%this1")) {
                    entry.IRInsts.set(i, null);
                }
            }
        }
        varDefLocal.remove("%this");
        for (int i = 0; i < entry.IRInsts.size(); ++i) {
            IRInst inst = entry.IRInsts.get(i);
            if (inst instanceof Alloca a) {
                if (varDefLocal.containsKey(a.dest.name)) {
                    entry.IRInsts.set(i, null);
                }
            } else {
                break;
            }
        }
        entry.IRInsts.removeIf(Objects::isNull);
        for (Map.Entry<String, IRType> e : varDefLocal.entrySet()) {
            String vn = e.getKey();
            HashSet<String> b = varDefBlocks.get(vn);
            if (b == null) continue;
            for (String str : b) {
                IRBlock i = irBlocks.get(str);
                Entity cur = null;
                HashMap<String, Entity> rns = new HashMap<>();
                for (int cnt = 0; cnt < i.IRInsts.size(); ++cnt) {
                    IRInst inst = i.IRInsts.get(cnt);
                    if (inst == null) continue;
                    if (inst instanceof Load l) {
                        if (!l.src.name.equals(vn)) continue;
                        if (cur != null) {
                            rns.put(l.dest.name, cur);
                        }
                        i.IRInsts.set(cnt, null);
                    } else if (inst instanceof Store s) {
                        if (s.value instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                s.value = en;
                            }
                        }
                        if (!s.dest.name.equals(vn)) {
                            continue;
                        }
                        cur = s.value;
                        i.IRInsts.set(cnt, null);
                    } else if (inst instanceof Br br) {
                        if (br.cond instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                br.cond = en;
                            }
                        }
                    } else if (inst instanceof Call c) {
                        for (int cc = 0; cc < c.args.size(); ++cc) {
                            if (c.args.get(cc) instanceof Register r) {
                                Entity en = rns.get(r.name);
                                if (en != null) {
                                    c.args.set(cc, en);
                                }
                            }
                        }
                    } else if (inst instanceof GetElePtr g) {
                        if (g.offset instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                g.offset = en;
                            }
                        }
                        Entity en = rns.get(g.ptr.name);
                        if (en != null) {
                            g.ptr = (Register) en;
                        }
                    } else if (inst instanceof Icmp ic) {
                        if (ic.lhs instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                ic.lhs = en;
                            }
                        }
                        if (ic.rhs instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                ic.rhs = en;
                            }
                        }
                    } else if (inst instanceof Ret ret) {
                        if (ret.value instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                ret.value = en;
                            }
                        }
                    } else if (inst instanceof Binary bin) {
                        if (bin.lhs instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                bin.lhs = en;
                            }
                        }
                        if (bin.rhs instanceof Register r) {
                            Entity en = rns.get(r.name);
                            if (en != null) {
                                bin.rhs = en;
                            }
                        }
                    }
                }
                i.IRInsts.removeIf(Objects::isNull);
            }
        }
    }

    public void putPhi() {
        for (Map.Entry<String, IRType> e : varDefGlobal.entrySet()) {
            String x = e.getKey();
            IRType t = e.getValue();
            ArrayDeque<String> list = new ArrayDeque<>(varDefBlocks.get(x));
            while (!list.isEmpty()) {
                CFGNode b = nodes.get(list.poll());
                for (CFGNode dd : b.DF) {
                    IRBlock d = irBlocks.get(dd.label);
                    if (!d.phis.containsKey(x)) {
                        d.putPhi(x, new Phi(new Register(x), t));// occupier
                        list.offer(dd.label);
                    }
                }
            }
        }
    }

    public void rename() {
        counter = new HashMap<>();
        stack = new HashMap<>();
        varDefGlobal.keySet().forEach(e -> {
            counter.put(e, 0);
            stack.put(e, new Stack<>());
        });
        rename("entry");
    }

    public String newName(String name) {
        int index = counter.get(name);
        String n = name + "-" + index;
        stack.get(name).add(n);
        counter.put(name, index + 1);
        return n;
    }

    public String getNewName(String name) {
        Stack<String> s = stack.get(name);
        if (s.isEmpty()) {
            return null;
        }
        return stack.get(name).peek();
    }

    public void rename(String label) {
        // rename multiple variables at one time
        // there are chain renamings
        // e.g.
        /*
         *   %1 = load i32 %a  --->   %1->%a
         *   store i32 %1 %b  --->   %b->%1->%a
         *   %3 = add i32 %b 4 ; use of %b  --->   %3 = add i32 %a 4
         */
        HashMap<String, Integer> pushStack = new HashMap<>();
        for (String s : varDefGlobal.keySet()) {
            pushStack.put(s, 0);
        }
        IRBlock ir = irBlocks.get(label);
        CFGNode cfg = nodes.get(label);

        // rename result of phi
        for (Map.Entry<String, Phi> e : ir.phis.entrySet()) {
            e.getValue().dest = new Register(newName(e.getKey()));
            pushStack.put(e.getKey(), pushStack.get(e.getKey()) + 1);
        }

        // run over all the instructions
        // rename all the global vars at one run
        // tracing back values of the vars
        for (int cnt = 0; cnt < ir.IRInsts.size(); ++cnt) {
            IRInst i = ir.IRInsts.get(cnt);
            if (i instanceof Load ii) {
                if (!varDefGlobal.containsKey(ii.src.name)) {
                    continue;
                }
//                if (stack.get(ii.src.name).isEmpty()) {
//                    ir.IRInsts.set(cnt, null);
//                } else {
//                    ir.IRInsts.set(cnt, new Binary("+", new Register(ii.irType, getNewName(ii.src.name)),
//                            new Constant(0), ii.dest, ii.irType));
//                }

                Entity c = new Register(ii.irType, getNewName(ii.src.name));
                while (c instanceof Register r) {
                    Entity e = renameMap.get(r.name);
                    if (e == null) break;
                    else c = e;
                }
                renameMap.put(ii.dest.name, c); // the very origin of the value
                ir.IRInsts.set(cnt, null);
            } else if (i instanceof Store ii) {
                Entity c = ii.value;
                while (c instanceof Register r) {
                    Entity e = renameMap.get(r.name);
                    if (e == null) break;
                    else c = e;
                }
                if (!varDefGlobal.containsKey(ii.dest.name)) {
                    ii.value = c;
                    // value serves as a use
                    continue;
                }
//                ir.IRInsts.set(cnt, new Binary("+", ii.value,
//                        new Constant(0), new Register(ii.irType, newName(ii.dest.name)), ii.irType));
//                if (ii.value instanceof Register r) {
//                    Entity s = renameMap.get(r.name);
//                    if (s != null) ii.value = s;
//                }
                renameMap.put(newName(ii.dest.name), c); // the very origin value
                ir.IRInsts.set(cnt, null);
                pushStack.put(ii.dest.name, pushStack.get(ii.dest.name) + 1);
            } else if (i instanceof Alloca a) {
                if (!varDefGlobal.containsKey(a.dest.name)) continue;
                ir.IRInsts.set(cnt, null);
            } else if (i instanceof Binary b) {
                if (b.rhs instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) b.rhs = s;
                }
                if (b.lhs instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) b.lhs = s;
                }
            } else if (i instanceof Call c) {
                for (Entity e : c.args) {
                    if (e instanceof Register ee) {
                        Entity s = renameMap.get(ee.name);
                        if (s != null) c.args.set(c.args.indexOf(e), s);
                    }
                }
            } else if (i instanceof GetElePtr g) {
                if (g.offset instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) g.offset = s;
                }
                Entity s = renameMap.get(g.ptr.name);
                if (s != null) g.ptr = (Register) s;
            } else if (i instanceof Icmp ic) {
                if (ic.rhs instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) ic.rhs = s;
                }
                if (ic.lhs instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) ic.lhs = s;
                }
            } else if (i instanceof Ret t) {
                if (t.value instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) t.value = s;
                }
            } else if (i instanceof Br br) {
                if (br.cond instanceof Register r) {
                    Entity s = renameMap.get(r.name);
                    if (s != null) br.cond = s;
                }
            } else if (i instanceof Phi p) {
                for (int cn = 0; cn < p.valList.size(); ++cn) {
                    if (p.valList.get(cn).a instanceof Register r) {
                        Entity s = renameMap.get(r.name);
                        if (s != null) p.valList.set(cn, new Pair<>(s, p.valList.get(cn).b));
                    }
                }
            }
        }
        ir.IRInsts.removeIf(Objects::isNull);

        // fill in the phis at the front of each successor of cfg graph
        for (CFGNode s : cfg.succ) {
            String succName = s.label;
            IRBlock irBlock = irBlocks.get(succName);
            for (Map.Entry<String, Phi> e : irBlock.phis.entrySet()) {
                Entity en;
                String str = getNewName(e.getKey());
                if (str == null) {
                    if (e.getValue().irType.typeName.equals("ptr")) {
                        en = new Constant(true);
                    } else {
                        en = new Constant(0);
                    }
                } else {
                    Entity entity = renameMap.get(str);
                    if (entity == null) {
                        en = new Register(e.getValue().irType, str);
                    } else {
                        en = entity;
                    }
                }
                e.getValue().addList(en, label);
            }
        }

        // recursively rename idoms
        postOrder.forEach(e -> {
            if (e.iDom == cfg) {
                rename(e.label);
            }
        });

        // retrieve the stack
        for (Map.Entry<String, Integer> s : pushStack.entrySet()) {
            int ind = s.getValue();
            while (ind-- > 0) {
                stack.get(s.getKey()).pop();
            }
        }
    }

}
