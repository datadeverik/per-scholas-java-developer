package org.perscholas.lectures.w4.d2.abstractionfromhaseeb;
public class MathStudent extends StudentAbstract  {



    @Override
    public void displayinformation() {
        // TODO Auto-generated method stub
        System.out.println("hi my name is " + super.firstname + " " + super.lastname);
        System.out.println("I got  " + super.gpa + "GPA and rollnumber is " + super.rollnumber);
    }
    @Override
    public String getStudentAddress() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String[] getFullName(String[] name) {
        // TODO Auto-generated method stub
        //String[] fullname = { super.firstname , super.lastname };
        String[] names = name;
        return names;
    }
}