package org.perscholas.lectures.w5.d2.lambdaexp;



public class DemoFunctionalInterface implements HumanInterface {

    public void say(int x) {
        String msg = "Hello Human";
        System.out.println(msg);
    }
}
