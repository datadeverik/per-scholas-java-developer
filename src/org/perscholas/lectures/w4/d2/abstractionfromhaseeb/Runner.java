package org.perscholas.lectures.w4.d2.abstractionfromhaseeb;
// this code copied from Haseeb
import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
// Abstraction in programming is about hiding unwanted details while showing most essential
        //information

        //Shape -->   circle, rectangle, triangle, 	--> area, volum, draw

        // Abstraction class is a class that is declare with abstract keyword
        // abstract class contain both regular methods(non abstract method or concrete method) and abstract method
        // Abstract method --> are incomplete method, they do not have any body//
        // we can not instantiated abstract class

//StudentAbstract s = new StudentAbstract();
// do not declare final abstract method and private modifier to abstract method in abstract class

        MathStudent st_service = new MathStudent();
        st_service.setFirstname("haseeb");
        st_service.setLastname("Muhammad");
        st_service.setGpa(2);
        st_service.setRollnumber(100);
        st_service.displayinformation();
        String[] fullname = {"Keith", "wasin", "Erik", "Sangeeta"};
        String[] name =  st_service.getFullName(fullname);
        System.out.println(Arrays.toString(name));

    }
}