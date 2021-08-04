package org.perscholas.assignments.oop.manager;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    Long employeePhone;
    double basicSalary;
    double specialAllowance = 25.080;
    double hra = 10.50;


    public Employee(long id, String name, String address, Long phone) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
    }

    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
        return salary;

    }

    public double calculateTransportAllowance() {
        double transportAllowance = 10.0/100*basicSalary;
        return transportAllowance;
    }
}
