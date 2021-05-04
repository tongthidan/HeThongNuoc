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
	 

	@Column(name ="Name")
	private String name;
	@Column(name ="dinhmuc")
	private String dinhMuc;
	@Column(name ="money_unit")
	private String moneyUnit;

	public MoneyUnit() {
		super();
	}
	public long getIdMoneyUnit() {
		return idMoneyUnit;
	}
	public void setIdMoneyUnit(long idMoneyUnit) {
		this.idMoneyUnit = idMoneyUnit;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(String dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	public String getMoneyUnit() {
		return moneyUnit;
	}
	public void setMoneyUnit(String moneyUnit) {
		this.moneyUnit = moneyUnit;
	}
	
	
}
