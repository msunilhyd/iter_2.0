package com.curatedList.leetcode;

public class StringReversal {

    public static void main(String[] args) {
        String str = "sunil";

        int lengthOfString = str.length();
        char[] arr = str.toCharArray();

        System.out.println(arr);

        System.out.println(arr.length);
        int size = arr.length;

        int i = 0;
        int j = size -1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = arr[i];
            i = i+1;
            j = j -1;
        }
        System.out.println(arr);
    }
}
