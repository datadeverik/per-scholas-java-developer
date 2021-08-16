package org.perscholas.lectures.w5.d4.concurrency;

import java.util.ArrayList;

public class SynchronizationExampleMain extends Thread {

    private static int counter = 0;
    static ArrayList<String> results = new ArrayList<>();



    @Override
    public void run() {
        while (counter < 10) {
            try {
                sleep(500*(int)(Math.random() * 2 ) + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            results.add(Thread.currentThread().getName() + " counter-before: " + counter + "\n");
//            System.out.println(Thread.currentThread().getName() + " counter-before: " + counter);
//            System.out.flush();
            counter = counter + 1;
            try {
                sleep(500*(int)(Math.random() * 2 ) + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            results.add(Thread.currentThread().getName() + " counter-after: " + counter + "\n");
//            System.out.println(Thread.currentThread().getName() + " counter-after: " + counter);
//            System.out.flush();
        }
        System.out.println(Thread.currentThread().getName() + " exit ");
    }

    public SynchronizationExampleMain(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[15];
        for (int i = 0 ; i < threads.length ; i++ ) {
            threads[i] = new SynchronizationExampleMain("Thread-number-" + i);
            threads[i].start();
        }
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        System.out.println("========");
        try {
            sleep(3000);
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
    }
}
