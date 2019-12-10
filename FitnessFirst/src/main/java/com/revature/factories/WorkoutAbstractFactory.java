package com.revature.factories;

import com.revature.fbeans.Workout;

public interface WorkoutAbstractFactory<T> {

	 Workout createWorkout(String userChoice);
}
