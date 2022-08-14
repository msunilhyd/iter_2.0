package com.dailycodebuffer.Springboot.tutorial.controller;

public class PrintNumClass {
    public static void main(String[] args) {
        for (int i=621; i<701; i++) {
            System.out.println(i+".");
            if (i%5 == 0) {
                System.out.println("\n");
            }
        }
    }
}
