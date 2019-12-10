package com.revature.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.ExerciseDao;
import com.revature.daos.ExerciseDaoImplementation;
import com.revature.models.Exercise;
/*import com.revature.models.User;
import com.revature.models.Workout;*/

public class DispatcherServlet extends HttpServlet {
	ObjectMapper om = new ObjectMapper();
	private static final ExerciseDao instance = new ExerciseDaoImplementation();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("To context param: " + req.getServletContext().getInitParameter("To"));
		//resp.addHeader("Access-Control-Allow-Origin", "http://localhost:5500");
		resp.addHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		resp.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		resp.addHeader("Access-Control-Allow-Headers",
				"Origin, Methods, Credentials, X-Requested-With, Content-Type, Accept");
		resp.addHeader("Access-Control-Allow-Credentials", "true");
		resp.setContentType("application/json");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Exercise currentExercise = (Exercise) om.readValue(req.getReader(), Exercise.class);
		List <Exercise> originalExercises = new ArrayList<>();
		//resp.getWriter().write("Hwllo");
		/*List<User> users = userDao.findAll();
		String json = om.writeValueAsString(users);*/
		if (req.getRequestURI().contains("/api/workout")) {
			//For every exercise extracted from public endpoint, save this exercise
			originalExercises.add(currentExercise);
			for (int i = 0; i < originalExercises.size(); i++) {
				instance.save(currentExercise);
			}
		}
	}
}
