package org.perscholas.lectures.w4d3.exceptions.custom3;

public class TestCustomException {

    public void validates(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("you are under age");
        } else {
            System.out.println("Welcome to the Voting Mangaement system");
        }
    }

    public void validatesCatch(int age) {
        if (age < 18) {
            try {
                throw new InvalidAgeException("You are under age");
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Welcome to the voting management system");
        }
    }
}
