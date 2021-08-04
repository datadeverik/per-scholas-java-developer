package org.perscholas.lectures.w4d3.exceptions.demo1;

public class Main {

    // Throwable
    // Exceptions
    // Checked Exceptions and Unchecked exceptions
    // try/catch or throw required for checked exceptions

    // Errors

    // Try, catch, finally

    // multiple catch blocks (catching different exceptions)



    public static void main(String[] args) {
        // unchecked exception
        try {
            System.out.println("This statement will be executed");
            int i = 100 / 0;
            System.out.println("This statement won't be executed");
        }
        catch(ArithmeticException e) {
            System.out.println("Oops, can't divide my zero. (*Exception Caught*) " + e);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This statement in `finally` will run");
        }
    }
}
