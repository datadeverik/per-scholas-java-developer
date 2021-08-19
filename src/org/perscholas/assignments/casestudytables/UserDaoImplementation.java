package org.perscholas.assignments.casestudytables;

import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplementation extends AbstractDAO implements UserDaoInterface {

    @Override
    public User getUserById(Integer id) {
        String sql;
        sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement prestmt = null;
        ResultSet resultSet = null;
        User user = new User();
        try {
            prestmt = createPreparedStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prestmt.setInt(1, id);
            resultSet = prestmt.executeQuery();
            resultSet.next();
            getUserDetailsFromResultSet(resultSet, user);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    private void getUserDetailsFromResultSet(ResultSet resultSet, User user) throws SQLException {

        user.setId(resultSet.getInt("id"));
        user.setEmail(resultSet.getString("email"));
        user.setFullName(resultSet.getString("full_name"));
        user.setAddressLine1(resultSet.getString("address_line1"));
        user.setAddressLine2(resultSet.getString("address_line2"));
        user.setCity(resultSet.getString("city"));
        user.setState(resultSet.getString("state"));
        user.setZip(resultSet.getString("zip"));
        user.setPhone(resultSet.getString("phone"));
    }

    @Override
    public User getUserByEmail(String email) {
        String sql;
        sql = "SELECT * FROM users WHERE email = ?";
        PreparedStatement prestmt = null;
        ResultSet resultSet = null;
        User user = new User();
        try {
            prestmt = createPreparedStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            assert prestmt != null;
            prestmt.setString(1, email);
            resultSet = prestmt.executeQuery();
            resultSet.next();
            getUserDetailsFromResultSet(resultSet, user);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public ArrayList<User> getAllUsers() {
        String sql;
        sql = "SELECT * FROM users";
        PreparedStatement prestmt = null;
        ResultSet resultSet = null;
        ArrayList<User> userList = new ArrayList<User>();
        try {
            prestmt = createPreparedStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            resultSet = prestmt.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                getUserDetailsFromResultSet(resultSet, user);

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
}
