package com.revature.tests;

import com.revature.daos.ExerciseDao;
import com.revature.factories.CuttingWorkout;
import com.revature.factories.WorkoutFactory;
import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.models.ExerciseSets;
import com.revature.models.Reps;


public class TestDriverFitness {

	
	public static void main(String[] args) {
//	Workout builderW = WorkoutFactory.	
		// TODO Auto-generated method stub
		ExerciseDao justWork = ExerciseDao.currentImplementation;
		CuttingWorkout cW = new CuttingWorkout();
		ExerciseSets eS = new ExerciseSets();
		AssignedCuttingExercise aE = new AssignedCuttingExercise();
		Reps r = new Reps();
		WorkoutFactory theFactory = new WorkoutFactory();
		//System.out.println(justWork.filterForBeginnerUB());
		
	//	System.out.println(justWork.filter1ForBeginnerLB());

	//	System.out.println(cW.a1());
//System.out.println(aE);
		
	//	System.out.println(cW);
	//	System.out.println(eS);
	//	System.out.println(r);
		
		System.out.println(theFactory.createBuildingWorkout());
	}

}
