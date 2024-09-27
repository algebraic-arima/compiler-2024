package src.Optim.RegAlloc;

import java.util.*;

public class RIG {

    public static class RIGNode implements Comparable<RIGNode> {
        public String name;
        public HashMap<String, RIGNode> n;
        public long cost; // cost /= n.size();
        public int color;
        public int label;
        public boolean vis = false;
        public boolean colored = false;

        public RIGNode(String name, long cost) {
            this.name = name;
            n = new HashMap<>();
            this.cost = cost;
            color = label = 0;
        }

        @Override
        public int compareTo(RIGNode o) {
            return Integer.compare(label, o.label);
        }
    }


    public HashMap<String, RIGNode> g = new HashMap<>();
    public HashSet<Integer> colors = new HashSet<>();

    public void addCost(HashMap<String, Long> m) {
        for (Map.Entry<String, Long> e : m.entrySet()) {
            g.put(e.getKey(), new RIGNode(e.getKey(), e.getValue()));
        }
    }

    public void addEdge(String s, String t) {
        g.get(s).n.put(t, g.get(t));
        g.get(t).n.put(s, g.get(s));
    }

    public void removeVertex(String s) {
        RIGNode u = g.get(s);
        for (Map.Entry<String, RIGNode> e : u.n.entrySet()) {
            e.getValue().n.remove(s);
        }
        g.remove(s);
    }

    public void MCS() {
        int cnt = g.size(), max = 0;
        HashMap<Integer, HashSet<RIGNode>> bucket = new HashMap<>();
        bucket.put(0, new HashSet<>(g.values()));
        for (int i = cnt - 1; i >= 0; --i) {
            while (!bucket.containsKey(max) || bucket.get(max).isEmpty()) {
                bucket.remove(max);
                --max;
            }
            Iterator<RIGNode> it = bucket.get(max).iterator();
            RIGNode u = it.next();
            u.label = i;
            u.vis = true;
            bucket.get(max).remove(u);
            for (Map.Entry<String, RIGNode> e : u.n.entrySet()) {
                RIGNode v = e.getValue();
                if (v.vis) continue;
                bucket.get(v.label).remove(v);
                ++v.label;
                if (!bucket.containsKey(v.label)) {
                    bucket.put(v.label, new HashSet<>());
                }
                bucket.get(v.label).add(v);
                max = Math.max(max, v.label);
            }
        }
    }

    public void color() {
        PriorityQueue<RIGNode> pq = new PriorityQueue<>(g.values());
        // sort by label
        for (RIGNode u : pq) {
            HashSet<Integer> s = new HashSet<>();
            for (Map.Entry<String, RIGNode> e : u.n.entrySet()) {
                RIGNode v = e.getValue();
                if (v.colored) {
                    s.add(v.color);
                }
            }
            for (int i = 0; ; ++i) {
                if (!s.contains(i)) {
                    u.color = i;
                    colors.add(i);
                    u.colored = true;
                    break;
                }
            }
        }

    }


}
