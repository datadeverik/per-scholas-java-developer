package org.perscholas.lectures.w5.d3.stringbuffer;

public class Main {
    public static void main(String[] args) {
        System.out.println("String Buffer Demo");

        StringBuffer sb = new StringBuffer();
        sb.append(1);
        sb.append("hello");
        sb.append(3.4f);
        sb.append('-');
        sb.append(5.0);
        sb.append(true);
        sb.append(12345L);
        System.out.println("Print the string buffer");
        System.out.println(sb);
        System.out.println("Delete the '-' and some following characters");
        sb.delete(sb.indexOf("-"), sb.indexOf("-") + 6);
        System.out.println(sb);
        System.out.println("reverse the string buffer");
        sb.reverse();
        System.out.println(sb);


    }
}
