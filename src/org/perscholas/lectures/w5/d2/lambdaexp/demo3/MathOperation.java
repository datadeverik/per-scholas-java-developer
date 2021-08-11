package org.perscholas.lectures.w5.d2.lambdaexp.demo3;

public interface MathOperation {
    int manipulateTwoNumbers(int a, int b);

    default double manipulateTwoNumbers(double a, double b) {
        return a + b;
    }
}
