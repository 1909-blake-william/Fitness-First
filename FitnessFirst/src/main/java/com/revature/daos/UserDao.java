package com.revature.daos;

import com.revature.models.User;

public interface UserDao {
	
	int updatePoints(User currentUser);
	int updateWorkOutLog(User currentUser);
	int updateWeight(User currentUser);
	int save (User currentUser);
	int remove (User currentUser);
	int increaseLevel(User currentUser);
	User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password);
	User updateConsiderations(User currentUser);
	
	
	
	 
}
