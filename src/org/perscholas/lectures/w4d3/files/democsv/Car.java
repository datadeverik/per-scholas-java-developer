package org.perscholas.lectures.w4d3.files.democsv;

public class Car {

    String name;
    String mpg;
    String Cylinders;
    String Displacement;
    String Horsepower;
    String Weight;
    String Acceleration;
    String Model;
    String Origin;

    public Car(String name, String mpg, String cylinders, String displacement, String horsepower, String weight, String acceleration, String model, String origin) {
        this.name = name;
        this.mpg = mpg;
        Cylinders = cylinders;
        Displacement = displacement;
        Horsepower = horsepower;
        Weight = weight;
        Acceleration = acceleration;
        Model = model;
        Origin = origin;
    }
    public Car(String[] params) {
        this.name = params[0];
        this.mpg = params[1];
        Cylinders = params[2];
        Displacement = params[3];
        Horsepower = params[4];
        Weight = params[5];
        Acceleration = params[6];
        Model = params[7];
        Origin = params[8];


    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mpg='" + mpg + '\'' +
                ", Cylinders='" + Cylinders + '\'' +
                ", Displacement='" + Displacement + '\'' +
                ", Horsepower='" + Horsepower + '\'' +
                ", Weight='" + Weight + '\'' +
                ", Acceleration='" + Acceleration + '\'' +
                ", Model='" + Model + '\'' +
                ", Origin='" + Origin + '\'' +
                '}';
    }
}
