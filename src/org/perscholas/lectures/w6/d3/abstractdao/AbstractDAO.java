//package org.perscholas.lectures.w6.d3.abstractdao;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.sql.*;
//import java.util.Scanner;
//
//public abstract class AbstractDAO {
//    private static final String IP_ADDRESS = "localhost";
//    private static final String SCHEMA = "case_study";
//    private static final String DB_USER = "root";
//    //    private static final String DB_PASSWORD = passwd;
//    public Connection createConnection() throws SQLException {
//        Connection conn = null;
//
//        String passwd = null;
//        {
//            try {
//                File file = new File("env/passwords.txt");
//                Scanner scn;
//                scn = new Scanner(file);
//                passwd = scn.nextLine();
//                passwd = passwd.trim();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//
//
//            conn = DriverManager.getConnection("jdbc:mysql://" + IP_ADDRESS + ":3306/" + SCHEMA, DB_USER, passwd);
//
//
//        }
//
//    return conn;
//    }
//
//    public PreparedStatement preparedStatement(String sql) throws SQLException {
//
//
//    }
//
//    public void closeConnection(Connection conn, PreparedStatement stmt, ResultSet resultSet) {
//
//        try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//        } catch (SQLException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        } finally {
//            try {
//                if (stmt != null) {
//                    stmt.close();
//                }
//            } catch (SQLException e1) {
//                // TODO Auto-generated catch block
//                e1.printStackTrace();
//            } finally {
//                try {
//                    if (conn != null) {
//                        conn.close();
//                    }
//                } catch (SQLException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    }
//}
