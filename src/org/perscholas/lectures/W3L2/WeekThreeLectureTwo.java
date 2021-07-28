package org.perscholas.lectures.W3L2;

import java.util.Scanner;

public class WeekThreeLectureTwo {  // public is an access modifier
    public static void main(String[] args) {
        examples();
        moreExamples();
        moreExamples2();

        // classes are:
        // basic building block
        // blueprint of the object

        // In classes you may define:
        // variables --> global (class) level or local/instance variables
        // methods --> normal methods or constructor

        int age = 50;

    }



    public static void keith()
    {
        int age = 60;;
    }

    // Wrapper classes
    // a wrapper class is a class whose object
    // wraps or contains primitive data types
    //
    // When we create an object to wrapper class,
    // it contains a field and in the field we can store primitive data type
    // in other words, we can wrap a primitive value into wrapper class object
    Boolean myB = true;
    // wrapper classes for primitive data types
    // (wrapper classes also called non-primitive data types)
    byte mybyte = 100;
    Byte myByte = 100;

    short s = 100;
    Short ss = 100;

    String myString = ss.toString();



    // #fup when are int and Integer interchangeable? When not?

    // other primitive and wrapper examples. (like char/Character)

    String st = "hello this is a String";
    String stnew = new String("hello");

    // Auto Boxing
    // when a primitive is automagically converted to it's wrapper type
    public static void examples() {
        int i = 100;
        Integer ii = 100;  // literal method to instantiate
        Integer ii2 = new Integer(100);
        Integer chConvert = i;

        int a = 20;
        Integer chConvert2 = a;
        Integer.valueOf(a);
        Integer myInt2 = Integer.valueOf(a);

    // unboxing
        int iiii = chConvert2;
        Character abc = 'a';
        // Convert String into Integer
        String stchar = "200";
        Integer i3 = Integer.parseInt(stchar);
        double dC = Double.parseDouble(stchar);
        System.out.println(dC);

        Integer stWrapper = Integer.valueOf(i3);
        System.out.println("stWrapper " + stWrapper);

        // aside: type casting is going from one primitive to another

        Integer num1 = new Integer(20);
        Integer num2 = 20;

        System.out.println("num 1 " + num1);
        Integer num3 = null;
        System.out.println("num3 " + num3);  // output: num3 null

        Integer num4;

    }
    static void mymethod(int myLittleInt) {
        Integer num5 = new Integer(myLittleInt);

    }

    static void moreExamples() {
        Integer z = 500;
        String intToStr = z.toString();
        System.out.println(intToStr);

        char myChar = '\u1001';
        System.out.println("myChar " + myChar);

        char c = 'a';
        char c1 = 'A';

        Character ch = c;
        Character ch1 = c1;
        Character unichar = '\u0031';
        System.out.println("unichar " + unichar);
        Character asciiChar = 111;
        System.out.println("asciiChar " + asciiChar);

        int compareToResult = unichar.compareTo(asciiChar);
        System.out.println("result " + compareToResult);


        // String methods
        // concat
        // length
        // replace
        // toUpperCase
        // toLowerCase

        String st = "welcome";
        String st2 = "welgome";
        System.out.println(st.compareTo(st2));

        // method overloading
        // st.substring(int beginIndex)
        // st.substring(int beginIndex, int endIndex)

        // indexOf
        // lastIndexOf
    }

    private static void moreExamples2() {
        System.out.println("More examples 2");
        int i = 1024;
        byte myByte = 12;
        double myDouble = 12.36;
        boolean bool = true;
        String myString = "bob";
        System.out.printf("Hello %s, order cost %d, tax is %.2f",myString, myByte, myDouble );
        System.out.println();


        // scanner class  java.util.Scanner
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = scannerObject.nextLine();
        System.out.println("Hello " + myName);
    }



}
