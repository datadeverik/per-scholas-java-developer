package org.perscholas.lectures.w5.d4.haseebdemofixed;

public class CustomThread extends Thread{
    ClassWithLoop d = new ClassWithLoop();

    public CustomThread()
    {
        super();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub


        //d.displayloop_two();
        //d.printNumber();
        try {
            d.printNumbers();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}