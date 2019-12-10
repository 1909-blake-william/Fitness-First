package com.revature.factories;

import com.revature.fbeans.BuildingWorkoutFormat;
import com.revature.fbeans.CuttingWorkoutFormat;

public class WorkoutFactory implements WorkoutAbstractFactory {
	BuildingWorkoutFormat bW = BuildingWorkoutFormat.currentImplementation;
	CuttingWorkoutFormat cW = CuttingWorkoutFormat.currentImplementation;
	@Override
	public CuttingWorkoutFormat createCuttingWorkout(String userChoice) {
		// TODO Auto-generated method stub
		return cW;
	}

	@Override
	public BuildingWorkoutFormat createBuildingWorkout(String userChoice) {
		// TODO Auto-generated method stub
		return bW;
	}

	@Override
	public BuildingWorkoutFormat createBuildingWorkout() {
		// TODO Auto-generated method stub
		return bW;
	}

	@Override
	public CuttingWorkoutFormat createCuttingWorkout() {
		// TODO Auto-generated method stub
		return cW;
	}

	
	

}