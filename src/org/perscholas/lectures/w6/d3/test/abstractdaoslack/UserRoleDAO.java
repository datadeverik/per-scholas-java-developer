package org.perscholas.lectures.w6.d3.test.abstractdaoslack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRoleDAO extends AbstractDAO{

    public UserRoleObject getUserRoleByUserId(int id) {
        PreparedStatement prestmt = null;
        ResultSet resultSet = null;

        UserRoleObject userRoleObject = new UserRoleObject();

        try {
            String sql = "SELECT * FROM user_roles where user_id = ?";
            System.out.println(sql);

            prestmt = createPreparedStatement(sql);

            prestmt.setInt(1, id);

            resultSet = prestmt.executeQuery();
            // extract data
            resultSet.next();
            userRoleObject.setId(resultSet.getInt("id"));
            userRoleObject.setUser_id(resultSet.getInt("user_id"));
            userRoleObject.setUser_role(resultSet.getString("user_role"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return userRoleObject;
    }
}
