package org.perscholas.lectures.w4d2.interfaces.example2;


public class StudentService  extends StudentAbstract implements College {


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

    @Override
    public void getCourseName() {
        System.out.println("Java Developsment");
    }

    public void getIAName() {
        System.out.println("Do not Assign");
    }

    public void getInstructor() {
        System.out.println("Haseeb");
    }

    public void getProgramDuration() {
        System.out.println("15 week");
    }

    @Override
    public void getStudent_rollNumber(int rollnum) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getStudent_rollNumber(teacher t) {
        // TODO Auto-generated method stub

    }

    @Override
    public void getTecherinfo(String st) {
        // TODO Auto-generated method stub

    }
}