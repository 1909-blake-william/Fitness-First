package com.revature.daos;

import com.revature.models.User;

public interface UserDao {
	
	int updatePoints();
	int updateWorkOutLog();
	int updateWeight();
	int save (User currentUser);
	int remove (User currentUser);
	
	User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password);
	User setUsername();
	String updateConsiderations();
	
	
	
	 
}
