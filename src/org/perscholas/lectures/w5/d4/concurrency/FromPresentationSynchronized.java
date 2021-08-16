package org.perscholas.lectures.w5.d4.concurrency;

public class FromPresentationSynchronized extends Thread{
    private static int counter = 0;
    public void run() {
        while(counter < 10) {
            mySleep(1);
            synchronized (FromPresentationSynchronized.class) {


                System.out.println("[" + Thread.currentThread().getName() + "] before: " + counter);
                counter++;
                System.out.println("[" + Thread.currentThread().getName() + "] after: " + counter);
            }
        }
    }

    public static void main(String[] args) {
        FromPresentationSynchronized[] syncs = new FromPresentationSynchronized[15];
        for (int i = 0 ; i < syncs.length; i++) {
            syncs[i] = new FromPresentationSynchronized();
        }
        for (int i = 0 ; i < syncs.length; i++) {
            syncs[i].start();
        }
        mySleep(10);
        System.out.println("final " + counter);
    }
    static void mySleep(int seconds) {
        try {
            sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

