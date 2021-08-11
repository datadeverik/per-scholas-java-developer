package org.perscholas.lectures.w5.d2.lambdaexp;

import org.perscholas.lectures.w5.d2.lambdaexp.demo3.MathOperation;

public class Runner {
    public static void main(String[] args) {


//        // cannot create an instance of HumanInterface.
//        // but can use HumanInterface to call the `communication` method
////    HumanInterface.communication();
//
//    DemoFunctionalInterface dfiObj = new DemoFunctionalInterface();
//    dfiObj.say();
//    org.perscholas.lectures.w5.d2.functionalinterface.demoone.HumanInterface.communication();
////    dfiObj.communicate();  // cannot resolve symbol 'communicate', because communicate is static
//    dfiObj.sleep();
////    HumanInterface.sleep();  // non-static method sleep cannot be accessed from a static context


//        DemoFunctionalInterfaceTwo dfiObjTwo = new DemoFunctionalInterfaceTwo();
////        dfiObjTwo.say(); // Cannot resolve method 'say' in 'DemoFunctionalInterfaceTwo'
//        dfiObjTwo.h.say();
//        HumanInterface.communication();
////    dfiObj.communicate();  // cannot resolve symbol 'communicate', because communicate is static
////        dfiObjTwo.sleep(); // Cannot resolve method 'sleep' in 'DemoFunctionalInterfaceTwo'
//        dfiObjTwo.h.sleep();
//
//        System.out.println(dfiObjTwo.sq.findSqRoot(4));


//        HumanInterface a = () -> { System.out.println("Hello from lambdaland");};
//        a.say();

        HumanInterface a = (x) -> { System.out.println(x);};
        a.say(10);

        MyInterfaceTwo b = (s) -> {
            return "Hello, " + s;
        };

        SqRoot sq = x -> Math.sqrt(x);
        System.out.println(sq.findSqRoot(5));

        SqRoot s = (z) -> {
            double d = Math.sqrt(z);
            return d; // can write any business logic here.
        };
        System.out.println(s.findSqRoot(10));

        MathOperation add = (z, y) -> z + y;
        int resultTwo = add.manipulateTwoNumbers(10, 20);
        System.out.println(resultTwo);
        MathOperation add3 = (c, bb) -> {int n = c + bb; return n;};
        System.out.println(add3.manipulateTwoNumbers(4354, 9283));
        MathOperation add4 = (c, bb) -> { return c + bb;};
        System.out.println(add4.manipulateTwoNumbers(1, 2));
    }
}
