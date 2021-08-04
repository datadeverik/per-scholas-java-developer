package org.perscholas.lectures.w4d2.abstraction.shapes1;

public class Square extends Shape {
    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    protected double area() {
        return width * width;
    }

    @Override
    protected double perimeter() {
        return 4 * width;
    }

    @Override
    protected double volume() {
        return 0;
    }
}
