package org.perscholas.assignments.java_basics;

import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        partOne();
        partTwo();
        partThree();
        partFour();
        partFive();
        partSix();
        partSeven();
        partEight();
        partNine();
        partTen();
    }

    private static void partTen() {
        Object[] myObjectArray = {1, "red", "yellow", "green", 24.53f};
        System.out.println(Arrays.toString(myObjectArray));
    }

    private static void partNine() {
        int[] toSort = {4, 2, 9, 13, 1, 0};
        // bubble sort
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i=0; i < toSort.length-1; i++) {
                if (toSort[i] > toSort[i+1]) {
                    sorted = false;
                    int temp = toSort[i];
                    toSort[i] = toSort[i+1];
                    toSort[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(toSort));
    }

    private static void partEight() {
        System.out.println("Position swap");
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = i;
        }
        int temp = myArray[0];
        myArray[0] = myArray[2];
        myArray[2] = temp;
        System.out.println(Arrays.toString(myArray));
    }

    private static void partSeven() {
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = i;
        }
        for (int i=0; i < 5; i++) {
            if (i!=2){
                System.out.println(myArray[i]);
            }
        }
    }


    private static void partSix() {

        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = i * 2;
        }
        System.out.println(Arrays.toString(myArray));
    }

    private static void partFive() {
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = i;
        }
        System.out.println(Arrays.toString(myArray));
    }

    private static void partFour() {
        int[] myArray = {7, 4, 8, 4, 5};
        System.out.println(myArray[0]);
        System.out.println(myArray[myArray.length-1]);
//        System.out.println(myArray[myArray.length]);  // ArrayIndexOutOfBoundsException
//        myArray[myArray.length] = 5;  // ArrayIndexOutOfBoundsException
    }

    private static void partThree() {
        String[] myStrings = {"red", "green", "blue", "yellow"};
        String[] myClone = myStrings.clone();
        System.out.println(Arrays.toString(myClone));
        System.out.println();
    }

    private static void partTwo() {
        int[] myArray = {13, 5, 7, 68, 2};
        System.out.println(myArray[2]);
        System.out.println();
        System.out.println();
    }

    private static void partOne() {
        int[] myIntArray = new int[3];
        for (int i = 1; i<=3; i++) {
            myIntArray[i-1] = i;
        }
        for (int i = 1; i <=3; i++) {
            System.out.print(myIntArray[i-1] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
