package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.daos.UserDao;
import com.revature.models.User;
import com.revature.utilities.OmSingleton;

public class AuthServlet extends HttpServlet {

	private UserDao userDao = UserDao.currentImplementation;

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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if ("/FitnessFirst/auth/login".equals(req.getRequestURI())) {

			User credentials = (User) OmSingleton.read(req.getInputStream(), User.class);
			System.out.println(credentials);

			boolean loggedInUser = userDao.findByUsernameAndPassword(credentials.getUsername(),
					credentials.getUserPassword());

			if (loggedInUser == false) {
				resp.setStatus(401); // Unauthorized status code
				return;
			} else {
				resp.setStatus(201);
				req.getSession().setAttribute("user", loggedInUser);
				resp.getOutputStream().write(OmSingleton.write(loggedInUser));
				return;
			}
		}
	}

	// resp.getOutputStream().write(OmSingleton.write(users))
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getRequestURI());
		if ("/FitnessFirst/auth/session-user".equals(req.getRequestURI())) {

			byte[] json = OmSingleton.write(req.getSession().getAttribute("user"));
			resp.getOutputStream().write(json);
		}
	}

	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getSession().invalidate();

	}
}
