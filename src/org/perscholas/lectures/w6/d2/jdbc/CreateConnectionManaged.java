package org.perscholas.lectures.w6.d2.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateConnectionManaged {
    public static void main(String[] args) {
        try {

            File file = new File("env/passwords.txt");
            Scanner scn = new Scanner(file);
            String passwd = scn.nextLine();
            passwd = passwd.trim();
            Connection conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/case_study","root",passwd);
            Statement stmt = conn.createStatement();


            ResultSet rs = stmt.executeQuery("SELECT * FROM users");


            while ( rs.next() ) {
                System.out.println("id = " + rs.getInt("id") + " email = " + rs.getString("email"));
            }
        } catch (Exception e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }
}
