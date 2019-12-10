package com.revature.models;

import java.util.Random;

public class Reps {
	
	Random rnd = new Random();
	
	public int getBuilderReps() {
		return builderReps;
	}
	public void setBuilderReps(int builderReps) {
		this.builderReps = builderReps;
	}
	public int getCuttingReps() {
		return cuttingReps;
	}
	public void setCuttingReps(int cuttingReps) {
		this.cuttingReps = cuttingReps;
	}
	public Reps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reps(int builderReps, int cuttingReps) {
		super();
		this.builderReps = builderReps;
		this.cuttingReps = cuttingReps;
	}
	private int builderReps = rnd.nextInt(7) + 6;
	private int cuttingReps = rnd.nextInt(8) + 13;

	@Override
	public String toString() {
		return "Reps [builderReps=" + builderReps + ", cuttingReps=" + cuttingReps + "]";
	}

}
