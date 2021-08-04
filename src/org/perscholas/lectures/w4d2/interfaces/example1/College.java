package org.perscholas.lectures.w4d2.interfaces.example1;

public interface College{
    // In an interface, all methods are abstract methods
    // therefore, you don't need to write the `abstract`
    // keyword.
    // Also, all variables/fields are public, static, and final,
    // without needing to write those keywords

//    public final static String collegeName = "PerScholas"; // public, final, and static are redundant
    String COLLEGE_NAME = "PerScholas";
    String ADDRESS = "23-66st";

    // because all methods of an interface are abstract, they cannot
    // have a body
    // All methods of an interface are by default public and abstract

//    public void myMethod();  // public is redundant
    void getCourseName();
    void getInstructorName();
    void getProgramDuration();

//    default void myMethod2() {
//        System.out.println("A default modifier lets you have a method body within an interface");
//    }

}
