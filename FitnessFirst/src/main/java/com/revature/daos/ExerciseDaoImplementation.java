package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.Exercise;
import com.revature.util.ConnectionUtil;

public class ExerciseDaoImplementation implements ExerciseDao {
	/*private Connection connection;

	public ExerciseDaoImplementation(Connection connection) {
		this.connection = connection;
	}*/
	Exercise extractedExercise(ResultSet rs) throws SQLException{
		int exerciseId = rs.getInt("exercise_id");
		String exerciseName = rs.getString("exercise_name");
		int exerciseType = rs.getInt("exercise_type");
		String muscle = rs.getString("muscle");
		String description = rs.getString("exercise_description");
		int difficulty = rs.getInt("exercise_difficulty");

		return new Exercise(exerciseId, exerciseName, muscle, exerciseType, description, difficulty);
		
	}

	public int increaseIntensity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int decreaseIntensity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateLastLogin() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Exercise findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exercise findByName(String exerciseName) {
		
		try(Connection fitnessDatabase = ConnectionUtil.getConnection()){
			String findStatement = "SELECT * FROM Exercise WHERE exercise_name = ?";
			PreparedStatement ps = fitnessDatabase.prepareStatement(findStatement);
			ps.setString(1, exerciseName);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return extractedExercise(rs);
			} else {
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int save(Exercise currentExercise) {
			try (Connection fitnessDatabase = ConnectionUtil.getConnection()){
				/*rs.getInt("exercise_id");
		String exerciseName = rs.getString("exercise_name");
		int exerciseType = rs.getInt("exercise_type");
		String muscle = rs.getString("muscle");
		String description = rs.getString("exercise_description");
		int difficulty = rs.getInt("exercise_difficulty");*/
				
				String saveStatement = "INSERT INTO Exercise (exercise_id, exercise_name, "
						+ "exerise_type, muscle, exercise_description, exercise_difficulty)\r\n" + 
						"		VALUES (exercise_id_Seq.nextval,?,?,?,?,?)";
				PreparedStatement ps = fitnessDatabase.prepareStatement(saveStatement);
				/*private int exerciseId;
				private String exerciseName;
				private String muscle;
				private int exerciseType;
				private String description;
				private int difficulty;*/
				
				//Starting with username
				
				ps.setString(1, currentExercise.getExerciseName());
				ps.setString(2, currentExercise.getMuscle());
				ps.setInt(3, currentExercise.getExerciseType());
				ps.setString(4, currentExercise.getDescription());
				ps.setInt(5, currentExercise.getDifficulty());
				
				return ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
	}

}
