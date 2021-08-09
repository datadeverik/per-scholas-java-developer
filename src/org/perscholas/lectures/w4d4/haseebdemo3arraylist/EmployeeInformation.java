package org.perscholas.lectures.w4d4.haseebdemo3arraylist;

import java.util.ArrayList;

public class EmployeeInformation {

    public void setEmployeeInfo(int[] id, String[] name, int[] age) {
        ArrayList<Employee> empList = new ArrayList<>();

        for (int i = 0; i < id.length; i++) {
            Employee empObj = new Employee();

            empObj.setId(id[i]);
            empObj.setAge(age[i]);
            empObj.setEmpName(name[i]);

            empList.add(empObj);
        }


        for (Employee emp : empList) {
            System.out.print(emp.getAge() + " ");
            System.out.print(emp.getId()+ " ");
            System.out.print(emp.getEmpName() + "\n");
        }
    }
}
