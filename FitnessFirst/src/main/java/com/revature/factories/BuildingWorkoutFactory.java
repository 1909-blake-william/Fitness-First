package com.revature.factories;

import com.revature.fbeans.AssignedBuildingExercise;
import com.revature.fbeans.BuildingWorkoutFormat;
import com.revature.models.Workout;
;

public class BuildingWorkoutFactory extends Workout {
	AssignedBuildingExercise aE = new AssignedBuildingExercise();
	
	public AssignedBuildingExercise a1() {
		// TODO Auto-generated method stub
		return aE;
	}

	
	public AssignedBuildingExercise a2() {
		// TODO Auto-generated method stub
		return aE;
	}

	
	public AssignedBuildingExercise a3() {
		// TODO Auto-generated method stub
		return aE;
	}

	
	public AssignedBuildingExercise a4() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public String toString() {
		return "BuildingWorkout [a1()=" + a1() + ", a2()=" + a2() + ", a3()=" + a3() + ", a4()=" + a4() + "]";
	}



}
