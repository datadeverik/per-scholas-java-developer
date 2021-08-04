package org.perscholas.assignments.oop.manager;

public class InheritanceActivity {

    public static void main(String[] args) {
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844L, 65000);
        System.out.println("Calculated Salary of Manager Peter");
        System.out.println(m.calculateSalary());
        Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000);
        System.out.println("Calculated Salary of Trainee Jack");
        System.out.println(t.calculateSalary());
        System.out.println("transport allowance for Jack");
        System.out.println(t.calculateTransportAllowance());
        System.out.println("transport allowance for Peter");
        System.out.println(m.calculateTransportAllowance());



    }
}
