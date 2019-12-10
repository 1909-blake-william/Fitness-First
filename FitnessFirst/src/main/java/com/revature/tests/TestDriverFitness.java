package com.revature.tests;

import com.revature.daos.ExerciseDao;
import com.revature.factories.CuttingWorkout;
import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.models.Exercise;

public class TestDriverFitness {

	
	public static void main(String[] args) {
//	Workout builderW = WorkoutFactory.	
		// TODO Auto-generated method stub
		ExerciseDao justWork = ExerciseDao.currentImplementation;
		CuttingWorkout cW = new CuttingWorkout();
		AssignedCuttingExercise aE = new AssignedCuttingExercise();
		//System.out.println(justWork.filterForBeginnerUB());
		
	//	System.out.println(justWork.filter1ForBeginnerLB());

	//	System.out.println(cW.a1());
//System.out.println(aE);
		
		System.out.println(cW);
	}

}
