package org.perscholas.lectures.w4.d2.abstraction.shapes1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double area() {
        return width * height;
    }

    @Override
    protected double perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    protected double volume() {
        return 0;
    }
}
