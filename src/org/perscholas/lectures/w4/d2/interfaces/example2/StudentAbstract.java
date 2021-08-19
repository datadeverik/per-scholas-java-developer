package org.perscholas.lectures.w4.d2.interfaces.example2;

public abstract class StudentAbstract {
    protected String firstname;
    protected String lastname;
    protected float gpa;
    protected int rollnumber;

    // in abstract class we can create constrctor but abstract class cannot instantiated

    public StudentAbstract(String firstname, String lastname, float gpa, int rollnumber) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
        this.rollnumber = rollnumber;
    }

    public StudentAbstract()
    {

    }


    // abstract method
    public abstract  void displayinformation();
    public abstract String getStudentAddress();
    public abstract String[] getFullName(String[] fullname);


    // normal methods
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }





}