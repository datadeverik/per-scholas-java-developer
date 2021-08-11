package org.perscholas.lectures.w5.d2.lambdaexp.demo3;

public interface ConcatDemo {
    String sConCat(String a, String b);

    default void abc() {
        System.out.println("I am void");
    }

}
