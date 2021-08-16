package org.perscholas.lectures.w5.d4.threading;

public class ExtendsThread extends Thread {
    @Override
    public void run() {
        int time = (int) (Math.random() *3) + 1;
        try {
            sleep(1000 * time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
            return;
        }
        String name = Thread.currentThread().getName();
        System.out.println("Hello from thread land! My name is " + name + ". I paused for " + time +  " + seconds.");


    }

    public static void main(String[] args) {
        ExtendsThread et1 = new ExtendsThread();
        et1.setName("TestThread1");
        et1.start();  // intelliJ says "probably run should be replaced by start"

        ExtendsThread et2 = new ExtendsThread();
        et2.setName("TestThread2");
        et2.start();

        System.out.println("et1 state: " + et1.getState());
        et1.interrupt(); // interrupt the thread
        try {
            sleep(500); // makes main sleep
            // et1.join() is another option here
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("et1 state: " + et1.getState());
    }
}
