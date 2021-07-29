package org.perscholas.lectures.W3L3;

import java.util.Arrays;
import java.util.Scanner;

public class WeekThreeLectureThree {

    public static void main(String[] args) {
        int typeCode;
        long income;
        showSwitch(true);
        typeCode = 1; // 1 single, 2 married jointly, 3 married separately, 4 head of household
        income = 54000L;
        System.out.println(calculateTaxes(typeCode, income));
        showLoops();
        primeNumbers(true);
        palindromes(true);
        arraysSection();
    }

    private static void arraysSection() {
        System.out.println("Array Section");
        // array is a data structure, which stores a fixed-size
        // sequential collection of elements of thw same type
        // and array is used to store a collection of data or an array
        // is a collection of similar type elements, which has
        // contiguous memorylocation

        // the direct superclass of an array type is Object
        // since arrays are Objects in Java, we can find their length method

        // Al arrays are reference types, no matter their element type
        // memory for the arrays is located on the heap memory

        int[] b = new int[10];
//        int a[] = new int[10];  this form of declaration not preferred
//        System.out.println(b);

        System.out.println("Using Arrays class");
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
    }

    private static void palindromes(boolean debug) {
        System.out.println("Palindromes");
        String myInputString;
        if (debug) {
            System.out.println("debug: setting myInputInt = racecar");
            myInputString = "racecar";
        } else {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("please enter a word");
            myInputString = myScanner.nextLine();
        }
        boolean isPalindrome = true;
        for (int i = 0; i <= myInputString.length() / 2; i++) {
            int length = myInputString.length();
//            System.out.println(length + " " + i);
            String testString1 = myInputString.substring(i, i+1);
//            System.out.println(testString1);
            String testString2 = myInputString.substring(length - i - 1, length - i);
//            System.out.println(testString2);
            if (!testString1.equals(testString2)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("is palindrome: " + isPalindrome);
    }

    private static void primeNumbers(boolean debug) {
        System.out.println("Prime Numbers");
        int myInputInt;
        if (debug) {
            System.out.println("debug: setting myInputInt = 5");
            myInputInt = 5;
        } else {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("please enter an integer");
            myInputInt = myScanner.nextInt();
        }
        System.out.println("Implementation 1");
        boolean answer = isPrime(myInputInt);
        System.out.println("Is the number prime? " + answer);
        System.out.println("Implementation 2");
        boolean answer2 = isPrime2(myInputInt);

    }

    private static boolean isPrime2(int myInputInt) {
        return false;
    }

    private static boolean isPrime(int myInputInt) {
        for (int i = 2; i < myInputInt; i++) {
            if (myInputInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void showLoops() {
        // types of loop
        // for loop, while loop, dowhile loop, foreach loop
        //
        System.out.println("Nested loops");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i " + i + " j " + j);
            }
        }
        String s = "";
        for (int i = 1; i <= 5; i++) {
            s = s + "*";
            System.out.println(s);
        }
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

    private static void showSwitch(boolean debug) {
        int userInput;
        if (debug) {
            System.out.println("debug: setting userInput = 5");
            userInput = 5;
        } else {
            Scanner scn = new Scanner(System.in);
            System.out.println("enter score (1-5)");
            userInput = scn.nextInt();
        }
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
