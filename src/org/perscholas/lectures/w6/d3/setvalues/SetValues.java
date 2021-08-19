package org.perscholas.lectures.w6.d3.setvalues;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetValues {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<User> userList = new ArrayList<User>();

        try {
            // loads the JDBC driver for Mysql / Maria DB
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // crates connection using a connection URL

            File file = new File("env/passwords.txt");
            Scanner scn = new Scanner(file);
            String passwd = scn.nextLine();
            passwd = passwd.trim();
            conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/case_study","root",passwd);            // crating a statement which we will run SQL
            stmt = conn.createStatement();
            // run an SQL statement and capture the result set
            rs = stmt.executeQuery("SELECT * FROM users");
            //
            while (rs.next()) {
                User currentUser = new User();
                userList.add(currentUser);
                currentUser.setId(rs.getInt("id"));
                currentUser.setEmail(rs.getString("email"));
                currentUser.setFullName(rs.getString("full_name"));
                currentUser.setCity(rs.getString("city"));
                currentUser.setState(rs.getString("state"));



//                System.out.println("id = " + rs.getInt("id") + " email = " + rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } finally {
                    try {
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
//        System.out.println("Connection success");
    for (User user : userList) {
        System.out.println(user);
    }
    }
}