package src.Optim.Mem2Reg;

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
    HashMap<String, HashSet<String>> varDefBlocks;
    HashMap<String, Integer> counter;
    HashMap<String, Stack<String>> stack;


    public FuncMem2Reg(IRFuncDef func) {
        this.func = func;
        postOrder = new ArrayList<>();
        nodes = new HashMap<>();
        varDefGlobal = new HashMap<>();
        varDefBlocks = new HashMap<>();
        irBlocks = new HashMap<>();
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
        HashSet<String> allocate = new HashSet<>();
        for (IRInst i : irBlocks.get("entry").IRInsts) {
            if (i instanceof Alloca a) {
                allocate.add(a.dest.name);
            }
        }
        for (IRBlock b : func.blocks) {
            HashSet<String> vk = new HashSet<>();
            for (IRInst i : b.IRInsts) {
                if (i instanceof Load) {
                    String x = ((Load) i).src.name;
                    if (!allocate.contains(x)) {
                        continue;
                    }
                    if (!vk.contains(x)) {
                        varDefGlobal.put(x, ((Load) i).irType);
                    }
                } else if (i instanceof Store) {
                    String y = i.dest.name;
                    if (!allocate.contains(y)) {
                        continue;
                    }
                    vk.add(y);
                    if (!varDefBlocks.containsKey(y)) {
                        varDefBlocks.put(y, new HashSet<>());
                    }
                    varDefBlocks.get(y).add(b.label.label);
                }
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
        String n = name + "." + index;
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
        HashMap<String, Stack<String>> tmp = new HashMap<>(stack);
        IRBlock ir = irBlocks.get(label);
        CFGNode cfg = nodes.get(label);
        for (Map.Entry<String, Phi> e : ir.phis.entrySet()) {
            e.getValue().dest = new Register(newName(e.getKey()));
        }
        for (int cnt = 0; cnt < ir.IRInsts.size(); ++cnt) {
            IRInst i = ir.IRInsts.get(cnt);
            if (i instanceof Load ii) {
                if (!varDefGlobal.containsKey(ii.src.name)) continue;
                if (stack.get(ii.src.name).isEmpty()) continue;
                ir.IRInsts.set(cnt, new Binary("+", new Register(ii.irType, getNewName(ii.src.name)),
                        new Constant(0), ii.dest, ii.irType));
            } else if (i instanceof Store ii) {
                if (!varDefGlobal.containsKey(ii.dest.name)) continue;
                ir.IRInsts.set(cnt, new Binary("+", ii.value,
                        new Constant(0), new Register(ii.irType, newName(ii.dest.name)), ii.irType));
            }
        }
        for (CFGNode s : cfg.succ) {
            String succName = s.label;
            IRBlock irBlock = irBlocks.get(succName);
            for (Map.Entry<String, Phi> e : irBlock.phis.entrySet()) {
                Entity en;
                String str = getNewName(e.getKey());
                if (str == null) {
                    en = new Constant(0);
                } else {
                    en = new Register(e.getValue().irType, str);
                }
                e.getValue().addList(en, label);
            }
        }
        postOrder.forEach(e -> {
            if (e.iDom == cfg) {
                rename(e.label);
            }
        });
        stack = tmp;
    }

}
