package org.perscholas.lectures.W4D1.encapsulation;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Create Gus");
        Animal gus = new Animal("Gus");
        System.out.println("Create animal with no parameters");
        Animal default_animal = new Animal();
        System.out.println("gus.getAnimalName(): " + gus.getAnimalName());
        System.out.println("default_animal.getAnimalName(): " + default_animal.getAnimalName());
        System.out.println();
        Service servObj = new Service();
        servObj.AnimalServices(); // creates and prints and animal

        Animal obj1 = new Animal();
        System.out.println(obj1.getAnimalName()); // null

    }
}

/* In encapsulation, the variables of a class will be hidden from other classes
 * and can be accessed only through the methods of their current class.
 * Therefore, it is also known as data hiding.
 * or
 * A process that binds together the data and functions that manipulate the data
 * and that keeps both safe
 * from outside interference and misuse.
 * To achieve encapsulation in Java -
 * Declare the variables of a class as private
 * Provide public setter and getter methods to modify
 * and view the variable's values
 */