package org.perscholas.lectures.w4d3.exceptions.custom;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Starting .....");

        try {
            throw new CustomException("This is the message. This will throw custom exception");
        } catch (CustomException e) {
            System.out.println("Printing stack trace");
            e.printStackTrace();
        }
    }
}
