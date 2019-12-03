package com.revature.models;

public class Exercise {
	private int exerciseId;
	private String exerciseName;
	private String muscle;
	private int exerciseType;
	private String description;
	private int difficulty;
	
	public Exercise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exercise(int exerciseId, String exerciseName, String muscle, int exerciseType, String description,
			int difficulty) {
		super();
		this.exerciseId = exerciseId;
		this.exerciseName = exerciseName;
		this.muscle = muscle;
		this.exerciseType = exerciseType;
		this.description = description;
		this.difficulty = difficulty;
	}

	public int getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(int exerciseId) {
		this.exerciseId = exerciseId;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public String getMuscle() {
		return muscle;
	}

	public void setMuscle(String muscle) {
		this.muscle = muscle;
	}

	public int getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(int exerciseType) {
		this.exerciseType = exerciseType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + difficulty;
		result = prime * result + exerciseId;
		result = prime * result + ((exerciseName == null) ? 0 : exerciseName.hashCode());
		result = prime * result + exerciseType;
		result = prime * result + ((muscle == null) ? 0 : muscle.hashCode());
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
		Exercise other = (Exercise) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (difficulty != other.difficulty)
			return false;
		if (exerciseId != other.exerciseId)
			return false;
		if (exerciseName == null) {
			if (other.exerciseName != null)
				return false;
		} else if (!exerciseName.equals(other.exerciseName))
			return false;
		if (exerciseType != other.exerciseType)
			return false;
		if (muscle == null) {
			if (other.muscle != null)
				return false;
		} else if (!muscle.equals(other.muscle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exercise [exerciseId=" + exerciseId + ", exerciseName=" + exerciseName + ", muscle=" + muscle
				+ ", exerciseType=" + exerciseType + ", description=" + description + ", difficulty=" + difficulty
				+ "]";
	}
	
}
