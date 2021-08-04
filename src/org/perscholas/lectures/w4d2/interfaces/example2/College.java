package org.perscholas.lectures.w4d2.interfaces.example2;

public interface College  {
// All methods must be abstract method so we do not need to specify absrtract keyword
    //   we can not create a constructor in Interface

    // All variables/ fields are by default or implicitly public, static and final

    String COLLEGENAME = "Perscholas";
    String Address = "23-66st";


    //  interface can not have a method with body (abstract method)
    // all methods are by default public and abstract

    void getCourseName();
    void getIAName();
    void getInstructor();
    void getProgramDuration();
    void getStudent_rollNumber(int rollnum);
    void getStudent_rollNumber(teacher t);
    void getTecherinfo(String st);




    default void mymethod()
    {
        System.out.println("hello");
    }
}