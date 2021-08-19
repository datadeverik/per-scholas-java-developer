package org.perscholas.lectures.w4.d2.abstractionme;

public abstract class AbstractStudent {

    protected String firstName;
    protected String lastName;
    protected float gpa;
    protected int rollNumber;

    // we can create constructors in abstract classes
    // but we can't instantiate an object of an abstract
    // class; the constructor will only be used by
    // sub classes


    public AbstractStudent(String firstName, String lastName, float gpa, int rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.rollNumber = rollNumber;
    }

    public abstract void displayInformation(); // do abstract methods define parameters?
    public abstract String getStudentName();
    public abstract String[] getStudentClasses(String[] name);

    // getters and setters are concrete methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
