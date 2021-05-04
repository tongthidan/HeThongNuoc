package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name ="account")
public class Account implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long idAccount;
	
	
	@Column(name = "USERNAME")
	private String username;
	@Column (name ="PASSWORD")
	private String password;
	public Account() {
		super();
	}
	
	


	public long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
