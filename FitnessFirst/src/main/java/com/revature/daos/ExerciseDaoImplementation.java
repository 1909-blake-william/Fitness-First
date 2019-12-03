package com.revature.daos;

import java.sql.Connection;

import com.revature.models.Exercise;

public class ExerciseDaoImplementation implements ExerciseDao {
	private Connection connection;

	public ExerciseDaoImplementation(Connection connection) {
		this.connection = connection;
	}

	public int increaseIntensity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int decreaseIntensity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateLastLogin() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Exercise findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
