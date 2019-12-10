package com.revature.fbeans;


import com.revature.factories.CuttingWorkout;

public interface CuttingWorkoutFormat {
	CuttingWorkoutFormat currentImplementation = new CuttingWorkout();
	AssignedCuttingExercise a1();
	AssignedCuttingExercise a2();
	AssignedCuttingExercise a3();
	AssignedCuttingExercise a4();
	
}
