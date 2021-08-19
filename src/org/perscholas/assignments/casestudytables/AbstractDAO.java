package org.perscholas.assignments.casestudytables;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class AbstractDAO {

	private static final String IP_ADDRESS = "localhost";
	private static final String SCHEMA = "case_study";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "myfakepasswd";

	private Connection connection = null;
	private PreparedStatement preparedStatement = null;

	public PreparedStatement createPreparedStatement(String sql) throws SQLException, FileNotFoundException {

		File file = new File("env/passwords.txt");
		Scanner scn = new Scanner(file);
		String passwd = scn.nextLine();
		passwd = passwd.trim();
		connection = DriverManager.getConnection("jdbc:mysql://" + IP_ADDRESS + ":3306/" + SCHEMA, DB_USER, passwd);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement = connection.prepareStatement(sql);

		return preparedStatement;
	}

	public void closeConnection() {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// create connection
	// prepare statement
	// execute query and get result set
	// parse result into objects
	// close connection and clean up

}
