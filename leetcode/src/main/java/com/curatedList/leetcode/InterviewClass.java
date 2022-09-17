package com.curatedList.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewClass {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(6);
        intList.add(3);
        intList.add(4);

        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer i : intList) {
            if (countMap.containsKey(i)) {
                int value = countMap.get(i);
                value += 1;
                countMap.put(i, value);
            }
            else {
                countMap.put(i, 0);
            }
        }

        System.out.println(countMap);

        for (Map.Entry e: countMap.entrySet()) {

            int value = (int) e.getValue();
            if (value > 0) {
                System.out.println(e.getKey() + " is a duplicate");
            }
        }
    }
}
