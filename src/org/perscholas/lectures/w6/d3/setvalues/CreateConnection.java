package org.perscholas.lectures.w6.d3.setvalues;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateConnection { // code from Eric // I called this SetValuesEric


    public List<User> getUsers() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        List<User> users = new ArrayList<>();
        try {
            // loads the JDBC driver for Mysql / Maria DB
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // crates connection using a connection URL

            // EKA
            File file = new File("env/passwords.txt");
            Scanner scn = new Scanner(file);
            String passwd = scn.nextLine();
            passwd = passwd.trim();
            conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/case_study","root",passwd);
            // EKA

            // Eric
//            conn = DriverManager.getConnection("jdbc:mysql://192.168.2.100:3306/database_review", "dev", "ultra30dev");
            //Eric

            // crating a statement which we will run SQL
            stmt = conn.createStatement();
            // run an SQL statement and capture the result set
            resultSet = stmt.executeQuery("SELECT * FROM users");
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
    public static void main(String[] args) {
        List<User> users = new CreateConnection().getUsers();

        for ( User user : users ) {
            System.out.println(user);
        }
        System.out.println("Connection success");
    }
}