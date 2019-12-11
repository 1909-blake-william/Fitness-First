package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.daos.WorkoutDao;
import com.revature.models.User;
import com.revature.models.Workout;
import com.revature.utilities.OmSingleton;

public class WorkoutServlet extends HttpServlet {

	private WorkoutDao workoutDao = WorkoutDao.currentImplementation;
	private User user = User.getInstance();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
		resp.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		resp.addHeader("Access-Control-Allow-Headers",
				"Origin, Methods, Credentials, X-Requested-With, Content-Type, Accept");
		resp.addHeader("Access-Control-Allow-Credentials", "true");
		resp.setContentType("application/json");
		// TODO Auto-generated method stub
		super.service(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Workout> workouts;
		Workout currentUser = null;

		int workoutUser = currentUser.getWorkoutUser();
		workouts = workoutDao.findByUserId(workoutUser);

		byte[] json = OmSingleton.write(req.getSession().getAttribute("workout"));
		resp.getOutputStream().write(json);

	}
}
