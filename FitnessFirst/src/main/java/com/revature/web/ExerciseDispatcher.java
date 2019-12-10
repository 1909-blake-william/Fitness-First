package com.revature.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExerciseDispatcher {
	private final String uri = "/api/dispatcher/exercise";
	
	private boolean performGet(HttpServletRequest request) {
		if (request.getMethod().equals("GET")){
			return true;
		} else {
			return false;
		}
	}
	
	private boolean getExercises(HttpServletRequest request, HttpServletResponse response) {
		if (performGet(request) == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
