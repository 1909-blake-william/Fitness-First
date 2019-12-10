package com.revature.factories;

import com.revature.fbeans.AssignedBuildingExercise;
import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.fbeans.BuildingWorkoutFormat;
;

public class BuildingWorkout implements BuildingWorkoutFormat {
	AssignedBuildingExercise aE = new AssignedBuildingExercise();
	@Override
	public AssignedBuildingExercise a1() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public AssignedBuildingExercise a2() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public AssignedBuildingExercise a3() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public AssignedBuildingExercise a4() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public String toString() {
		return "BuildingWorkout [a1()=" + a1() + ", a2()=" + a2() + ", a3()=" + a3() + ", a4()=" + a4() + "]";
	}



}
