package org.perscholas.lectures.W4D1.encapsulation;

public class Service {
    Animal animal = new Animal();
    public void AnimalServices() {

        animal.setAnimalName("Barkin' Bob");

    }

    public void printName() {

        System.out.println(animal.getAnimalName());
    }
}
