package com.revature.factories;

import com.revature.fbeans.BuildingWorkoutFormat;
import com.revature.fbeans.CuttingWorkoutFormat;
import com.revature.models.User;

public abstract class WorkoutFactory {// implements WorkoutAbstractFactory {
	BuildingWorkoutFormat bW = BuildingWorkoutFormat.currentImplementation;
	CuttingWorkoutFormat cW = CuttingWorkoutFormat.currentImplementation;
	private User user = User.getInstance();
	BuildingWorkoutPlanFactory bWF = new BuildingWorkoutPlanFactory();
	CuttingWorkoutPlanFactory cWF = new CuttingWorkoutPlanFactory();
	
	
	WorkoutFactory getChoice(int choice) {

		if (user.getUserChoice() == 1) {
			return bWF;
		} else {
			return cWF;
		}
	}
}

//	WorkoutFactory getCuttingWorkoutFactory() {
//		CuttingWorkoutFactory cWF = new CuttingWorkoutFactory();
//		return cWF;
//	}
//
//	WorkoutFactory getBuildingWorkoutFactory() {
//		BuildingWorkoutFactory bWF = new BuildingWorkoutFactory();
//		return bWF;
//	}
//	//
////	
////	public WorkoutFactory createCuttingWorkout(String userChoice) {
////		// TODO Auto-generated method stub
////		return (WorkoutFactory) cW;
////	}
////
////	public BuildingWorkoutFormat createBuildingWorkout(String userChoice) {
////		// TODO Auto-generated method stub
////		return bW;
////	}
////
////	public BuildingWorkoutFormat createBuildingWorkout() {
////		// TODO Auto-generated method stub
////		return bW;
////	}
////
////	public CuttingWorkoutFormat createCuttingWorkout() {
////		// TODO Auto-generated method stub
////		return cW;
////	}
////
////	public WorkoutFactory getDecision(String choice) {
////		if (choice.equals("Build") ) {
////			return (WorkoutFactory) createBuildingWorkout();
////		} else
////		return (WorkoutFactory) createCuttingWorkout();
////	}
////
////	
////
////	
////	
////}
//}
