package com.hardserve.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Column;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name = "UserID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "Password")
	private String password;
	
	protected User() {}
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
