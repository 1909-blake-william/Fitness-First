package com.revature.models;

public class User {
	private int userId;
	private String username;
	private String userPassword;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private int height;
	private int weight;
	private String considerations; 
	private int userLevel;
	private int userPoints;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, String userPassword, String firstname, String lastname, String email,
			String gender, int height, int weight, String considerations, int userLevel, int userPoints) {
		super();
		this.userId = userId;
		this.username = username;
		this.userPassword = userPassword;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.considerations = considerations;
		this.userLevel = userLevel;
		this.userPoints = userPoints;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getConsiderations() {
		return considerations;
	}

	public void setConsiderations(String considerations) {
		this.considerations = considerations;
	}

	public int getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	public int getUserPoints() {
		return userPoints;
	}

	public void setUserPoints(int userPoints) {
		this.userPoints = userPoints;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((considerations == null) ? 0 : considerations.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + height;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + userId;
		result = prime * result + userLevel;
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + userPoints;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (considerations == null) {
			if (other.considerations != null)
				return false;
		} else if (!considerations.equals(other.considerations))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (height != other.height)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (userId != other.userId)
			return false;
		if (userLevel != other.userLevel)
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (userPoints != other.userPoints)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userPassword=" + userPassword + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", gender=" + gender + ", height="
				+ height + ", weight=" + weight + ", considerations=" + considerations + ", userLevel=" + userLevel
				+ ", userPoints=" + userPoints + "]";
	}

}