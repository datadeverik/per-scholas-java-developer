package com.perscholas.java_basics;
import java.lang.Math.*;


public class JavaBasicsClass {
    public static void main(String[] args) {
        System.out.println("Solutions by Erik Anderson");
        partOne();
        partTwo();
        partThree();
        partFourA();
        partFourB();
        partFive();
        partSix();
        partSeven();
        partEight();

    }

    private static void partEight() {
        System.out.println("Part Eight");
        int coffee = 5;
        int tea = 3;
        int scone = 6;
        int subtotal;
        double totalSale;
        subtotal = 3 * coffee + 4 * tea + 2 * scone;
        double SALES_TAX = 0.095;
        totalSale = subtotal + subtotal * SALES_TAX;
        System.out.printf("%.2f %n", totalSale);
        System.out.println();
    }

    private static void partSeven() {
        System.out.println("Part Seven");
        int PART_SEVEN = 707;
        int result = PART_SEVEN * 7;
        System.out.println(result);
    }

    private static void partSix() {
        System.out.println("Part Six:");
        int x = 5, y = 6;
        double q = y/x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);
        // at least I think that's what the problem wanted
    }

    private static void partFive() {
        double b = 8;
        double d = 27;
        double result = d / b;
        System.out.println(result);
        int result2 = (int) result;
        System.out.println(result2);
    }

    private static void partFourB() {
        System.out.println("Part Four B: making changes");
        System.out.println("the larger number and the result must be changed to double type");
        int a = 5;
        double b = 32.7;
        double result = b / a;
        System.out.println(result);
    }

    private static void partFourA() {
        System.out.println("Part Four A");
        int a = 5, b = 32;
        int result = b / a;
        System.out.println(result);

    }

    private static void partThree() {
        System.out.println("Part Three (the result variable is a double)");
        int a;
        double b;
        a = 5;
        b = 79.3;
        double result = a + b;
        System.out.println(result);
    }

    private static void partTwo() {
        System.out.println("Part Two");
        double a = 50.43;
        double b = 98.32;
        double result = a + b;
        System.out.println(result);
    }


    public static void partOne() {
        System.out.println("Part One");
        int a = 5;
        int b = 7;
        int result = a + b;
        System.out.println(result);
    }
}
