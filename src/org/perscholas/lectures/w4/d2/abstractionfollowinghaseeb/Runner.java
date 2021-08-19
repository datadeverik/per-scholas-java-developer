package org.perscholas.lectures.w4.d2.abstractionfollowinghaseeb;
// This code is my notes following Haseeb's lecture
public class Runner {
    public static void main(String[] args) {
        System.out.println("Abstraction in programming is about hiding " +
                "unwanted details while showing most essential information.");
        System.out.println("Shape --> circle, rectangle, triangle " +
                "-->> area, volume, draw()");
        System.out.println("An abstract class is a class that is declared with " +
                "the abstract keyword");
        System.out.println("Abstract classes contain both regular methods " +
                "and abstract methods");
        System.out.println("Regular methods are also referred to as non-" +
                "abstract methods or concrete methods");
        System.out.println("Abstract methods are incomplete methods, " +
                "meaning they do not have any body");
        System.out.println("Abstract methods have no body, and instead " +
                "look like a statement, and end in a semi colon");
//        AbstractStudent as = new AbstractStudent(); // Abstract student is abstract, cannot be instantiated
        // aside: do not create a final abstract method
        StudentService studserv = new StudentService("Bob", "Chavez", 3.78f, 748);
        // aside: could use getters and setters instead of constructor
        studserv.displayInformation();


    }
}
