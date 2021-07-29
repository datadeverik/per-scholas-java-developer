package org.perscholas.lectures.W3L4;

public class WeekThreeLectureFourB {
    public static void main(String[] args) {
        System.out.println(initializingInMethod());
        System.out.println(overloading(5, 5.0));
        System.out.println(overloading(5.0, 5));
    }

    private static int overloading(int a, double b) {
        return 5;
    }

    private static int overloading(double a, int b) {
        return 10;
    }
    // can't have two methods with the same signature, even if they have different return types

    private static int initializingInMethod() {
        int x;
        x = 7;
        return x;
    }
}
