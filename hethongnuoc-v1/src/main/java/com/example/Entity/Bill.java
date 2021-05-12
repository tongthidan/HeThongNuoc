package com.example.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
@Entity
@Table(name ="bill")
public class Bill implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private long idBill;
	
	@Column(name ="month_use")
	private int monthUse;
	
	@Column(name ="chi_so_cu")
	private int CSCu;
	
	@Column(name = "chi_so_moi")
	private int CSMoi;
	
	@Column(name = "thanh_tien")
	private float thanhTien;
	@Column(name = "tien_thue")
	private float tienThue;
	
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

	@ManyToOne(fetch = FetchType.LAZY )
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinColumn(name ="FamilyID",nullable =  false)
	private Family family;

	
	public Bill() {
		super();
	}

	public long getIdBill() {
		return idBill;
	}

	public void setIdBill(long idBill) {
		this.idBill = idBill;
	}

	public int getMonthUse() {
		return monthUse;
	}

	public void setMonthUse(int monthUse) {
		this.monthUse = monthUse;
	}

	public int getCSCu() {
		return CSCu;
	}

	public void setCSCu(int cSCu) {
		CSCu = cSCu;
	}

	public int getCSMoi() {
		return CSMoi;
	}

	public void setCSMoi(int cSMoi) {
		CSMoi = cSMoi;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}

	public float getTienThue() {
		return tienThue;
	}

	public void setTienThue(float tienThue) {
		this.tienThue = tienThue;
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
