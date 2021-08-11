package org.perscholas.lectures.w5.d1.collections;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsDemosAndMap {

    public static void main(String[] args) {
        System.out.println("Queues");
        System.out.println("FIFO");
        System.out.println("Queue is an interface in Java");
        System.out.println("Can be implemented by LinkedList, ArrayDeque");

        queueFn();
        linkedList();
        System.out.println("For storing and accessing data, ArrayList is better,\n but " +
                "for data manipulation, LinkedList is better");
        setDemo();
        queueDemo();
        mapDemo();

    }



    private static void queueFn() {
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue q4 = new LinkedList();       // "raw use of parameterized class"
        LinkedList q3 = new LinkedList();

        Queue<String> Pq0 = new PriorityQueue<String>();
        Queue<Integer> pq1 = new PriorityQueue<Integer>();

        q2.add(100); // throws an exception if failed
        q2.add(10);
        q2.add(104);
        q2.add(94);
        q2.add(307);

        q2.offer(84); // returns false if failed
        q2.offer(3);
        q2.offer(1);

        System.out.println(q2);
        System.out.println("size: " + q2.size());
        System.out.println("Head: " + q2.peek());
        // poll returns and removes the head of the queue, or null if queue is empty
        System.out.println(q2.poll());
        System.out.println(q2.peek());
        // remove method. throws exception
        System.out.println(q2.remove() + " is removed");
        // priority queue class provides the functionality to the heap data strucure. Unlike
        // normal queue, priority queue elements are retrieved in sorted order

        // Queue<String> pq0 from above
        pq1.add(11);
        pq1.add(2);
        pq1.add(10);
        pq1.add(9);
        pq1.add(4);

        System.out.println("Priority Queue " + pq1);

        // peek() method to check the head of the queue
        System.out.println("Head --> " + pq1.peek());

        System.out.println("poll current Head and delete: " + pq1.poll());
        System.out.println("poll current Head and delete: " + pq1.poll());
        System.out.println("poll current Head and delete: " + pq1.poll());
        System.out.println("poll current Head and delete: " + pq1.poll());

    }

    private static void linkedList() {
        System.out.println("A linked list is a data structure with objects and pointers to the next");
        System.out.println("See wikipedia on linkedlist if you are curious to know more");

        /*
linked list. Each element has memory addresses of the previous and next item used internally.
  A linked list is a linear collection of data elements whose order is not given by their physical
 placement in memory. Instead, each element points to the next element. Its  data structure consisting
 of a collection of nodes which together represent a sequence.  each node contains: data, and
  a reference (in other words, a link) to the next node in the sequence.
In a  linked list', each node contains, besides the next-node link, a second link field pointing to the
 'previous' node in the sequence. The two links may be called 'forward('s') and 'backwards', or 'next' and 'prev'('previous').

         */

        LinkedList listOne = new LinkedList();
        LinkedList<String> listTwo = new LinkedList<>();
        LinkedList<Integer> listThree = new LinkedList<>();
        // offer() and add() methods from Queue (interface)
        listTwo.add("A");
        listTwo.add("B");
        listTwo.add("C");
        listTwo.add("D");
        listTwo.add("E");
        listTwo.offer("F");
        listTwo.offer("G");

        System.out.println(listTwo);

        // set() method for override or replace any element
        listTwo.set(1, "BB");
        System.out.println(listTwo);
        System.out.println("size " + listTwo.size());

        System.out.println("element at position 5: " + listTwo.get(5));
        System.out.println("First element: " + listTwo.getFirst());
        System.out.println("Last element: " + listTwo.getLast());
        System.out.println("last index of C: " + listTwo.lastIndexOf("C"));

        System.out.println(listTwo);

        System.out.println("return true if removing element F: " + listTwo.remove("F"));
        System.out.println(listTwo);
        System.out.println("Removing last: " + listTwo.removeLast());
        System.out.println(listTwo);

        System.out.println("new LinkedList, empName");
        LinkedList<String> empName = new LinkedList<>();
        empName.add("Haseeb");
        empName.add("Joseph");
        empName.addAll(1, listTwo);
        System.out.println(empName);
        System.out.println("Iterator");
        Iterator<String> itr = empName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    private static void setDemo() {
        System.out.println();
        System.out.println("Set");
        System.out.println("No duplicate values");
        System.out.println("Classes: HashSet or TreeSet");
        Set<Integer> hashIntSet = new HashSet<>();
        Set<String> treeStringSet = new TreeSet<>();

        hashIntSet.add(5);
        hashIntSet.add(4);
        hashIntSet.add(3);
        hashIntSet.add(2);
        hashIntSet.add(5);
        System.out.println("hashIntSet: " + hashIntSet);

        Set<Integer> hashIntSet2 = new HashSet<>();
        hashIntSet2.add(1);
        hashIntSet2.add(7);
        hashIntSet2.addAll(hashIntSet);
        System.out.println("union of two sets: " + hashIntSet2);
        // HashSet does not enforce consistent ordering of elements
        // HashSet allows Null value (once). TreeSet does not allow null value
        HashSet<String> hashSetString = new HashSet<>();
        HashSet<Integer> hashSetInt = new HashSet<>();
        HashSet<Double> hashSetDouble = new HashSet<>();
        HashSet hashSetGeneral = new HashSet();

        hashSetGeneral.add(1);
        hashSetGeneral.add("Haseeb");
        System.out.println("hashSetGeneral " + hashSetGeneral);

        hashSetString.add("USA");
        hashSetString.add("UK");
        hashSetString.add("Australia");
        hashSetString.add("UAE");
        hashSetString.add(null);
        System.out.println(hashSetString);

        System.out.println("`hashSetString.contains(\"USA\")`: " + hashSetString.contains("USA"));

        System.out.println("=== Tree Set ===");
        TreeSet<String> treeSetString = new TreeSet<>();
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        TreeSet<Double> treeSetDouble = new TreeSet<>();

        treeSetString.add("usa");
        treeSetString.add("uk");
        treeSetString.add("canada");
        treeSetString.add("uae");
        treeSetString.add("usa");
//        treeSetString.add(null);  // not allowed to add null to TreeSet
        System.out.println(treeSetString);
    }

    private static void queueDemo() {
        System.out.println();
        System.out.println("Queue Demo");
        HashSet<Student> studentHashSet = new HashSet<>();

        Student studentObj1 = new Student("Keith", 121, "CS");

        studentHashSet.add(studentObj1);
        studentHashSet.add(new Student("Kyle", 122, "CYSEC"));
        studentHashSet.add(new Student("Bharty", 122, "CS"));
        studentHashSet.add(new Student("Haseeb", 122, "FUSTA"));
        studentHashSet.add(new Student("Wasin", 122, "IT"));
        studentHashSet.add(studentObj1);
        System.out.println(studentHashSet);
        for (Student s : studentHashSet) {
            System.out.println(s);
        }
    }

    private static void mapDemo() {
        System.out.println();
        System.out.println("Map is a mapping of Keys to Values. Keys are unique");
        System.out.println("Classes: HashTable, HashMap, TreeMap");
        // HashMap: not sorted. can have null key (once)
        // TreeMap: keys are sorted. cannot contain null key
        HashMap<Integer, String> hashMapOne = new HashMap<>();
        HashMap<String, Integer> hashMapTwo = new HashMap<>();
        HashMap<Integer, Integer> hashMapThree = new HashMap<>();

        hashMapOne.put(1, "PerScholas NewYork NY");
        hashMapOne.put(2, "PerScholas Chicago IL");
        hashMapOne.put(3, "PerScholas Atlanta GA");
        hashMapOne.put(4, "PerScholas Columbus OH");
        hashMapOne.put(1, "PerScholas Trenton NJ");
        hashMapOne.put(null, "Dallas, TX");
        hashMapOne.put(null, "Seattle, WA");
        hashMapOne.put(6, null);
        hashMapOne.put(7, null);
        System.out.println("size of hashMapOne: " + hashMapOne.size());

        System.out.println(hashMapOne);

        System.out.println("keySet: " + hashMapOne.keySet());
        System.out.println("values: " + hashMapOne.values());

        System.out.println("Displaying Key and value pairwise for each entry");
        for (Integer i : hashMapOne.keySet()) {
            System.out.print("Key: " + i + ": ");
            System.out.println("Value: " + hashMapOne.get(i));
        }
        System.out.println("Using entrySet");
        for (Entry<Integer, String> e : hashMapOne.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("====== TreeMap ======");
        System.out.println("Data will be sorted by key");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // could be <String, String> or <String, Integer> or ...
        treeMap.put(6, "NYC");
        treeMap.put(7, "Chicago");
        treeMap.put(8, "Atlanta");
        treeMap.put(9, "Carolina");
        treeMap.put(10, "Cotton");
        treeMap.put(11, "Gin");
        treeMap.put(12, "CAl");
        System.out.println(treeMap);
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.headMap(9, false));



    }


}
