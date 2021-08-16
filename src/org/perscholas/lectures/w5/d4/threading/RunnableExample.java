package org.perscholas.lectures.w5.d4.threading;



public class RunnableExample implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println(name + " , " + e.getMessage());
            return;
        }
        System.out.println("Hello from runnable land");
    }
}

class Runner {
    public static void main(String[] args) {
        RunnableExample re = new RunnableExample();
        Thread thread1 = new Thread(re);
        thread1.start();
//        System.out.println(thread1.getName());
//        System.out.println(thread1);

        System.out.println(thread1.getName() + " " + thread1.getState());


        RunnableExample re2 = new RunnableExample();
        Thread thread2 = new Thread(re2);
        thread2.start();
        thread1.interrupt();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getName() + " " + thread1.getState());

    }
}