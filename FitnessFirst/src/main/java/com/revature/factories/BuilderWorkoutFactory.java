package com.revature.factories;

import com.revature.fbeans.BuilderWorkout;
import com.revature.fbeans.Workout;

public class BuilderWorkoutFactory implements WorkoutAbstractFactory {

	@Override
	public Workout createWorkout() {
		// TODO Auto-generated method stub
		return new BuilderWorkout();
	}

}
