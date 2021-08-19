package org.perscholas.lectures.w6.d3.abstractdao2;

//import com.mysql.jdbc.Driver;

import com.mysql.cj.jdbc.Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
import java.util.Scanner;

/**
 * Connect to Database
 * @author hany.said
 */
public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/case_study";
    public static final String USER = "root";
//    public static final String PASS = "testpass";

    /**
     * Get a connection to database
     * @return Connection object
     */
    public static Connection getConnection()
    {
        File passwordFile = new File("env/passwords.txt");
        Scanner passwordScanner = null;
        try {
            passwordScanner = new Scanner(passwordFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String passwd = passwordScanner.next();
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, passwd);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }

    /**
     * Test Connection
     */
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
    }

}