package com.revature.factories;



public class CuttingWorkoutPlanFactory extends WorkoutFactory {
	CuttingWorkoutFactory cW = new CuttingWorkoutFactory();	
	
	CuttingWorkoutFactory aC1() {
		return cW;
}
	CuttingWorkoutFactory aC2() {
		return cW;
}
	CuttingWorkoutFactory aC3() {
	return cW;
}
}