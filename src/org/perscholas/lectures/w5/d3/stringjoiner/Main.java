package org.perscholas.lectures.w5.d3.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Advanced String manipulation");
        // aside: apache has a string utils library
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("Hello");
        sj1.add("World");
        sj1.add("From");
        sj1.add("String");
        sj1.add("Joiner");
        sj1.add("Land");

        System.out.println(sj1);

        StringJoiner sj2 = new StringJoiner("-", "[", "]");
        sj2.add("Hello");
        sj2.add("World");
        sj2.add("From");
        sj2.add("String");
        sj2.add("Joiner");
        sj2.add("Land");

        System.out.println(sj2);

        List<String> myList = Arrays.asList("London", "Paris", "NewYork", "France");
        String joined = String.join(":", myList);
        System.out.println(joined);

        System.out.println("Useful for best practice csv export, like this:");
        StringJoiner sj3 = new StringJoiner("\",\"", "\"", "\"");
        sj3.add("Hello");
        sj3.add("World");
        sj3.add("From");
        sj3.add("String");
        sj3.add("Joiner");
        sj3.add("Land");
        System.out.println(sj3);

        System.out.println("Merge sj2 and sj1");
        System.out.println(sj2.merge(sj1));
        System.out.println("check sj1");
        System.out.println(sj1);
        System.out.println("check sj2");
        System.out.println(sj2);
        System.out.println("merge sj1 and sj2");
        System.out.println(sj1.merge(sj2));
        System.out.println("check sj1");
        System.out.println(sj1);
        System.out.println("check sj2");
        System.out.println(sj2);


    }
}
