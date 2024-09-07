package src.Optim.Mem2Reg;

import src.IR.IRDef.*;
import src.IR.IRInst.*;

import java.util.*;

public class CFG {

    public HashMap<String, CFGNode> nodes;
    public CFGNode CFGRoot;
    ArrayList<CFGNode> postOrder;


    public CFG(IRFuncDef func) {
        postOrder = new ArrayList<>();
        nodes = new HashMap<>();
        func.blocks.forEach(e -> nodes.put(e.label.label, new CFGNode(e.label.label)));
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
    }

    public void computeDom() {
        visit(CFGRoot, postOrder);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = postOrder.size() - 2; i >= 1; --i) {
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

}
