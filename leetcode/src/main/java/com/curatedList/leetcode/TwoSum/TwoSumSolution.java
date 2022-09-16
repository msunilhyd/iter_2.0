package com.curatedList.leetcode.TwoSum;

//Given an array of integers `nums` and an integer `target`, return indices of the 2 numbers such that they add upto target
// Example
//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

import java.util.HashMap;

public class TwoSumSolution {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i=0; i<numbers.length; i++) {
            Integer diff = (Integer)(target - numbers[i]);
            if (hash.containsKey(diff)) {
                int toReturn[] = {hash.get(diff)+1, i+1};
                return toReturn;
            }
            hash.put(numbers[i], i);
        }
        return null;
    }
}
