package com.revature.daoSQLs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.daos.UserDao;
import com.revature.models.User;
import com.revature.utilities.ConnectionUtility;

public class UserDaoSQL implements UserDao {
	private User user = User.getInstance();

	void extractUser(ResultSet rs) throws SQLException {
		int rsUserId = rs.getInt("user_id");
		String rsUsername = rs.getString("username");
		String rsUserPassword = rs.getString("user_password");
		String rsFirstname = rs.getString("firstname");
		String rsLastname = rs.getString("lastname");
		String rsEmail = rs.getString("email");
		String rsGender = rs.getString("gender");
		int rsHeight = rs.getInt("height");
		int rsWeight = rs.getInt("weight");
		String rsConsiderations = rs.getString("considerations");
		int rsUserLevel = rs.getInt("user_level");
		int rsUserPoints = rs.getInt("points");
		user.setNewUser(rsUserId, rsUsername, rsUserPassword, rsFirstname, rsLastname, rsEmail, rsGender, rsHeight,
				rsWeight, rsConsiderations, rsUserLevel, rsUserPoints);

	}

	public int save(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> findAll() {
		try (Connection c = ConnectionUtility.getConnection()) {

			String sql = "SELECT * FROM wger_user";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			List<User> users = new ArrayList<User>();
			while (rs.next()) {
				users.add(extractUser(rs));
			}

			return users;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return null;
		}
	}

	public User findById(int ersUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean findByUsernameAndPassword(String username, String password) {
		try (Connection c = ConnectionUtility.getConnection()) {

			Statement statement = c.createStatement();
			String sql = "SELECT * FROM wger_user WHERE username = '" + username + "' AND user_password = '" + password
					+ "'";
			ResultSet rs = statement.executeQuery(sql);
			if (rs.next()) {
				extractUser(rs);
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
