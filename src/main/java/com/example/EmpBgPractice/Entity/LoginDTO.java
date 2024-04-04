package com.example.EmpBgPractice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginDTO {
	
	@Id
	private int id;
	private String password;
	private String userType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}	

}
