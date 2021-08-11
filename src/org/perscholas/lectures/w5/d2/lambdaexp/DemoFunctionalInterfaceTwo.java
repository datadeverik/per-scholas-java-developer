package org.perscholas.lectures.w5.d2.lambdaexp;


public class DemoFunctionalInterfaceTwo {

    HumanInterface h = new HumanInterface() {
        @Override
        public void say(int i) {
            String msg = "Hello it's me, overriding";
            System.out.println(msg);
        }
    };

    SqRoot sq = new SqRoot() {
        @Override
        public double findSqRoot(int a) {
            double d = Math.sqrt(a);
            return d; // can write any business logic here.
        }
    };

//    public void say() {
//        String msg = "Hello Human";
//        System.out.println(msg);
//    }
}
