package com.revature.models;

public class Workout {
	private User user = User.getInstance();
	private int workoutId;
	private int exercises;
	private int exerciseSets;
	private int repetitions;
	private int workoutUser = user.getUserId();
	private int completed;
	
	public Workout(int workoutId, int exercises, int exerciseSets, int repititions, int workoutUser, int completed) {
	} 
	
	
	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + completed;
		result = prime * result + exerciseSets;
		result = prime * result + exercises;
		result = prime * result + repetitions;
		result = prime * result + workoutId;
		result = prime * result + workoutUser;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workout other = (Workout) obj;
		if (completed != other.completed)
			return false;
		if (exerciseSets != other.exerciseSets)
			return false;
		if (exercises != other.exercises)
			return false;
		if (repetitions != other.repetitions)
			return false;
		if (workoutId != other.workoutId)
			return false;
		if (workoutUser != other.workoutUser)
			return false;
		return true;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	public int getExercises() {
		return exercises;
	}

	public void setExercises(int exercises) {
		this.exercises = exercises;
	}

	public int getExerciseSets() {
		return exerciseSets;
	}

	public void setExerciseSets(int exerciseSets) {
		this.exerciseSets = exerciseSets;
	}

	public int getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	public int getWorkoutUser() {
		return workoutUser;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}


}