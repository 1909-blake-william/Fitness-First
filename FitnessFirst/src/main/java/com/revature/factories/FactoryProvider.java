package com.revature.factories;

public class FactoryProvider {
	public static WorkoutAbstractFactory getFactory(String userChoice) {
		return WorkoutFactory();
		
	}
}
