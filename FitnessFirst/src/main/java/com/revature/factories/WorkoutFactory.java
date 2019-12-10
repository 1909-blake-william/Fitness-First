package com.revature.factories;

import com.revature.fbeans.BuilderWorkout;
import com.revature.fbeans.Workout;

public class WorkoutFactory implements WorkoutAbstractFactory<Workout> {

	@Override
	public Workout createWorkout(String userChoice) {
		if ("Build".equalsIgnoreCase(userChoice)) {
			return new BuilderWorkout();
		}else if ("Cut".equalsIgnoreCase(userChoice)) {
			return new CuttingWorkout();
		}
	
	return null;
}
}