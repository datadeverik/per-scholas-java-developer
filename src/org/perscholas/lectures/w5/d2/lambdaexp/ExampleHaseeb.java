package org.perscholas.lectures.w5.d2.lambdaexp;

public class ExampleHaseeb {
    public static void main(String[] args) {
        MyInterfaceTwo b1 = (x) -> {return x; };
        System.out.println(b1.say("Hello Chicago"));

        MyInterfaceTwo b2 = (x) -> x;
        System.out.println(b1.say("Hello Chicago"));

        MyInterfaceTwo b3 = (x) ->  x + " Good afternoon" ;
        System.out.println(b3.say("Hello Chicago"));

        SqRoot s = z -> Math.sqrt(z);

        SqRoot s1 = z -> {
            double y = Math.sqrt(z);
            double c =  y + 1000.0;
            return c;
        };



        System.out.println(s.findSqRoot(100));
    }
}
