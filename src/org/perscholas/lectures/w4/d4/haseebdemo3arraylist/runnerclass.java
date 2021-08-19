package org.perscholas.lectures.w4.d4.haseebdemo3arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class runnerclass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // ARraylist duplicate value and null is allow
        // Collection comes from Util Package

        ArrayList a1 = new ArrayList();
        a1.add("Haseeb");
        a1.add(2);
        a1.add(20.36);
        a1.add(true);

        System.out.println(a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Perscholas");
        a2.add("Teksystem");
        a2.add("New York");

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1);
        a3.add(2);

        // Arrays class : provide shortcut for initialzing an elements to Arraylist

        List ListOne =   Arrays.asList(1,"haseeb",2.36);
        List<Integer> ListTwo = Arrays.asList(1,2,3,4,5,6);

        for(Integer showElement: ListTwo)
        {
            System.out.println(showElement);
        }

        // Travering list hrough iterator

        Iterator itr =   ListTwo.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ArrayList<Integer> listThree = new ArrayList<>();
        listThree.addAll(ListTwo);

        System.out.println(listThree);

        ArrayList<Integer> ListFive = new ArrayList<>();

        // List<String> ListFour =   Arrays.asList("100","200","300","400");
        ArrayList<Integer> listFour = new ArrayList<>();
        listFour.add(100);
        listFour.add(200);
        listFour.add(300);
        //addAll() we can not join or  copy elements from list with/to list
        //addAll() we can copy or join arraylist with / to list
        listFour.addAll(ListTwo);
        System.out.println(listFour);

        List<String> Student =  Arrays.asList("Haseeb", "Joseph", "Ferhat", "Sangeeta", "Sumeo");
        List<String> StuList = new ArrayList(Student);

        //animal a = new Dog();

        //Student.addAll(StuList) ;
        System.out.println(Student.contains("haseeb"));
        System.out.println(Student.indexOf("Sangeeta"));
        System.out.println(Student.get(2));
        System.out.println(Student.size());

        System.out.println("================After removing===============");

        StuList.remove(1);
        StuList.remove("Ferhat");
        System.out.println(StuList);


        System.out.println(StuList.size());


        ArrayList<Employee> emp = new ArrayList<Employee>();

        Employee e1 = new Employee(101, "haseeb", 60);
        Employee e2 = new Employee(102, "joseph", 20);
        Employee e3 = new Employee(103, "Keith", 20);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        Iterator itrs =  emp.iterator();

        while(itrs.hasNext())
        {
            Employee e = (Employee)itrs.next();
            System.out.println(e.getAge() +" " + e.getEmpName() + " "+ e.getId() );

        }

        EmployeeInformation empInfoObj = new EmployeeInformation();

//        empInfoObj.setEmployeeInfo(101,"Haseeb", 60);
        System.out.println("===Hello 28957===");
        int[] ids = {101, 102, 103, 104, 105};
        int[] ages = {25, 36, 26, 21, 54};
        String[] names = {"abc", "xyz", "efg", "xyzz", "MNO"};
        empInfoObj.setEmployeeInfo(ids, names, ages);

    }
}