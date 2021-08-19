package org.perscholas.lectures.w4.d2.generics;

public class GenMethod {

    public int myMethod(int a) {
        int b = 2 * a;
        return b;
        // always need to pass in type int
    }

    public int myMethod(double a) { // can accept other arguments with overloading
        int b = (int) (2 * a);
        return b;
        // always need to pass in type int
    }
    // generic normal (non-static) method
    public <DataType> void genericDisplay(DataType a) {
        System.out.println(a);

    }

    // generic static method
    public static <DataType> void staticGenericMethod(DataType a) {
        System.out.println(a);
    }

    public <DataType> void printArray(DataType[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
