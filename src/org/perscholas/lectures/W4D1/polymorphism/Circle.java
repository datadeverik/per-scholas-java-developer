package org.perscholas.lectures.W4D1.polymorphism;

public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        // return this area
        super.area = PI * radius * radius;
        return area;
    }
}
