//package org.perscholas.lectures.w6.d3.abstractdao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.util.List;
//
//public class UserDAO extends AbstractDAO {
//
//    public List<User> getUserByName(String name, Connection conn) {
//
//        PreparedStatement stmt = conn.PrepareStatement;
//        String sql = "SELECT * FROM users where full_name = ? and id = ?";
//        stmt = conn.prepareStatement(sql);
//        stmt.setString(1, name);
//        stmt.setInt(2, id);
//        System.out.println(sql);
//        resultSet = stmt.executeQuery();
//
//        // parse result set
//        while (resultSet.next()) {
//            org.perscholas.lectures.w6.d3.setvalues.User user = new org.perscholas.lectures.w6.d3.setvalues.User();
//            user.setId(resultSet.getInt("id"));
//            user.setEmail(resultSet.getString("email"));
//            user.setFullName(resultSet.getString("full_name"));
//            user.setAddressLine1(resultSet.getString("address_line1"));
//            user.setAddressLine2(resultSet.getString("address_line2"));
//            user.setCity(resultSet.getString("city"));
//            user.setState(resultSet.getString("state"));
//            user.setZip(resultSet.getString("zip"));
//            user.setPhone(resultSet.getString("phone"));
//            users.add(user);
//        }
//    }
//}
