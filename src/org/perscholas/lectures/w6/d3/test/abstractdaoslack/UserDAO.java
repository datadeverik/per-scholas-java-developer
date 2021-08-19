package org.perscholas.lectures.w6.d3.test.abstractdaoslack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAO {

	public List<User> getUserByName(String name) {
		PreparedStatement stmt = null;
		ResultSet resultSet = null;

		List<User> users = new ArrayList<>();

		try {		
			// run an SQL statement and capture the result set
			// select * from users where full_name = 'Eric Heilig';
			String sql = "SELECT * FROM users where full_name = ?";
			System.out.println(sql);

			stmt = createPreparedStatement(sql);
								
			// conn.createStatement();
			stmt.setString(1, name);

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
			
			resultSet.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

		return users;
	}

}
