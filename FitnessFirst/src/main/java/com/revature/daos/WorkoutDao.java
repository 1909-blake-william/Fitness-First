package com.revature.daos;

import java.util.List;

import com.revature.daoSQLs.WorkoutDaoSQL;
import com.revature.models.Workout;

public interface WorkoutDao {
	WorkoutDao currentImplementation = new WorkoutDaoSQL();

	/**
	 * used to save a new reimbursements
	 * 
	 * @param r the reimbursement to be created
	 * @return the generated id for the reimbursement
	 */
	int save(Workout w);
	
	int update(Workout w);

	List<Workout> findAll();

	List<Workout> findByUserId(int workoutUser);

	List<Workout> findByCompletedStatusId(Workout w);
}
