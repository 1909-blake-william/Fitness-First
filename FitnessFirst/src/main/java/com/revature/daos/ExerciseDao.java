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
	
	Exercise filter1ForBeginnerUB();
	Exercise filter1ForBeginnerLB();
	
	Exercise filter1ForIntermediateUB();
	Exercise filter1ForIntermediateLB();
	
	Exercise filter1ForAdvancedUB();
	Exercise filter1ForAdvancedLB();
	
	
}
