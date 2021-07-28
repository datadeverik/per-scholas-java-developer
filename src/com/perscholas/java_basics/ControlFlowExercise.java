package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {
        partOne();
        partTwo();
        partThree();
        partFour();
        partFive(true);
        partSix(true);
    }


    private static void partSix(boolean debug) {
        System.out.println();
        System.out.println("Part Six");
        int num;
        String day;
        if (debug) {
            System.out.println("debug: Setting day code = 5");
            num = 5;
        }
        else {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter day code (1-7):");
            num = scn.nextInt();
        }
        switch (num) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "unrecognized day code";

        }
        System.out.println("The day is: " + day);


    }

    private static void partFive(boolean debug) {
        System.out.println("\nPart Five");
        int score;
        String grade;
        if (debug) {
            System.out.println("Setting score = 27");
            score = 27;
        } else {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter Score (0-100)");
            score = scn.nextInt();
        }
        grade = determineGrade(score);
        System.out.println("Grade is: " + grade);
    }

    private static String determineGrade(int score) {
        String grade;
        if (score > 100) {
            grade = "Invalid Score";
        }
        else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60) {
            grade = "D";
        }
        else if (score >= 0) {
            grade = "F";
        }
        else {
            grade = "Invalid Score";
        }
        return grade;
    }

    private static void partFour() {
        System.out.println("Part Four");
        int x;
        System.out.println("Setting x = 15");
        x = 15;
        if (x > 10 && x < 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
        System.out.println("Setting x = 5");
        x = 5;
        if (x > 10 && x < 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }

    private static void partThree() {
        System.out.println("Part Three");
        System.out.println("Setting x = 7");
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        }
        else {
            System.out.println("Greater than or equal to 20");
        }
        System.out.println("Setting x = 50");
        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        }
        else {
            System.out.println("Greater than or equal to 20");
        }
    }

    private static void partTwo() {
        System.out.println("Part Two");
        System.out.println("Setting x = 7");
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        else if (x > 10) {
            System.out.println("Greater than 10");
        }
        System.out.println("Setting x = 15");
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        else if (x > 10) {
            System.out.println("Greater than 10");
        }
    }

    private static void partOne() {
        System.out.println("Part One");
        System.out.println("Setting x = 7");
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        System.out.println("Setting y = 15");
        int y = 15;
        if (y < 10) {
            System.out.println("Less than 10");
        }
    }
}
