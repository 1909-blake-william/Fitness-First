package com.revature.fbeans;

import com.revature.models.Exercise;

public interface AssignedExercise {

	Exercise filteredExercise();

	int assignedSets();

	int assignedReps();

}