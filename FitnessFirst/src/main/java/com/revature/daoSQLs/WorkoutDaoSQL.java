package com.revature.daoSQLs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.daos.WorkoutDao;
import com.revature.factories.BuildingWorkoutFactory;
import com.revature.factories.CuttingWorkoutFactory;
import com.revature.models.User;
import com.revature.models.Workout;
import com.revature.utilities.ConnectionUtility;

public class WorkoutDaoSQL implements WorkoutDao {
	
	private static final String selectStatement = " SELECT * FROM workout";

	Workout extractWorkout(ResultSet rs) throws SQLException {
		int workoutId = rs.getInt("workout_id");
		int exercises = rs.getInt("exercises");
		int exerciseSets = rs.getInt("exercise_sets");
		int repititions = rs.getInt("repititions");
		int completed = rs.getInt("completed");
		int workoutUser = rs.getInt("workout_user");
		return new Workout(workoutId, exercises, exerciseSets, repititions, completed, workoutUser);
	}


	@Override
	public int save(Workout w) {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "INSERT INTO workout (workout_id, exercises, exercise_sets, repititions, workout_user) "
					+ " VALUES (workout_id_seq.nextval ,?,?,?)";

			CallableStatement cs = c.prepareCall(sql);

			cs.setInt(1, w.getExerciseSets());
			cs.setInt(2, w.getRepetitions());
			cs.setInt(3, w.getWorkoutUser());
			
			

			return cs.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Workout w) {
		try (Connection c = ConnectionUtility.getConnection()) {
			String sql = " UPDATE workout"
					+ " SET completed = ?"
					+ " WHERE workout_id = ?";

			CallableStatement cs = c.prepareCall(sql);

			cs.setInt(1, w.getCompleted());
			cs.setInt(2, w.getWorkoutId());
			return cs.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Workout> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Workout> findByUserId(int workoutUser) {
		try (Connection c = ConnectionUtility.getConnection()) {
			String sql = "SELECT * FROM workout " + "WHERE workout_user = ? AND completed = 1 ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, workoutUser);
			

			ResultSet rs = ps.executeQuery();
			List<Workout> workoutList = new ArrayList<Workout>();
			while (rs.next()) {
				workoutList.add(extractWorkout(rs));
			} 
				return workoutList;
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Workout> findByCompletedStatusId(Workout w) {
		try (Connection c = ConnectionUtility.getConnection()) {
		String sql = "SELECT * FROM workout " + "WHERE workout_user = ? AND completed = 1 ";

		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, w.getWorkoutUser());
		

		ResultSet rs = ps.executeQuery();
		List<Workout> workoutList = new ArrayList<Workout>();
		while (rs.next()) {
			workoutList.add(extractWorkout(rs));
		} 
			return workoutList;
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}


	@Override
	public Workout createWorkout(int userChoice) {
	User.getInstance().setUserChoice(userChoice);
	if (userChoice == 1) {
		return new BuildingWorkoutFactory();
	}
	else if (userChoice == 2) {
		return new CuttingWorkoutFactory();
	}
	else
	return null;
}


	@Override
	public Workout createWorkout(User userChoice) {
		// TODO Auto-generated method stub
		return null;
	}
}






