package org.perscholas.assignments.casestudytables;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = null;
        System.out.println("getUserById(1)");
        user = new UserDaoImplementation().getUserById(1);
        System.out.println(user);

        System.out.println("getUserByEmail");
        user = new UserDaoImplementation().getUserByEmail("foo@fake.com");
        System.out.println(user);

        System.out.println("Get All Users");
        ArrayList<User> users = new UserDaoImplementation().getAllUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }

}
