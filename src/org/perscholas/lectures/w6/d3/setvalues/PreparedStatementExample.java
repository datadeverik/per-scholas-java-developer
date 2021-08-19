package org.perscholas.lectures.w6.d3.setvalues;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreparedStatementExample {


    private static final String IP_ADDRESS = "localhost";
    private static final String SCHEMA = "case_study";
    private static final String DB_USER = "root";
//    private static final String DB_PASSWORD = passwd;
    public static void main(String[] args) {

        List<User> users = new PreparedStatementExample().getUserByName("Erik Anderson");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("Connection success");
    }
    public List<User> getUserByName(String name) {

        File file = new File("env/passwords.txt");
        Scanner scn;
        String passwd = null;
        {
            try {
                scn = new Scanner(file);
                passwd = scn.nextLine();
                passwd = passwd.trim();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList<>();
        try {
            // loads the JDBC driver for Mysql / Maria DB
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // crates connection using a connection URL
            conn = DriverManager.getConnection("jdbc:mysql://" + IP_ADDRESS + ":3306/" + SCHEMA, DB_USER, passwd);
            // crating a statement which we will run SQL

            // run an SQL statement and capture the result set
            // select * from users where full_name = 'Eric Heilig';
            String queryName = "Erik Anderson; drop table userss";
            String sql = "SELECT * FROM users where full_name = ?";  // optional add "and id = ? "
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, queryName);
            // stmt.setString(2, id);
            System.out.println(sql);
            resultSet = stmt.executeQuery();

            // parse result set
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFullName(resultSet.getString("full_name"));
                user.setAddressLine1(resultSet.getString("address_line1"));
                user.setAddressLine2(resultSet.getString("address_line2"));
                user.setCity(resultSet.getString("city"));
                user.setState(resultSet.getString("state"));
                user.setZip(resultSet.getString("zip"));
                user.setPhone(resultSet.getString("phone"));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
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
        return users;
    }
}