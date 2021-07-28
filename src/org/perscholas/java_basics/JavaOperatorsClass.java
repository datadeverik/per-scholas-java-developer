package org.perscholas.java_basics;

public class JavaOperatorsClass {
    public static void main(String[] args) {
        System.out.println("Solutions by Erik Anderson");
        partOne();
        partTwo();
        partThree();
        partFour();
        partFive();
        partSix();
        partSeven();
        partEight();
        partEightB();
    }

    private static void partOne() {
        System.out.println("Manually converting numbers to Binary, and verify with java");
        System.out.println("1 -> 1");
        System.out.println("1 -> " + Integer.toBinaryString(1));
        System.out.println("8 -> 1000");
        System.out.println("8 -> " + Integer.toBinaryString(8));
        System.out.println("33 -> 100001");
        System.out.println("33 -> " + Integer.toBinaryString(33));
        System.out.println("78 -> 1001110"); // 64 + 8 + 4 + 2
        System.out.println("78 -> " + Integer.toBinaryString(78));
        System.out.println("787 -> 1100010011"); // 64, 128, 256, 512, 1024,    512 + 275, 275 = 256 + 16 + 2 + 1
        // 1 + 2 + 0*4 + 0*8 + 1 * 16 + 0*32 + 0*64 + 0*128 + 1*256 + 1*512
        System.out.println("787 -> " + Integer.toBinaryString(787));
        System.out.println("33987 -> 1000010011000011"); // used a calculator to find powers of 2 and subtract
        System.out.println("33987 -> " + Integer.toBinaryString(33987));
    }

    private static void partTwo() {
        System.out.println("Manually converting binary to decimal, and confirming with Java");
        System.out.println("0010 -> 2");
        System.out.println("0010 -> " + Integer.parseInt("0010", 2));
        System.out.println("1001 -> 9");
        System.out.println("1001 -> " + Integer.parseInt("1001", 2));
        System.out.println("0011 0100 -> 52");
        System.out.println("0011 0100 -> " + Integer.parseInt("00110100", 2));
        System.out.println("0111 0010 -> 114");
        System.out.println("0111 0010 -> " + Integer.parseInt("01110010", 2));
        System.out.println("0010 0001 1111 -> 543"); // 1 + 2 + 4 + 8 + 16 + 0*(32 64 128 256) + 512 = 543
        System.out.println("0010 0001 1111 -> " + Integer.parseInt("001000011111", 2));
        System.out.println("0010 1100 0110 0111 -> 11367"); // 1 + 2 + 4 + 0*(8 + 16) + 32 + 64 + 0*128 + 0*(256 + 512) + 1024 +2048 + 0*4096 + 8192
        System.out.println("0010 1100 0110 0111 -> " + Integer.parseInt("0010110001100111", 2));
    }

    private static void partThree() {
        System.out.println("Part Three");
        int x = 2;
        System.out.println("x before " + x + " " + Integer.toBinaryString(x));
        x <<= 1;
        System.out.println("x after " + x + " " + Integer.toBinaryString(x));
        int y = 9;
        System.out.println("y before " + y + " " + Integer.toBinaryString(y));
        y <<= 1;
        System.out.println("y after " + y + " " + Integer.toBinaryString(y));
        int z = 17;
        System.out.println("z before " + z + " " + Integer.toBinaryString(z));
        z <<= 1;
        System.out.println("z after " + z + " " + Integer.toBinaryString(z));
        int a = 88;
        System.out.println("a before " + a + " " + Integer.toBinaryString(a));
        a <<= 1;
        System.out.println("a after " + a + " " + Integer.toBinaryString(a));


    }

    private static void partFour() {
        System.out.println("Part Four");
        int x = 150;
        System.out.println("x before " + x + " " + Integer.toBinaryString(x));
        x >>= 2;
        System.out.println("x after " + x + " " + Integer.toBinaryString(x));
        int y = 225;
        System.out.println("y before " + y + " " + Integer.toBinaryString(y));
        y >>= 2;
        System.out.println("y after " + y + " " + Integer.toBinaryString(y));
        int z = 1555;
        System.out.println("z before " + z + " " + Integer.toBinaryString(z));
        z >>= 2;
        System.out.println("z after " + z + " " + Integer.toBinaryString(z));
        int a = 32456;
        System.out.println("a before " + a + " " + Integer.toBinaryString(a));
        a >>= 2;
        System.out.println("a after " + a + " " + Integer.toBinaryString(a));
    }

    private static void partFive() {
        System.out.println("Part Five");
        int x = 7;
        int y = 17;
        int z;
        // 7 is 101, 17 is 10001, so 7 & 17 should just be 1.
        z = x & y;
        System.out.println("z from &: " + z + " " + Integer.toBinaryString(z));
        // yes, it was one
        // 101 and 10001 will be 10101, which is 21
        z = x | y;
        System.out.println("z from |: " + z + " " + Integer.toBinaryString(z));
        // oops, the answer according to java is 23, 10111
        // that's because 7 is actually 111, not 101.

    }

    private static void partSix() {
        System.out.println("Part Six");
        int x = 5;
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    private static void partSeven() {
        System.out.println("Part Seven");
        int y = 7;
        System.out.println(y);
        y++;
        System.out.println(y);
        ++y;
        System.out.println(y);
        y = y + 1;
        System.out.println(y);
    }

    private static void partEight() {
        System.out.println("Part Eight");
        int x = 5;
        int y = 8;
        int sum = ++x + y;
        System.out.println(sum);

    }


    private static void partEightB() {
        System.out.println("Part Eight B");
        int x = 5;
        int y = 8;
        int sum = x++ + y;
        System.out.println(sum);
    }
}
