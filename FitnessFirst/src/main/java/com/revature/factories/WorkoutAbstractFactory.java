package com.revature.factories;

import com.revature.fbeans.BuildingWorkoutFormat;
import com.revature.fbeans.CuttingWorkoutFormat;

public interface WorkoutAbstractFactory<T> {

	 CuttingWorkoutFormat createCuttingWorkout(String userChoice);
	 
	 BuildingWorkoutFormat createBuildingWorkout(String userChoice);

	BuildingWorkoutFormat createBuildingWorkout();
	
	CuttingWorkoutFormat createCuttingWorkout();
}
