package com.example.DTO;

import java.sql.Date;

public class FamilyDTO {
	private int idFamily;
	private String nameFamily;
	private String datePayment;
	private String typePayment;
	public FamilyDTO(int idFamily, String nameFamily, String datePayment, String typePayment) {
		super();
		this.idFamily = idFamily;
		this.nameFamily = nameFamily;
		this.datePayment = datePayment;
		this.typePayment = typePayment;
	}
	public FamilyDTO() {
		super();
	}
	
	public int getIdFamily() {
		return idFamily;
	}
	public void setIdFamily(int idFamily) {
		this.idFamily = idFamily;
	}
	public String getNameFamily() {
		return nameFamily;
	}
	public void setNameFamily(String nameFamily) {
		this.nameFamily = nameFamily;
	}
	public String getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(String datePayment) {
		this.datePayment = datePayment;
	}
	public String getTypePayment() {
		return typePayment;
	}
	public void setTypePayment(String typePayment) {
		this.typePayment = typePayment;
	}
	
}
