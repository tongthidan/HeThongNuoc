package com.example.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name ="bill")
public class Bill implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private int idBill;
	
	@Column(name ="month_use")
	private int monthUse;
	
	@Column(name ="so_nuoc")
	private int soNuoc;
	
	@Column(name = "Total")
	private float toTal;
	
	@Column(name ="Status")
	private String status;
	
	@OneToOne
	@JoinColumn(name ="ID")
	private Taxes taxes;
	
	@OneToOne
	@JoinColumn(name ="ID",nullable = false)
	private MoneyUnit moneyUnit;
	
	public MoneyUnit getMoneyUnit() {
		return moneyUnit;
	}

	public void setMoneyUnit(MoneyUnit moneyUnit) {
		this.moneyUnit = moneyUnit;
	}

	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	@JoinColumn(name ="FamilyID",nullable =  false)
	private Family family;

	
	public Bill() {
		super();
	}

	public int getIdBill() {
		return idBill;
	}

	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}

	public int getMonthUse() {
		return monthUse;
	}

	public void setMonthUse(int monthUse) {
		this.monthUse = monthUse;
	}

	public int getSoNuoc() {
		return soNuoc;
	}

	public void setSoNuoc(int soNuoc) {
		this.soNuoc = soNuoc;
	}

	public float getToTal() {
		return toTal;
	}

	public void setToTal(float toTal) {
		this.toTal = toTal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Taxes getTaxes() {
		return taxes;
	}

	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}
	
	
}
