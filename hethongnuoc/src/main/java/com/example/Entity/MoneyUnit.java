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
	 @Column(name ="MoneyUnitID")
	 private int idMoneyUnit;
	 
	 
	 @OneToOne 
	 @Column(name ="BillID",nullable = false)
	 private Bill bill;
	 
	 @Column(name ="Name")
	private String name;
	@Column(name ="dinhmuc")
	private String dinhMuc;
	@Column(name ="MoneyUnit")
	private String moneyUnit;
	public MoneyUnit(int idMoneyUnit, Bill bill, String name, String dinhMuc, String moneyUnit) {
		super();
		this.idMoneyUnit = idMoneyUnit;
		this.bill = bill;
		this.name = name;
		this.dinhMuc = dinhMuc;
		this.moneyUnit = moneyUnit;
	}
	public MoneyUnit() {
		super();
	}
	public int getIdMoneyUnit() {
		return idMoneyUnit;
	}
	public void setIdMoneyUnit(int idMoneyUnit) {
		this.idMoneyUnit = idMoneyUnit;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
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
