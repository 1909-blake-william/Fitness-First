package com.revature.fbeans;


import com.revature.factories.BuildingWorkout;

public interface BuildingWorkoutFormat {
	BuildingWorkoutFormat currentImplementation = new BuildingWorkout();


	public AssignedBuildingExercise a1(); 
	
	public AssignedBuildingExercise a2(); 
	

	public AssignedBuildingExercise a3(); 

	public AssignedBuildingExercise a4(); 
	

	}


