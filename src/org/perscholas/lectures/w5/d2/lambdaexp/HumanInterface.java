package org.perscholas.lectures.w5.d2.lambdaexp;

@FunctionalInterface
public interface HumanInterface {

    int a = 0;  // by default, this variable is final and static

    void say(int i);
//    void eat(); // by default, these methods are public and abstract
    // this is a functional interface when it has only one abstract method
//    String talk();

//    int age(int a);

    public default void sleep() {
        // body - a method with a body in an interface? this is possible in Java 8
        System.out.println("zzzzzz - this is default method sleep");
    }

    public static void communication() {
        System.out.println("This is static method");
    }
}
