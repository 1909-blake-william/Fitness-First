package com.revature.factories;

import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.fbeans.CuttingWorkoutFormat;

public class CuttingWorkoutFactory implements CuttingWorkoutFormat {

AssignedCuttingExercise aE = new AssignedCuttingExercise();	
	
	@Override
	public AssignedCuttingExercise a1() {
		
		return aE;
	}

	@Override
	public AssignedCuttingExercise a2() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public AssignedCuttingExercise a3() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public AssignedCuttingExercise a4() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public String toString() {
		return "CuttingWorkout [a1()=" + a1() + ", a2()=" + a2() + ", a3()=" + a3() + ", a4()=" + a4() + "]";
	}



}
