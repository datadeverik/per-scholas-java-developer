package org.perscholas.lectures.w4.d1.staticdemo;

//import org.perscholas.lectures.W4D1.staticdemo.StaticDemo;

public class MainMethod {
    public static void main(String[] args) {
        // access static variable from the class StaticDemo
        System.out.println("StaticDemo.var1: " + StaticDemo.var1);
        System.out.println("StaticDemo.var2: " + StaticDemo.var2);
        System.out.println("note: StaticDemo.var3 is not reachable, because var 3 is not static");
        // crate an object of the class
        System.out.println("code: `StaticDemo obj = new StaticDemo();`");
        StaticDemo obj = new StaticDemo();
        System.out.println("obj.var3: " + obj.var3);

        System.out.println("Make three objects of class StaticDemo");
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();
        System.out.println("set values to obj1.var1 30, obj2.var1 40, obj3.var1 50");
        obj1.var1=30;
//        System.out.println("StaticDemo.var1: " + StaticDemo.var1);
        obj2.var1=40;
        obj3.var1=50;
        System.out.print("Print the value of var1 for each of the objects: ");
        System.out.print(obj1.var1 + " ");
        System.out.print(obj2.var1 + " ");
        System.out.print(obj3.var1);
        System.out.println();
        System.out.println("Print value var1 for the class: " + StaticDemo.var1);
        System.out.println("Now work with the non-static var3");
        System.out.println("Set value of var3 to various numbers");
        obj1.var3 = 200;
        obj2.var3 = 300;
        obj3.var3 = 400;
        System.out.print("Values of var3 for obj1, obj2, obj3: ");
        System.out.print(obj1.var3 + " ");
        System.out.print(obj2.var3 + " ");
        System.out.print(obj3.var3 + " ");
        System.out.println();
        System.out.println("Note: can't call `StaticDemo.var3");
//        System.out.println(StaticDemo.var3);
        System.out.println("Side note: can't create an instance of Math");
//        Math M = new Math(); // aside: can't instantiate an object of the Math class
        System.out.println("Using a static method");
        System.out.println("`StaticDemo.addingNumber(3, 5)`: " +StaticDemo.addingNumber(3, 5));
        // https://www.geeksforgeeks.org/jvm-create-object-main-class-class-contains-main/
    }
}
