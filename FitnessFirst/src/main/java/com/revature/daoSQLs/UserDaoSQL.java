package com.revature.daoSQLs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.daos.UserDao;
import com.revature.models.User;

public class UserDaoSQL implements UserDao {
	
	User extractUser(ResultSet rs) throws SQLException {
		 int rsUserId = rs.getInt("user_id");
		 String rsUsername = rs.getString("username");
		 String rsUserPassword = rs.getString("password");
		 String rsFirstname = rs.getString("first_name");
		 String rsLastname = rs.getString("last_name");
		 String rsEmail = rs.getString("email");
		 String rsGender = rs.getString("gender");
		 int rsHeight = rs.getInt("height");
		 int rsWeight = rs.getInt("weight");
		 String rsConsiderations = rs.getString("considerations"); 
		 int rsUserLevel = rs.getInt("user_level");
		 int rsUserPoints = rs.getInt("user_points");
		return new User(rsUserId, rsUsername, rsUserPassword, rsFirstname, rsLastname, rsEmail, rsGender, 
				rsHeight, rsWeight, rsConsiderations, rsUserLevel, rsUserPoints);
		
	}

	public int save(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findById(int ersUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
