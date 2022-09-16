package com.curatedList.leetcode.CloneGraph;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public int val;
    public List<Node> neighbors;

    public <E> Node(int val, ArrayList<E> es) {
        this.val = val;
        this.neighbors = (List<Node>) es;
    }
}
