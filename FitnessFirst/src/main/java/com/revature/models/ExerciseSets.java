package com.revature.models;

import java.util.Random;

public class ExerciseSets {
	
	Random rnd = new Random();

	private int begSets = rnd.nextInt(2) + 2;
	private int intSets = rnd.nextInt(2) + 3;
	private int advSets = rnd.nextInt(2) + 4;
	public ExerciseSets(Random rnd, int begSets, int intSets, int advSets) {
		super();
		this.rnd = rnd;
		this.begSets = begSets;
		this.intSets = intSets;
		this.advSets = advSets;
	}
	public ExerciseSets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBegSets() {
		return begSets;
	}
	public void setBegSets(int begSets) {
		this.begSets = begSets;
	}
	public int getIntSets() {
		return intSets;
	}
	public void setIntSets(int intSets) {
		this.intSets = intSets;
	}
	public int getAdvSets() {
		return advSets;
	}
	public void setAdvSets(int advSets) {
		this.advSets = advSets;
	}
	
}
	