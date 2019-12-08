package com.revature.tests;

import com.revature.daos.ExerciseDao;

public class TestDriver {

	private static ExerciseDao justWork = ExerciseDao.currentImplementation;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.out.println(justWork.findAll() + "do something");


	}

}
