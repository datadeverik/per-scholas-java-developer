package org.perscholas.assignments.oop.manager;

public class Manager extends Employee{
    public Manager(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
    @Override
    public double calculateTransportAllowance() {
        return 15.0/100*basicSalary;
    }
}
