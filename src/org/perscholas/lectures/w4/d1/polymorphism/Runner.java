package org.perscholas.lectures.w4.d1.polymorphism;

public class Runner {
    public static void main(String[] args) {

        Circle c = new Circle(100);
        System.out.println(c.findArea());
        Rectangle r = new Rectangle(10, 20);
        System.out.println(r.findArea());
        Shape shape = new Shape();
        shape.setHeight(40);
        shape.setWidth(50);
        System.out.println(r.findArea());
    }
}
