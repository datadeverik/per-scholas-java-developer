package org.perscholas.assignments.java_basics;

public class LoopsExercise {
    public static void main(String[] args) {
        firstPart();
        secondPart();
        thirdPart();
        fourthPart();
        fifthPart();
        sixthPart();
        seventhPart();
        eighthPart();
        ninthPart();
    }

    private static void ninthPart() {
        System.out.println("Ninth Part");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Inner loop i: " + i + ", j: " + j);
            }
        }
    }

    private static void eighthPart() {
        System.out.println("Eighth Part");
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        while (b < 50) {
            System.out.print(b + " ");
            int c = b;
            b = b + a;
            a = c;
        }
        System.out.println();
    }

    private static void seventhPart() {
        System.out.println("Part Seven");
        for (int i = 10; i <=200; i++) {
            if (isPalindrome(Integer.toString(i))) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    private static void sixthPart() {
        System.out.println("Part Six");
        for (int week=1; week<=2; week++){
            System.out.print("Week " + week + ":" + " ");
            for (int day=1; day<=5; day++) {
                System.out.print("Day " + day + " ");
            }
        }
        System.out.println();
    }

    private static void fifthPart() {
        System.out.println("Fifth Part");
        for (int i = 1; i <= 100; i++) {
            if (i > 50) {
                break;
            } else if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void fourthPart() {
        System.out.println("Fourth Part");
        // print out multiples of 5, but not 25 through 75
        for (int i = 1; i <= 100; i++) {
            if (i >=25 && i <= 75) {
                continue;
            } else if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void thirdPart() {
        System.out.println("Third Part");
        int count = 1;
        do {
            System.out.print(count + " ");
            count++;
        } while (count<=10);
        System.out.println();

    }

    private static void secondPart() {
        System.out.println("Second Part");
        for (int i = 0; i <=100; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void firstPart() {
        System.out.println("First Part");
        for (int i = 1; i <=10; i ++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
