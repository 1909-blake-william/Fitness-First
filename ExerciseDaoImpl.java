package com.revature.fitnessfirstservlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.revature.models.Exercise;
import com.revature.models.Workout;
import com.revature.utilities.ConnectionUtil;


public class ExerciseDaoImpl implements ExerciseDao {
	
	Exercise extractExercise(ResultSet rs) throws SQLException {
		int eid = rs.getInt("exercise_id");
		String eName = rs.getString("exercise_name");
		String muscle = rs.getString("muscle");
		int eType = rs.getInt("exercise_type");
		String eDescription = rs.getString("exercise_description");
		int eDifficulty = rs.getInt("exercise_difficulty");
		return new Exercise(eid, eName, muscle, eType, eDescription, eDifficulty);
	}
	
	public int updatePoint() {
		Workout wo = new Workout();
		try (Connection con = ConnectionUtil.getConnection()){
				if (wo.isCompleted() == true) {
					String str = "Select * from exercise e "
							+ "LEFT JOIN " ;
					/*
					 "SELECT * FROM pokemon p "
					+ "LEFT JOIN pokemon_types t ON (p.pokemon_type_id = t.pokemon_types_id) "
					+ "LEFT JOIN pokemon_users u ON (p.trainer = u.user_id) " + "WHERE pokemon_name = ?";
					 * */
					
					/*
					 * 
					 * 
					 * */
					
					
					PreparedStatement ps = con.prepareStatement(str);
					ResultSet rs = ps.executeQuery(str);
					
					
				}
			
		} catch(Exception e) {
			return 0;
		}
		return 0;
	}

	public int increaseDifficulty() {
		try (Connection con = ConnectionUtil.getConnection()) {
			
		} catch (Exception e) {
			return 0;
		}
		return 0;
	}

	public int decreaseDifficulty() {
		
		return 0;
	}

	public int updateUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String findByExerciseType(int eType) {
		// TODO Auto-generated method stub
		return null;
	}

	public String findByExerciseName(String eName) {
		// TODO Auto-generated method stub
		return null;
	}

}
