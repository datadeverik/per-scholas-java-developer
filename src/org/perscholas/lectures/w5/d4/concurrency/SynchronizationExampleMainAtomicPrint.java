package org.perscholas.lectures.w5.d4.concurrency;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizationExampleMainAtomicPrint extends Thread {

    private static AtomicInteger counter = new AtomicInteger(0);
    static ArrayList<String> results = new ArrayList<>();



    @Override
    public void run() {
        while (counter.get() < 10) {  // Operator '<' cannot be applied to 'java.util.concurrent.atomic.AtomicInteger', 'int'
//            results.add(Thread.currentThread().getName() + " counter-before: " + counter.get() + "\n");
//            try {
//                sleep(500*(int)(Math.random() * 2 ) + 1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(Thread.currentThread().getName() + " counter-before: " + counter.get());
            System.out.flush();

            counter.getAndIncrement();

//            results.add(Thread.currentThread().getName() + " counter-after: " + counter.get() + "\n");
            System.out.println(Thread.currentThread().getName() + " counter-after: " + counter.get());
            System.out.flush();
//            try {
//                sleep(10*(int)(Math.random() * 2 ) + 1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(Thread.currentThread().getName() + " exit ");
    }

    public SynchronizationExampleMainAtomicPrint(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[15];
        for (int i = 0 ; i < threads.length ; i++ ) {
            threads[i] = new SynchronizationExampleMainAtomicPrint("Thread-number-" + i);
            threads[i].start();
        }
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
//        System.out.println(results);
//        for (String s : results) {
//            System.out.println(s);
//
//        }
    }
}
