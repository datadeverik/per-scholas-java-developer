package org.perscholas.lectures.W4D1;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // topics
        theStaticKeyword();
    }

    private static void theStaticKeyword() {
        System.out.println("The static keyword");
        System.out.println("Identifies a variable or method as" +
                "belonging to the class, rather than belonging" +
                "to an instance of the class");
        System.out.println("Only one copy of the variable or method" +
                "will be created");
        System.out.println("Compare to instantiated variable");
        System.out.println("There is `static int a` in this class");
        System.out.println("There is a static method `public static void abc()` in this class");
    }

    static int a;

    public static void abc() {

    }
}
