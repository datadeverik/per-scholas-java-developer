package org.perscholas.lectures.W4D1.inheritance2;

public class Cat extends LivingThing{
    String pastime;

    public void makeNoise() {
        System.out.println("Meow");
    }

    public Cat(String name, int age, int height, String pastime) {
        super(name, age, height);
        this.pastime = pastime;
    }

    public String getPastime() {
        return pastime;
    }

    public void setPastime(String pastime) {
        this.pastime = pastime;
    }
}
