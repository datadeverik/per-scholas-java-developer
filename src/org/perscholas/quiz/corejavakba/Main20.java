//// I thought the output would be sdlc apparently there's a compile time error (see below)
////
//// /Users/erikanderson/IdeaProjects/perscholas-corejava-exercises-variables/src/org/perscholas/quiz/corejavakba/Main22.java:34:32
//// java: sdlc has private access in org.perscholas.quiz.corejavakba.B
//
//// this one is confusing...
//
//
//package org.perscholas.quiz.corejavakba;
//
//class A {
//    String sdlc[] = {
//            "requirement analysis",
//            "design",
//            "development",
//            "testing",
//            "implementation",
//            "maintenance"
//    };
//}
//class B extends A {
//    private String sdlc[] = {
//            "r",
//            "d",
//            "d",
//            "t",
//            "i",
//            "m"
//    };
//}
//class C extends B {
//    String sdlc[] = {
//            "s",
//            "d",
//            "l",
//            "c"
//    };
//}
//public class Main20 {
//    public static void main(String args[]) {
//        B obj = new C();
//        for (int i = 0; i < obj.sdlc.length;  // 'sdlc' has private access in 'org.perscholas.quiz.corejavakba.B'
//
//             i++) {
//            System.out.print(obj.sdlc[i] + "");
//        }
//    }
//}