// I made a simple mistake. I thought the answer would be
// extraction1transformation2loading3
// actually the answer was
// EXTRACTION1TRANSFORMATION2LOADING3
// I mistook E + T + L for E, T, L
// That's kind of annoying

package org.perscholas.quiz.corejavakba;


class A {

    void ETL() {
        String E = "mySQL";
        String T = "Sqoop";
        String L = "hdfs";
        System.out.println(E + T + L);
    };

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }
    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }
}

public class Main18 {

    public static void main(String args[]) {
        String E = "extraction1";
        String T = "transformation2";
        String L = "loading3";

        A obj = new A();
        obj.ETL(E + T + L);
    }
}