package org.perscholas.lectures.w6.d3.abstractdaoslack;

import java.util.List;

public class AbstractDAOExample {
	
	public static void main(String[] args) {
		List<User> users = new UserDAO().getUserByName("Erik Anderson");

		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("Connection success");
	}

	

}