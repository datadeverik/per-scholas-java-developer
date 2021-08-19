package org.perscholas.lectures.w6.d3.test.abstractdaoslack;

import java.util.List;

public class AbstractDAOExample {
	
	public static void main(String[] args) {
		UserRoleObject userRoleObject = new UserRoleDAO().getUserRoleByUserId(1);
		System.out.println(userRoleObject);

	}

	

}