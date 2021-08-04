package org.perscholas.lectures.w4d2.abstraction.shapes1;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double area() {
        return 3.14 * radius * radius;
    }

    @Override
    protected double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    protected double volume() {
        return 0;
    }
}
