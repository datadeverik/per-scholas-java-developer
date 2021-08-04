package org.perscholas.lectures.W4D1.inheritance2;

public class Runner {
    public static void main(String[] args) {
        Human h = new Human("Bob", 35, 5, "Java Developer");
        System.out.println(h.getAge());
        System.out.println(h.getOccupation());
        h.speak();
        Cat c = new Cat("Mr. Business", 4, 1, "Sleep");
        System.out.println(c.getAge());
        System.out.println(c.getPastime());
        c.makeNoise();
        System.out.print("is c a cat? ");
        System.out.println(c instanceof Cat);
        System.out.print("is c a living thing? ");
        System.out.println(c instanceof LivingThing);
        System.out.print("is c a human? ");
//        System.out.println(c instanceof Human);  // why can't this be done?
    }
}
