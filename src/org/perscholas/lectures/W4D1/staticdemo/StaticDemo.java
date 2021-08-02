package org.perscholas.lectures.W4D1.staticdemo;

public class StaticDemo {

    public static int var1 = 20;
    public static String var2 = "PerScholas";
    public int var3 = 100;

    public static int addingNumber(int a, int b) {
        int c = a + b;
        return c;
    }
}


// Static variables are also known as Class Variables.
/* a Static variable is common to all the
 * instances (or objects) or the class because it is a
 * class level variable. In other words you can say
 * that only a single copy of static variable is created
 * and shared among all the instances of the class.
 * Memory allocation for such variables only happens once
 * when the class is loaded in the memory
 */