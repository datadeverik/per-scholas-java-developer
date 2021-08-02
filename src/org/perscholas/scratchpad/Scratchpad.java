package org.perscholas.scratchpad;

public class Scratchpad {
    public static void main(String[] args) {
//        testOne();
        testTwo();
    }

    private static void testTwo() {
//        int i;
//        System.out.println(i); // gets an error: "i might not have been initialized"
    }

    private static void testOne() {
        int[] values = new int[5];
        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i - 1];
            System.out.print("i: " + i + " ");
            System.out.print("values[i-1]: " + values[i-1] + " ");
            System.out.println("values[i]: " + values[i]);
        }
    }
}