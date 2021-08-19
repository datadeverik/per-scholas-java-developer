package org.perscholas.lectures.w4.d3.exceptions.custom4;

public class TestCustomException {

    public void validates(int age) throws InvalidAgException
    {
        if(age < 18)
        {
            throw new InvalidAgException("you are under Age");
        }
        else
        {
            System.out.println("Welcome to the Voting Managment System");
        }


    }

    public void validates_two(int age)
    {
        if(age < 18)
        {
            try {

                throw new InvalidAgException("you are under Age");
            }
            catch (InvalidAgException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Welcome to the Voting Managment System");
        }


    }

}
