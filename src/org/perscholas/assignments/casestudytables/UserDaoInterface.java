package org.perscholas.assignments.casestudytables;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface UserDaoInterface {
    User getUserById(Integer id);
    User getUserByEmail(String email);
    ArrayList<User> getAllUsers();



}
