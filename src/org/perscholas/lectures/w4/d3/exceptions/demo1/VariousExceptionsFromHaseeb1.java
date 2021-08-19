package org.perscholas.lectures.w4.d3.exceptions.demo1;

public class VariousExceptionsFromHaseeb1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // uncheck exeption
        try {
            System.out.println("This statement will execute");

            int i = 100/10;

            System.out.println("REsult " + i);

        }
        catch(ArithmeticException  e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Execption Caught: Denominator must be greater then zero");

        }
        catch(Exception e)
        {
            System.out.println("You got exception");
        }
        finally
        {
            System.out.println("Finally block is always executed");
        }
    }
}
