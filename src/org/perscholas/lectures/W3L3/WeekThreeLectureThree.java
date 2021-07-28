package org.perscholas.lectures.W3L3;

import java.util.Scanner;

public class WeekThreeLectureThree {

    public static void main(String[] args) {
        int typeCode;
        long income;
        showSwitch();
        typeCode = 1; // 1 single, 2 married jointly, 3 married separately, 4 head of household
        income = 54000L;
        calculateTaxes(typeCode, income);
    }

    private static long calculateTaxes(int typeCode, long income) {
        long tax;
        switch (typeCode) {
            case 1:
                tax = calculateFilingSingly(income);
                break;
            case 2:
                tax = calculaeMarriedJointly(income);
                break;
            case 3:
                tax = calculateMarriedSeparately(income);
                break;
            case 4:
                tax = calculateHeadOfHousehold(income);
                break;
            default:
                tax = 0; // todo warn


        }
        return tax;

    }

    private static long calculateHeadOfHousehold(long income) {
        // todo implement
        return 0;
    }

    private static long calculateMarriedSeparately(long income) {
        // todo implement
        return 0;
    }

    private static long calculaeMarriedJointly(long income) {
        // todo implement
        return 0;
    }

    private static long calculateFilingSingly(long income) {
        // todo implement
        return 0;
    }

    private static void showSwitch() {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter score (1-5)");
        int userInput = scn.nextInt();
        System.out.print("Your grade is: ");
        switch (userInput) {
            case 5:
                System.out.println("A");
                break;
            case 4:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 2:
                System.out.println("D");
                break;
            case 1:
                System.out.println("F");
                break;

        }
    }
}
