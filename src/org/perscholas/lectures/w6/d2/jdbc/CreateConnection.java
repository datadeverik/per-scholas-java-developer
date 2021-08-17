package org.perscholas.lectures.w6.d2.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateConnection {
    public static void main(String[] args) {
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            File file = new File("env/passwords.txt");
            Scanner scn = new Scanner(file);
            String passwd = scn.nextLine();
            passwd = passwd.trim();
            dataSource.setPassword(passwd);
            dataSource.setServerName("localhost");
            Connection conn = dataSource.getConnection();

            Statement stmt = conn.createStatement();
            stmt.executeQuery("use case_study");

            ResultSet rs = stmt.executeQuery("Select * from user_roles");
            System.out.println("rs.toString()");
            System.out.println(rs.toString());
//            System.out.println(rs.next());
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
//            System.out.println(rs.getArray(1));
//            System.out.println(dataSource.getDescription());
//            System.out.println(dataSource.getDatabaseName());
        } catch (Exception e){
            System.out.println("oops");
            e.printStackTrace();
        }
        }
}
