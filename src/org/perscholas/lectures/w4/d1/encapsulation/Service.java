package org.perscholas.lectures.w4.d1.encapsulation;

public class Service {
    Animal animal = new Animal();
    public void AnimalServices() {

        animal.setAnimalName("Barkin' Bob");

    }

    public void printName() {

        System.out.println(animal.getAnimalName());
    }
}
