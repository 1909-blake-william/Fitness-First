package com.revature.factories;

import com.revature.fbeans.AssignedCuttingExercise;
import com.revature.fbeans.Workout;
import com.revature.fbeans.AssignedCuttingExercise;
public class CuttingWorkout implements Workout {

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
		return "CuttingWorkout [aE=" + aE + ", a1()=" + a1() + ", a2()=" + a2() + ", a3()=" + a3() + ", a4()=" + a4()
				+ "]";
	}

}
