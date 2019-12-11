package com.revature.tests;

import com.revature.daos.ExerciseDao;
import com.revature.daos.WorkoutDao;
import com.revature.factories.BuildingWorkoutFactory;
import com.revature.factories.CuttingWorkoutFactory;

import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.models.ExerciseSets;
import com.revature.models.Reps;
import com.revature.models.User;


public class TestDriverFitness {

	
	public static void main(String[] args) {
//	Workout builderW = WorkoutFactory.	
		// TODO Auto-generated method stub
	//	ExerciseDao justWork = ExerciseDao.currentImplementation;
		CuttingWorkoutFactory cW = new CuttingWorkoutFactory();
	//	ExerciseSets eS = new ExerciseSets();
		//AssignedCuttingExercise aE = new AssignedCuttingExercise();
	//	Reps r = new Reps();
		//WorkoutFactory theFactory = new WorkoutFactory();
	//	User user = User.getInstance();
		//System.out.println(justWork.filterForBeginnerUB());
		BuildingWorkoutFactory bW = new BuildingWorkoutFactory();
	//	System.out.println(justWork.filter1ForBeginnerLB());

	//	System.out.println(cW.a1());
//System.out.println(aE);
		WorkoutDao work = WorkoutDao.currentImplementation;
	//	System.out.println(cW);
	//	System.out.println(eS);
	//	System.out.println(r);
		System.out.println(work.createWorkout(1));
	//	System.out.println(theFactory.createCuttingWorkout("Cut"));
	}

}
