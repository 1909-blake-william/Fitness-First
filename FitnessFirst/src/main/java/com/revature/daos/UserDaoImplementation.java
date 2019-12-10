package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.User;
import com.revature.util.ConnectionUtil;
//Someone on higher difficulty level is doing more reps
//Each exercise is multiplied by the amount of reps
//This generates more or less points respectively

public class UserDaoImplementation implements UserDao {
	
	User extractedUser(ResultSet rs) throws SQLException{
		int id = rs.getInt("user_id");
		String username = rs.getString("username");
		String password = rs.getString("user_password");
		String firstname = rs.getString("firstname");
		String lastname = rs.getString("lastname");
		String email = rs.getString("email");
		String gender = rs.getString("gender");
		int height = rs.getInt("height");
		int weight = rs.getInt("weight");
		String considerations = rs.getString("considerations");
		int level = rs.getInt("user_level");
		int points = rs.getInt("points");
		
		return new User(id, username, password, firstname, lastname, email, gender, height, weight,
				considerations, level, points);
		
	}

	public int save(User currentUser) {
		try (Connection fitnessDatabase = ConnectionUtil.getConnection()){
			String saveStatement = "INSERT INTO WGER_User (user_id, username, user_password, firstname, "
					+ "lastname, email, gender, height, weight, considerations, user_level, points)\r\n" + 
					"		VALUES (USER_ID_SEQ.nextval,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = fitnessDatabase.prepareStatement(saveStatement);
			
			//Starting with username
			ps.setString(1, currentUser.getUsername());
			ps.setString(2, currentUser.getUserPassword());
			ps.setString(3, currentUser.getFirstname());
			ps.setString(4, currentUser.getLastname());
			ps.setString(5, currentUser.getEmail());
			//Height
			ps.setInt(6, currentUser.getHeight());
			ps.setInt(7, currentUser.getWeight());
			ps.setString(8, currentUser.getConsiderations());
			ps.setInt(9, currentUser.getUserLevel());
			ps.setInt(10, currentUser.getUserPoints());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
		
	}

	public int remove(User currentUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User findByUsername(String username) {
		try(Connection fitnessDatabase = ConnectionUtil.getConnection()){
			String findStatement = "SELECT * FROM WGER_User WHERE username = ?";
			PreparedStatement ps = fitnessDatabase.prepareStatement(findStatement);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return extractedUser(rs);
			} else {
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public User findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int updatePoints(User currentUser) {
		// TODO Auto-generated method stub
		//if workout completed == true;
		//
		int exerciseCompletedPoints = 0;
		int calculateNewPoints = currentUser.getUserPoints() + exerciseCompletedPoints;
		try (Connection fitnessDatabase = ConnectionUtil.getConnection()){
			String updateStatement = "UPDATE WGER_User SET points = ? WHERE user_id = ?";
			PreparedStatement ps = fitnessDatabase.prepareStatement(updateStatement);
			
			ps.setInt(1, calculateNewPoints);
			ps.setInt(2, currentUser.getUserId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateWorkOutLog(User currentUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateWeight(User currentUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int increaseLevel(User currentUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User updateConsiderations(User currentUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
