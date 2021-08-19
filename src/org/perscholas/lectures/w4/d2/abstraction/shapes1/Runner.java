package org.perscholas.lectures.w4.d2.abstraction.shapes1;

public class Runner {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle area: " + c.area());
        Rectangle r = new Rectangle(3, 7);
        System.out.println("Rectangle area: " + r.area());

    }


}
