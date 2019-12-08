package com.revature.daoSQLs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.daos.ExerciseDao;
import com.revature.models.Exercise;
import com.revature.utilities.ConnectionUtility;

public class ExerciseDaoSQL implements ExerciseDao {

	private String selectStatement = "SELECT * FROM exercise";
	
	Exercise extractExercises(ResultSet rs) throws SQLException {
		int exerciseId = rs.getInt("exercise_id");
		String exerciseName = rs.getString("exercise_name");
		int muscle = rs.getInt("muscle");
		int exerciseType = rs.getInt("exercise_type");
		String description = rs.getString("exercise_description");
		return new Exercise(exerciseId, exerciseName, muscle, exerciseType, description) ;

	}
	
	
	@Override
	public List<Exercise> findAll() {
		try (Connection c = ConnectionUtility.getConnection()) {
			

			String sql = selectStatement + " ORDER BY exercise_id";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			List<Exercise> exercises = new ArrayList<>();
			while (rs.next()) {
				exercises.add(extractExercises(rs));
			}

			return exercises;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Exercise> filterByExerciseType(int exerciseType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterByMuscle(int Muscle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterForBeginnerUB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterForBeginnerLB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterForIntermediateUB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterForIntermediateLB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterForAdvancedUB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercise> filterForAdvancedLB() {
		// TODO Auto-generated method stub
		return null;
	}

}
