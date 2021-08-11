package org.perscholas.lectures.w5.d2.lambdaexp.demo3;

import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        ConcatDemo a = (x, y) -> x + "_" + y;
        System.out.println(a.sConCat("foo", "bar"));

        ConcatDemo st = (x, y) -> x.toLowerCase() + y.toUpperCase();
        String result = st.sConCat("asdf", "jkl;");
        System.out.println(result);

        MathOperation multi = (c, bb) -> c * bb;
        double result3 = multi.manipulateTwoNumbers(10.45, 10.34);
        System.out.println(result3);
    }
}
