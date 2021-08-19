package org.perscholas.lectures.w4.d1.polymorphism;

public class Shape {
    protected double area = 1.0;
    protected double base;
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Shape() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
