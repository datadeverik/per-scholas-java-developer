package org.perscholas.lectures.w4d2.abstractionme;

public class MathStudent extends AbstractStudent{ // Haseeb used StudentService


    public MathStudent(String firstName, String lastName, float gpa, int rollNumber) {
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

//    @Override
//    String[] myFullName = {"Kieth", "Wasin", "Erik", ""};
//    public String[] getStudentClasses(myFullName) {
//        return new String[0]
    // }
}
