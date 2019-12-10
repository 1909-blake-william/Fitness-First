package com.revature.daos;

import com.revature.models.Exercise;

public interface ExerciseDao {
	/* # Work

     if self.work_intensity == self.INTENSITY_LOW:

         work_factor = 1.5

     elif self.work_intensity == self.INTENSITY_MEDIUM:

         work_factor = 1.8

     else:

         work_factor = 2.2

     work = self.work_hours * work_factor*/
	int increaseIntensity();
	
	int updateLastLogin(); //timestamp 
	
	int decreaseIntensity(); 
	
	Exercise findById();
	Exercise findByName(String exerciseName);
	int save (Exercise currentExercise);
	
	//based on if the user goes through some sort of injury or drastic lifestyle change
	//notifications, hyperlink to userprofile What's wrong?
}
