package com.example.DTO;

import lombok.Data;
public class AccountDTO {
	 int id;

	 String userName;
	 
	
	public String getUserName() {
		return userName;
	}
	
	
	

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public AccountDTO(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountDTO() {
		super();
	}
	 
	 
}
