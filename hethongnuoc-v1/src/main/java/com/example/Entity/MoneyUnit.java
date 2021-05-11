package com.example.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 @Entity(name ="moneyunit")
public class MoneyUnit implements Serializable {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="ID")
	 private long idMoneyUnit;
	 

	@Column(name ="bac")
	private String bac;
	
	@Column(name ="gia_tri_bac")
	private double moneyUnit;

	public MoneyUnit() {
		super();
	}
	public long getIdMoneyUnit() {
		return idMoneyUnit;
	}
	public void setIdMoneyUnit(long idMoneyUnit) {
		this.idMoneyUnit = idMoneyUnit;
	}
	public String getBac() {
		return bac;
	}
	public void setBac(String bac) {
		this.bac = bac;
	}
	public double getMoneyUnit() {
		return moneyUnit;
	}
	public void setMoneyUnit(double moneyUnit) {
		this.moneyUnit = moneyUnit;
	}

	
	
	
}
