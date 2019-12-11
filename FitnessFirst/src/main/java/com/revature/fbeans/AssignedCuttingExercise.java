package com.revature.fbeans;

import com.revature.daos.ExerciseDao;
import com.revature.daos.UserDao;
import com.revature.models.Exercise;
import com.revature.models.ExerciseSets;
import com.revature.models.Reps;
import com.revature.models.User;

public class AssignedCuttingExercise implements AssignedExercise {
	ExerciseDao exerDao = ExerciseDao.currentImplementation;
	UserDao userD = UserDao.currentImplementation;
	private User user = User.getInstance();
	ExerciseSets exerSet = new ExerciseSets();
	Reps exerRep = new Reps();
	
	public Exercise filteredExercise() {
		if (user.getUserLevel() <= 3) {
			return exerDao.filter1ForBeginnerUB();

		} else if (user.getUserLevel() <= 6) {
			return exerDao.filter1ForIntermediateUB();
		} else if (user.getUserLevel() <= 10) {
			return exerDao.filter1ForAdvancedUB();
		}
		return null;
	}

	// FIND A WAY TO FIND BY SQL INDEX
	// MAKE SURE YOU CAN FILTER
	// THEN USE RANDOM NUMBER TO PICK ONE

	

	public int assignedSets() {
		if (user.getUserLevel() <= 3) {
			return exerSet.getBegSets();

		} else if (user.getUserLevel() <= 6) {
			return exerSet.getIntSets();
		} else if (user.getUserLevel() <= 10) {
			return exerSet.getAdvSets();
		}
		return 0;
	}
	public int assignedReps() {

		return exerRep.getCuttingReps();
	}

	@Override
	public String toString() {
		return "AssignedCuttingExercise [filteredExercise()=" + filteredExercise() + ", assignedSets()="
				+ assignedSets() + ", assignedReps()=" + assignedReps() + "]";
	}



}