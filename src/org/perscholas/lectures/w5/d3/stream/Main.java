package org.perscholas.lectures.w5.d3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stream");
        System.out.println("Sources: array, collection, generator function, an I/O channel, API and etc");
        System.out.println("Intermediate operations: filter, peek, distinct...");
        System.out.println("Terminal operations: anyMatch, min, max, toArray()");
        System.out.println("intermediate operations return stream; terminal operations return something else");
        System.out.println("Create empty stream");
        Stream<Integer> empStream = Stream.empty();
        System.out.println("Stream.of method");
        Stream<Integer> myIntStream = Stream.of(1, 2, 3, 4, 5, 6, 7);  // autofill: Stream.of(T... values)
        Stream myUndecidedStream = Stream.of ("3", 1, '5', 1.9f, 12345L, null);  // not using type safety
        // Eric: in general you want to avoid putting a bunch of different kinds of objects in one thing/list/array/whatever
        // That's because if various things could be in your structure/whatever, you need to check and handle the various types
        System.out.println("Make arrayStream from an array of Integers");
        Integer[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> arrayStream = Stream.of(myIntArray);
        System.out.println("use for each");
        arrayStream.forEach(a -> {System.out.println(a);});
        //Stream.of(myarr) and Array.stream(myarr) do the same thing.

        System.out.println("Try this: just do <List>.forEach()");
        List<String> myListOne = Arrays.asList("Haseeb", "Jenny", "Jack", "Fink");
        myListOne.forEach(a-> System.out.println(a));

        List<String> myListTwo = Arrays.asList("Haseeb", "Jenny", "Jack", "Fink");
        Stream<String> st = myListTwo.stream();
        System.out.println("On using streams: they reduce lines of code, but they are often harder to read");
        ArrayList<Integer> myListThree = new ArrayList<>();
        myListThree.add(111);
        myListThree.add(222);
        myListThree.add(333);
        myListThree.add(444);
        System.out.println("myList.Three.forEach");
        myListThree.forEach(p-> System.out.println(p));
        Stream<Integer> myIntStreamThree = myListThree.stream();
        System.out.println("myIntStreamThree.forEach");
        myIntStreamThree.forEach( p -> {System.out.println(p);});

        System.out.println("myListThree.stream().forEach()");
        myListThree.stream().forEach(p-> System.out.println(p));
        System.out.println("myListThree.stream().filter(p->p==222).forEach()");
        myListThree.stream().filter(p->p>=333).forEach(p-> System.out.println(p));
//        myListThree.filter()  // can't do this, but IntelliJ suggests myListThree.stream().filter();
        System.out.println("***");
        System.out.println("Don't mix an I/O stream with a util stream");
        System.out.println("instead, save the result of the I/O to some kind of collection, then feed that thing into the util stream");
        System.out.println("***");

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("One flew over the cuku's nest");
        stringList.add("To kill a mockingbird");
        stringList.add("Gone with the wind");
        System.out.println(stringList);
        System.out.println("Do all the strings start with 'O'?");
        boolean resultBooleanOne = stringList.stream().allMatch( p -> p.startsWith("O"));
        System.out.println(resultBooleanOne);
        System.out.println("Does at least one of the strings start with 'O'?");
        boolean resultBooleanTwo = stringList.stream().anyMatch( p -> p.startsWith("O"));
        System.out.println(resultBooleanTwo);

        System.out.println();
        System.out.println("Use collect to get from a stream back to a List (or other collection)");
        List<String> givenList = Arrays.asList("1", "2", "3", "4", "5", "6");
        Stream<String> givenStream = givenList.stream();
        List<String> backToList = givenStream.collect(Collectors.toList());




    }
}
