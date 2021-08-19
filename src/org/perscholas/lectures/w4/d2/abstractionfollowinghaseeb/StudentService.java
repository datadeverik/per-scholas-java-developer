package org.perscholas.lectures.w4.d2.abstractionfollowinghaseeb;

public class StudentService extends AbstractStudent { // StudentService name choice has to do with MVC convention (model, view, controller)


    public StudentService(String firstName, String lastName, float gpa, int rollNumber) {
        super(firstName, lastName, gpa, rollNumber);
    }

    @Override
    public void displayInformation() {
        System.out.println(firstName + " " + lastName + " " + rollNumber);
    }

    @Override
    public String getStudentName() {
        return firstName + " " + lastName;
    }

    @Override
    public String[] getStudentClasses(String[] name) {
        return new String[0];
    }
}
