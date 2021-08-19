package org.perscholas.lectures.w4.d3.exceptions.demo1;

public class arrayException {

    public static void main(String[] args) {
        String[] st = {"abc", "xyz", "efg"};
        try {
            System.out.println("hello29583 ");
            st[5] = "asdf"; // cannot set element at this
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Hello 92845");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Hello 57685");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("NumberFormatException Thrown");
            System.out.println(e.getMessage());
        }

    }
}
