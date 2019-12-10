package com.revature.fitnessfirstservlet;

public interface ExerciseDao {
	
	ExerciseDao currentImplementation = new ExerciseDaoImpl();
	
	int updatePoint();
	
	int increaseDifficulty();
	
	int decreaseDifficulty();
	
	int updateUser();
	
	String findByExerciseType(int eType);
	
	String findByExerciseName(String eName);
	
}
