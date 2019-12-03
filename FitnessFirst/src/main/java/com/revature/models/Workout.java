package com.revature.models;

public class Workout {
	private int workoutId;
	private Exercise exercises;
	private int exerciseSets;
	private int repetitions;
	private User workoutUser;
	private boolean usesWeights;
	private boolean completed;
	//workouts schedule
	
	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Workout(int workoutId, Exercise exercises, int exerciseSets, int repetitions, User workoutUser,
			boolean usesWeights, boolean completed) {
		super();
		this.workoutId = workoutId;
		this.exercises = exercises;
		this.exerciseSets = exerciseSets;
		this.repetitions = repetitions;
		this.workoutUser = workoutUser;
		this.usesWeights = usesWeights;
		this.completed = completed;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	public Exercise getExercises() {
		return exercises;
	}

	public void setExercises(Exercise exercises) {
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

	public User getWorkoutUser() {
		return workoutUser;
	}

	public void setWorkoutUser(User workoutUser) {
		this.workoutUser = workoutUser;
	}

	public boolean isUsesWeights() {
		return usesWeights;
	}

	public void setUsesWeights(boolean usesWeights) {
		this.usesWeights = usesWeights;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result + exerciseSets;
		result = prime * result + ((exercises == null) ? 0 : exercises.hashCode());
		result = prime * result + repetitions;
		result = prime * result + (usesWeights ? 1231 : 1237);
		result = prime * result + workoutId;
		result = prime * result + ((workoutUser == null) ? 0 : workoutUser.hashCode());
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
		if (exercises == null) {
			if (other.exercises != null)
				return false;
		} else if (!exercises.equals(other.exercises))
			return false;
		if (repetitions != other.repetitions)
			return false;
		if (usesWeights != other.usesWeights)
			return false;
		if (workoutId != other.workoutId)
			return false;
		if (workoutUser == null) {
			if (other.workoutUser != null)
				return false;
		} else if (!workoutUser.equals(other.workoutUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Workout [workoutId=" + workoutId + ", exercises=" + exercises + ", exerciseSets=" + exerciseSets
				+ ", repetitions=" + repetitions + ", workoutUser=" + workoutUser + ", usesWeights=" + usesWeights
				+ ", completed=" + completed + "]";
	}
	
}
