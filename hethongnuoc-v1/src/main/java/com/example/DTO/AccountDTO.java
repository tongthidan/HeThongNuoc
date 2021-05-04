package com.example.DTO;

import lombok.Data;
public class AccountDTO {
	 long id;
//	 String userID;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AccountDTO() {
		super();
	}
	 
	 
}
