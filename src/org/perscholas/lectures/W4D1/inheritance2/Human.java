package org.perscholas.lectures.W4D1.inheritance2;

public class Human extends LivingThing{
    String occupation;

    public Human(String name, int age, int height, String occupation) {
        super(name, age, height);
        this.occupation = occupation;
    }

    public void speak() {
        System.out.println("Hello");
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
