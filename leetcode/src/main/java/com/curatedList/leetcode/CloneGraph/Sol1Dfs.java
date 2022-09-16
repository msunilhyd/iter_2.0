package com.curatedList.leetcode.CloneGraph;

import java.util.ArrayList;
import java.util.HashMap;

public class Sol1Dfs {

    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        map.put(node, new Node(node.val, new ArrayList<>()));

        for(Node neighbor: node.neighbors) {
            if (map.containsKey(neighbor)) {
                map.get(node).neighbors.add(map.get(neighbor));
            } else {
                map.get(node).neighbors.add(cloneGraph(neighbor));
            }
        }

        return map.get(node);
    }
}
