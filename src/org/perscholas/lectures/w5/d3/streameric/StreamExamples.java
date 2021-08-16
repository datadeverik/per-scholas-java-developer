package org.perscholas.lectures.w5.d3.streameric;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void filterExample() {
        ArrayList<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        stringList.stream()
                .filter((s) -> s.startsWith("O"))
                .forEach((s) -> System.out.println(s));
        System.out.println(stringList); // the original list is unchanged

    }

    public static void filterSortExample() {
        System.out.println("================");

        String[] arr = { "Buttercup", "Blossom", "Bubbles", "Spruce", "Spike", "Sprocket" };
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Buttercup");
        arr2.add("Blossom");
        arr2.add("Bubbles");
        arr2.add("Spruce");
        arr2.add("Spike");
        arr2.add("Sprocket");
        Stream.of(arr)
                .forEach(x -> x.toLowerCase()); // this neither modifies the array nor outputs anything

        System.out.println("Filter: starts with B");
        Stream.of(arr)
                .filter(x -> x.startsWith("B"))
                .sorted()
                .forEach(x -> System.out.println(x));
        System.out.println("Filter: starts with S");
        Stream.of(arr)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(x -> System.out.println(x));
        System.out.println("==Long Way==");
        // long way
        Iterator<String> i = arr2.iterator();
        while (i.hasNext()) {
            String current = i.next();
            if (current.startsWith("B")) {
                System.out.println(current);
            } else {
                i.remove();
            }
        }
        System.out.println(arr2);

        System.out.println("==Something else==");
        List<String> arr3 = new ArrayList<>();
        arr3.add("Apple");
        arr3.add("AGuava");
        arr3.add("AMango");
        arr3.add("Orange");
        arr3.add("Peach");

        arr3.stream()
                .filter(x -> x.startsWith("A"))
                .sorted(Comparator.reverseOrder())
                .forEach(x -> System.out.println(x));  // calculated in memory, printed, and thrown away

        System.out.println("==Collecting==");
        List<String> filteredSorted = arr3.stream()
                .filter(x -> x.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredSorted);

    }

    private static void userExample() {
        System.out.println("Users Example");
        ArrayList<User> users = new ArrayList<>();
        User u1 = new User("Jeff", 25);
        User u2 = new User("Bob", 30);
        User u3 = new User("Joey", 33);
        User u4 = new User("Finn", 7);
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        System.out.println("Sorted by age");
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedUsers);
        System.out.println("Sored by age reversed");
        List<User> reverseSortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(reverseSortedUsers);
    }

    private static void mapExample() {
//        Set<String> map
    }

    public static void main(String[] args) {
        filterExample();
        filterSortExample();
        userExample();
        mapExample();

    }




}
