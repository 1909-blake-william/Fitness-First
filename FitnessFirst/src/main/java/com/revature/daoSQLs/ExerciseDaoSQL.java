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

	private static final String selectStatement = " SELECT * FROM exercise";

	Exercise extractExercises(ResultSet rs) throws SQLException {
		int exerciseId = rs.getInt("exercise_id");
		String exerciseName = rs.getString("exercise_name");
		int muscle = rs.getInt("muscle");
		int exerciseType = rs.getInt("exercise_type");
		String description = rs.getString("exercise_description");
		return new Exercise(exerciseId, exerciseName, muscle, exerciseType, description);

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
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = selectStatement + " WHERE exercise_type = 4" + " OR exercise_type = 7"
					+ " AND muscle = 8 OR muscle = 11 OR muscle = 12 OR muscle = 13";

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
	public List<Exercise> filterForBeginnerLB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT" + " EXERCISE_NAME ," + " MUSCLE ," + " EXERCISE_TYPE ,"
					+ " EXERCISE_DESCRIPTION FROM exercise" + " WHERE exercise_type = 4 " + " OR exercise_type = 7"
					+ " AND muscle = 9 OR muscle = 14";

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
	public List<Exercise> filterForIntermediateUB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT" + " EXERCISE_NAME ," + " MUSCLE ," + " EXERCISE_TYPE ,"
					+ " EXERCISE_DESCRIPTION FROM exercise" + " WHERE exercise_type = 4 " + " OR exercise_type = 7"
					+ " OR exercise_type = 6" + " OR exercise_type = 5" + " OR exercise_type = 3"
					+ " AND muscle = 8 OR muscle = 11 OR muscle = 12 OR muscle = 13";

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
	public List<Exercise> filterForIntermediateLB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT" + " EXERCISE_NAME ," + " MUSCLE ," + " EXERCISE_TYPE ,"
					+ " EXERCISE_DESCRIPTION FROM exercise" + " WHERE exercise_type = 4 " + " OR exercise_type = 7"
					+ " OR exercise_type = 6" + " OR exercise_type = 5" + " OR exercise_type = 3"
					+ " AND muscle = 9 OR muscle = 14";

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
	public List<Exercise> filterForAdvancedUB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT" + " EXERCISE_NAME ," + " MUSCLE ," + " EXERCISE_TYPE ,"
					+ " EXERCISE_DESCRIPTION FROM exercise"
					+ " WHERE muscle = 8 OR muscle = 11 OR muscle = 12 OR muscle = 13";

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
	public List<Exercise> filterForAdvancedLB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT" + " EXERCISE_NAME ," + " MUSCLE ," + " EXERCISE_TYPE ,"
					+ " EXERCISE_DESCRIPTION FROM exercise" + " WHERE muscle = 9 OR muscle = 14";

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
	public Exercise filter1ForBeginnerUB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM" + "( SELECT * FROM exercise WHERE"
					+ "(exercise_type = 4 OR exercise_type = 7 AND muscle = 8)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 AND muscle = 11)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 AND muscle = 12)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 AND muscle = 13)" + "ORDER BY dbms_random.value)"
					+ "WHERE rownum = 1";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			Exercise chosenExercise = new Exercise();
			if (rs.next()) {
				chosenExercise = (extractExercises(rs));
			}

			return chosenExercise;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Exercise filter1ForBeginnerLB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM" + "( SELECT * FROM exercise WHERE"
					+ "(exercise_type = 4 OR exercise_type = 7 AND muscle = 9)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 AND muscle = 14)" + "ORDER BY dbms_random.value)"
					+ "WHERE rownum = 1";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			Exercise chosenExercise = new Exercise();
			if (rs.next()) {
				chosenExercise = (extractExercises(rs));
			}

			return chosenExercise;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Exercise filter1ForIntermediateUB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM" + "( SELECT * FROM exercise WHERE"
					+ "(exercise_type = 4 OR exercise_type = 7 OR exercise_type = 6 OR exercise_type = 5 OR exercise_type = 3 AND muscle = 8)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 OR exercise_type = 6 OR exercise_type = 5 OR exercise_type = 3 AND muscle = 11)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 OR exercise_type = 6 OR exercise_type = 5 OR exercise_type = 3 AND muscle = 12)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 OR exercise_type = 6 OR exercise_type = 5 OR exercise_type = 3 AND muscle = 13)" + "ORDER BY dbms_random.value)"
					+ "WHERE rownum = 1";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			Exercise chosenExercise = new Exercise();
			if (rs.next()) {
				chosenExercise = (extractExercises(rs));
			}

			return chosenExercise;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Exercise filter1ForIntermediateLB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM" + "( SELECT * FROM exercise WHERE"
					+ "(exercise_type = 4 OR exercise_type = 7 OR exercise_type = 6 OR exercise_type = 5 OR exercise_type = 3 AND muscle = 9)"
					+ "OR (exercise_type = 4 OR exercise_type = 7 OR exercise_type = 6 OR exercise_type = 5 OR exercise_type = 3 AND muscle = 14)"
					+ "ORDER BY dbms_random.value)"
					+ "WHERE rownum = 1";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			Exercise chosenExercise = new Exercise();
			if (rs.next()) {
				chosenExercise = (extractExercises(rs));
			}

			return chosenExercise;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public Exercise filter1ForAdvancedUB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM" + "( SELECT * FROM exercise WHERE"
					+ "(muscle = 8 OR muscle = 11 OR muscle 12 OR muscle 13)"
					+ "ORDER BY dbms_random.value)"
					+ "WHERE rownum = 1";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			Exercise chosenExercise = new Exercise();
			if (rs.next()) {
				chosenExercise = (extractExercises(rs));
			}

			return chosenExercise;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public Exercise filter1ForAdvancedLB() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM" + "( SELECT * FROM exercise WHERE"
					+ "(muscle = 9 OR muscle = 14)"
					+ "ORDER BY dbms_random.value)"
					+ "WHERE rownum = 1";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			Exercise chosenExercise = new Exercise();
			if (rs.next()) {
				chosenExercise = (extractExercises(rs));
			}

			return chosenExercise;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}