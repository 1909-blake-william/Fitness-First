package com.revature.fbeans;


	import java.util.List;
	import com.revature.models.Exercise;
	import com.revature.models.ExerciseSets;
	import com.revature.models.Reps;


	public interface AssignedExercise {

		Exercise filteredExercise();
		//FIND A WAY TO FIND BY SQL INDEX
				//MAKE SURE YOU CAN FILTER
				// THEN USE RANDOM NUMBER TO PICK ONE
		
		
		ExerciseSets assignedSets();
		
		Reps assignedReps();
	}
