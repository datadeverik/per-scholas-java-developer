//// I thought the output was "extraction transformation loading
//// In fact, there is a compile time error becuase you can't override a final method
//
//package org.perscholas.quiz.corejavakba;
//
////public class Stuff {
////}
//
//
//class A {
//    String E = "extraction ";
//    String T = "transformation ";
//    String L = "loading ";
//
//    final void ETL() {
//        System.out.println(L + T + E);
//    };
//}
//
//class B extends A {
//    void ETL() {                        // can't override a final method  -->  compile time error
//        System.out.println(E + T + L);
//    }
//}
//
//public class Main22 {
//    public static void main(String args[]) {
//        A obj = new B();
//        obj.ETL();
//    }
//}