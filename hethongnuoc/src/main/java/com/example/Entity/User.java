package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity(name = "User")
public class User  implements Serializable{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name ="UserID")
 private int idUser;
 @ManyToOne
 @JoinColumn(name ="FamilyID",nullable = false)
 
 private Family family;
 

 @Column(name = "FullName")
 private String fullName;
 @Column(name ="Gmail")
 private String gmail;
 @Column(name ="SDT")
 private String sdt;
 @Column(name ="Address")
 private String address;
 @Column(name ="Role")
 private int role;
 
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(int idUser, Family family, String fullName, String gmail, String sdt, String address, int role) {
	super();
	this.idUser = idUser;
	this.family = family;
	this.fullName = fullName;
	this.gmail = gmail;
	this.sdt = sdt;
	this.address = address;
	this.role = role;
}

public int getIdUser() {
	return idUser;
}

public void setIdUser(int idUser) {
	this.idUser = idUser;
}

public Family getFamily() {
	return family;
}

public void setFamily(Family family) {
	this.family = family;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getGmail() {
	return gmail;
}

public void setGmail(String gmail) {
	this.gmail = gmail;
}

public String getSdt() {
	return sdt;
}

public void setSdt(String sdt) {
	this.sdt = sdt;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getRole() {
	return role;
}

public void setRole(int role) {
	this.role = role;
}



}
