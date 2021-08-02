package org.perscholas.lectures.W4D1.encapsulation;

public class Animal {
    // Encapsulation: make all class level variables private (or protected)
    private String animalName;
    private String animalType;

    private int height;
    private String color;
    // protected allows subclasses to access the variable

    // Constructors
    public Animal() {
        this.height = 20;
    }

    public Animal(String animalName, String animalType, int height, String color) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.height = height;
        this.color = color;

    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
