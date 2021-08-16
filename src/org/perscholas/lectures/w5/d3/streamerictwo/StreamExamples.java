package org.perscholas.lectures.w5.d3.streamerictwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamExamples {
    public static void filterExample() {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        stringList.stream()
                .filter((s) -> s.startsWith("T"))
                .forEach(s -> {
                    System.out.println(s);
                });
        System.out.println("=============");
        for (String current : stringList) {
            if (current.startsWith("T")) {
                System.out.println(current);
            }
        }
        System.out.println("=============");
        String arr[] = { "Buttercup", "Blossom", "Bubbles" };
        Stream.of(arr)
                .forEach(x -> x.toLowerCase());
    }
    public static void filterSortExample() {
        List<String> arr = new ArrayList<String>();
        arr.add("Apple");
        arr.add("AMango");
        arr.add("AGuava");
        arr.add("Orange");
        arr.add("Peach");
        arr.stream()
                .forEach(x -> x.toLowerCase());
//		arr.stream()
//				.filter(x -> x.startsWith("A"))
//				.sorted()
//				.forEach(x -> System.out.println(x));
        arr.stream()
                .filter(x -> {
                    System.out.println(" --- " + x);
                    return x.startsWith("A");
                })
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x));
        System.out.println("=========");
        List<String> filterdSorted = arr.stream()
                .filter(x -> {
                    System.out.println(" === " + x);
                    return x.startsWith("A");
                })
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        filterdSorted.stream()
                .forEach(x -> System.out.println(x));
        System.out.println(filterdSorted.toString());
    }
    public static void sortUser() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Jeff", 25));
        users.add(new User("Bob", 30));
        users.add(new User("Finn", 7));
        users.add(new User("Jeff", 40));
        HashMap<String, User> userMap = new HashMap<>();
        for (User user : users) {
            userMap.put(user.getName(), user);
            System.out.println("##################### " + user);
        }
        User usr = userMap.get("Jeff");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! " + usr);
        users.stream()
                .sorted(Comparator.comparing(User::getName))
                .forEach(u -> System.out.println(u));
    }
    public static void mapExample() {
        // TODO Auto-generated method stub
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("haseeb");
        stringList.add("perscholas");
        stringList.add("teksystem");
        stringList.add("question");
        stringList.add("qwhy");
        stringList.add("qstrange");
        stringList.stream()
                .filter(value -> {
                    System.out.println("filter:" + value + " = " + value.startsWith("Q"));
                    return value.startsWith("q");
                })
                .map((value) -> {
                    System.out.println("map:" + value);
                    return value.toUpperCase();
                })
                // .sorted()
                .forEach(value -> {
                    System.out.println("foreach " + value);
                });
        System.out.println("IN HERE 1");
        Set<String> map = stringList.stream()
                .map((value) -> {
                    System.out.println("map:" + value);
                    return value.toUpperCase();
                })
                .collect(Collectors.toSet());
        System.out.println("IN HERE2");
        map.stream()
                .filter(value -> {
                    System.out.println("filter:" + value + " = " + value.startsWith("Q"));
                    return value.startsWith("Q");
                })
                .sorted()
                .forEach(value -> {
                    System.out.println("foreach " + value);
                });
        System.out.println("IN HERE 3");
    }
    public static void skipExample() {
        Integer arr[] = { 10, 1, 3, 5, 11, 7, 9, 2, 4, 6, 8 };
        Arrays.stream(arr)
                .skip(2) // 3, 5, 11, 7, 9, 2, 4, 6, 8
                .sorted() // 2, 3, 4, 5, 6, 7, 8, 9, 11
                .skip(2) // 4, 5, 6, 7, 8, 9, 11
                .forEach(x -> System.out.println(x));
    }
    public static void reduceExample() {
        //List<Double> arr = Arrays.asList(5.0, 2.0, 5.0);
        Double arr[] = { 5.0, 2.0,5.0};

        //List<Double> arr = Arrays.asList();
        double total = Stream.of(arr)
                .reduce(1.0, (Double a, Double b) -> a * b);
        System.out.println("Total = " + total);
        DoubleStream stream1 = DoubleStream.of();
        Double avg = stream1.average()
                .orElse(0.0);
        System.out.println(avg);
        double avg2;
//        IntStream stream2 = IntStream.of();
//        OptionalDouble obj = stream2.average();
//        if (obj.isEmpty()) {
//            avg2 = 0.0;
//        } else {
//            avg2 = obj.getAsDouble();
////        }
//        System.out.println(avg2);
    }
    public static void main(String[] args) {
        // StreamExamples.filterExample();
        // StreamExamples.filterSortExample();
        // StreamExamples.sortUser();
        // StreamExamples.mapExample();
        // StreamExamples.skipExample();
        StreamExamples.reduceExample();
    }
}