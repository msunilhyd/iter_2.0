package com.curatedList.leetcode.ClimbingStairs;

public class DPTopDownApproach {

    int[] cache = new int[46];

    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        else if(cache[n] != 0)
            return cache[n];
        else
            return cache[n] = climbStairs(n-1) + climbStairs(n - 2);
    }
}
