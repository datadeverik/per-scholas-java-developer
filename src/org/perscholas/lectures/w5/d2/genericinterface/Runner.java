package org.perscholas.lectures.w5.d2.genericinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        System.out.println(c.compareTwoVar.compare(12, 2));

        System.out.println(c.compareTwoString.compare("abd", "def"));

        Predicate<Integer> pr = (n) -> n < 18;
        boolean resultPr = pr.test(20);
        System.out.println(resultPr);

        Predicate<String> st = (n) -> n.charAt(0) == 'a';
        boolean resultPrTwo = st.test("fasdf");
        System.out.println(resultPrTwo);

        List<String> names = Arrays.asList("haseeb", "eric", "joseph", "john", "jay", "jeny");
        Predicate<String> findName = (n) -> n.startsWith("h");
        for (String s : names) {
            if(findName.test(s)) {
                System.out.println(s);
            }
        }

        System.out.println("=====Consumer=====");
        Consumer<Integer> say = (x) -> System.out.println(x);
        say.accept(100);

        Consumer<Integer> adding = (x) -> {
            int b = x + 200;
            System.out.println(b);
        };
        adding.accept(100);

        Consumer<String> con = (x) -> System.out.println(x.toUpperCase());
        con.accept("teksystem");

        System.out.println("==== supplier ====");
        Supplier<String> sup = () -> "return me";
        String result = sup.get();
        System.out.println(result);

        Supplier<Double> randN = () -> Math.random() * 100;
        System.out.println(randN.get());

    }
}
