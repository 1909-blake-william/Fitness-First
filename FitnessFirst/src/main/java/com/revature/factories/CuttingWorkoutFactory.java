package com.revature.factories;

import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.fbeans.CuttingWorkoutFormat;
import com.revature.models.Workout;

public class CuttingWorkoutFactory extends Workout {

AssignedCuttingExercise aE = new AssignedCuttingExercise();	
	

	public AssignedCuttingExercise a1() {
		
		return aE;
	}

	
	public AssignedCuttingExercise a2() {
		// TODO Auto-generated method stub
		return aE;
	}

	
	public AssignedCuttingExercise a3() {
		// TODO Auto-generated method stub
		return aE;
	}

	
	public AssignedCuttingExercise a4() {
		// TODO Auto-generated method stub
		return aE;
	}

	@Override
	public String toString() {
		return "CuttingWorkout [a1()=" + a1() + ", a2()=" + a2() + ", a3()=" + a3() + ", a4()=" + a4() + "]";
	}



}
