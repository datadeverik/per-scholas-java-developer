package org.perscholas.lectures.w4.d1.polymorphism;

public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double findArea() {
        // return this area
        super.area = this.width * this.height;
        return area;
    }

}
