package org.perscholas.lectures.w4.d3.files.democsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("resources/cars.csv");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            Car car = new Car(sc.nextLine().split(","));
            System.out.println(car);
        }




    }


}
