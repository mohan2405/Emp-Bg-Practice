package com.example.EmpBgPractice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Police {

	@Id 
	private int id;
	private String password;
	
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
	
}
