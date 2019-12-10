package com.revature.factories;

public class BuildingWorkoutPlanFactory extends WorkoutFactory {
	BuildingWorkoutFactory bW = new BuildingWorkoutFactory();	
	
	BuildingWorkoutFactory aC1() {
		return bW;
}
	BuildingWorkoutFactory aC2() {
		return bW;
}
	BuildingWorkoutFactory aC3() {
	return bW;
}
}