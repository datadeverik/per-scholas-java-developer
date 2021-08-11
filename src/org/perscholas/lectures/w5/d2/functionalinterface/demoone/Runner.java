package org.perscholas.lectures.w5.d2.functionalinterface.demoone;

public class Runner {
    public static void main(String[] args) {


        // cannot create an instance of HumanInterface.
        // but can use HumanInterface to call the `communication` method
//    HumanInterface.communication();

    DemoFunctionalInterface dfiObj = new DemoFunctionalInterface();
    dfiObj.say();
    HumanInterface.communication();
//    dfiObj.communicate();  // cannot resolve symbol 'communicate', because communicate is static
//    dfiObj.sleep();
//    HumanInterface.sleep();  // non-static method sleep cannot be accessed from a static context


        DemoFunctionalInterfaceTwo dfiObjTwo = new DemoFunctionalInterfaceTwo();
//        dfiObjTwo.say(); // Cannot resolve method 'say' in 'DemoFunctionalInterfaceTwo'
        dfiObjTwo.h.say();
        HumanInterface.communication();
//    dfiObj.communicate();  // cannot resolve symbol 'communicate', because communicate is static
//        dfiObjTwo.sleep(); // Cannot resolve method 'sleep' in 'DemoFunctionalInterfaceTwo'
        dfiObjTwo.h.sleep();

        System.out.println(dfiObjTwo.sq.findSqRoot(4));
    }
}
