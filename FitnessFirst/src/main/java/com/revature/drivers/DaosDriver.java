package com.revature.drivers;

import com.revature.daos.UserDaoImplementation;

public class DaosDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDaoImplementation test = new UserDaoImplementation();
		System.out.println(test.findByUsername("admin"));
	}

}
