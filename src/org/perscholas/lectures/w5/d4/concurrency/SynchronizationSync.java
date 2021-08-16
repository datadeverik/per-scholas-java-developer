package org.perscholas.lectures.w5.d4.concurrency;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizationSync extends Thread {

    private static AtomicInteger counter = new AtomicInteger(0);
    static ArrayList<String> results = new ArrayList<>();



    @Override
    public void run() {
        mySleep();
        while (counter.get() < 10) {  // Operator '<' cannot be applied to 'java.util.concurrent.atomic.AtomicInteger', 'int'
            synchronized (counter) {

                mySleep();
                results.add(Thread.currentThread().getName() + " counter-before: " + counter.get() + "\n");
                mySleep();
                counter.getAndIncrement();
                mySleep();
                results.add(Thread.currentThread().getName() + " counter-after: " + counter.get() + "\n");
                mySleep();
            }
            mySleep();
//        System.out.println(Thread.currentThread().getName() + " exit ");
            results.add(Thread.currentThread().getName() + " exit ");
        }
    }
    private void mySleep() {
        try {
            sleep(10*(int)(Math.random() * 2 ) + 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public SynchronizationSync(String name) {
        super(name);
    }


    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0 ; i < threads.length ; i++ ) {
            threads[i] = new SynchronizationSync("Thread-number-" + i);
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
        System.out.println(results);
        System.out.println("final count: " + counter.get());
//        for (String s : results) {
//            System.out.println(s);
//
//        }
    }
}
