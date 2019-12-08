package com.revature.daos;

import java.util.List;

import com.revature.daoSQLs.ExerciseDaoSQL;
import com.revature.models.Exercise;

public interface ExerciseDao {
	
	ExerciseDao currentImplementation = new ExerciseDaoSQL();

	List<Exercise> findAll();
	
	List<Exercise> filterByExerciseType(int exerciseType);
	
	List<Exercise> filterByMuscle(int Muscle);
	
	List<Exercise> filterForBeginnerUB();
	List<Exercise> filterForBeginnerLB();
 	
	List<Exercise> filterForIntermediateUB();
	List<Exercise> filterForIntermediateLB();
	
	List<Exercise> filterForAdvancedUB();
	List<Exercise> filterForAdvancedLB();
	
	
}
