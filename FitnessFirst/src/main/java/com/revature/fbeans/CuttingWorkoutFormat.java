package com.revature.fbeans;


import com.revature.factories.CuttingWorkoutFactory;

public interface CuttingWorkoutFormat {
	CuttingWorkoutFormat currentImplementation = new CuttingWorkoutFactory();
	AssignedCuttingExercise a1();
	AssignedCuttingExercise a2();
	AssignedCuttingExercise a3();
	AssignedCuttingExercise a4();
	
}
