package com.revature.tests;

import com.revature.daos.ExerciseDao;
import com.revature.models.Exercise;

public class TestDriverFitness {

	
	public static void main(String[] args) {
//	Workout builderW = WorkoutFactory.	
		// TODO Auto-generated method stub
		ExerciseDao justWork = ExerciseDao.currentImplementation;
		
		//System.out.println(justWork.filterForBeginnerUB());
		
		System.out.println(justWork.filter1ForBeginnerLB());


	}

}
