package com.revature.fbeans;

import java.util.List;
import com.revature.models.Exercise;
import com.revature.models.Reps;
import com.revature.models.Sets;

public interface Workout {

	List<Exercise> assignedExercise();
	
	Sets assignedSets();
	
	Reps assignedReps();
}
