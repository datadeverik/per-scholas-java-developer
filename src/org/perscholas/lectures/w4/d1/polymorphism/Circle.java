package org.perscholas.lectures.w4.d1.polymorphism;

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
