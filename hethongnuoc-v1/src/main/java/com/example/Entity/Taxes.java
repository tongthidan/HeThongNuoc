package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name ="taxes")
public class Taxes implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private long idTaxes;
	
	@Column(name ="name_taxes")
	private String nameTaxes;
	@Column(name ="value_taxes")
	private double value_taxes;
	
	
	public Taxes() {
		super();
	}


	public long getIdTaxes() {
		return idTaxes;
	}


	public void setIdTaxes(long idTaxes) {
		this.idTaxes = idTaxes;
	}


	public String getNameTaxes() {
		return nameTaxes;
	}


	public void setNameTaxes(String nameTaxes) {
		this.nameTaxes = nameTaxes;
	}


	public double getValue_taxes() {
		return value_taxes;
	}


	public void setValue_taxes(double value_taxes) {
		this.value_taxes = value_taxes;
	}


	

	
	
	
}
