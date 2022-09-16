package com.curatedList.leetcode.SumOfTwoInts;

// Given two integers a and b, return the sum of the 2 integers without using the + and -

public class SumOfTwoIntsSoln {

    public int getSum(int a, int b) {

        while(b!=0) {
            int c = a&b;
            a = a^b;
            b = c<<1;
        }
        return a;
    }
}
