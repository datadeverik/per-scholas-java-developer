package org.perscholas.assignments.oop.manager;

public class Trainee extends Employee{
    public Trainee(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
}
