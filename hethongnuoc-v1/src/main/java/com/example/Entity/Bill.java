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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
@Entity
@Table(name ="bill")
public class Bill implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private long idBill;
	@OneToOne(fetch = FetchType.LAZY )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name ="ID")
	private Taxes taxes;
	
	@OneToOne(fetch = FetchType.LAZY )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name ="ID",nullable = false)
	private MoneyUnit moneyUnit;
	
	@ManyToOne(fetch = FetchType.LAZY )
//	
	@JsonProperty(access = Access.WRITE_ONLY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name ="FamilyID",nullable =  false)
	private Family family;

	
	@Column(name ="month_use")
	private long monthUse;
	
	@Column(name ="chi_so_cu")
	private long CSCu;
	
	@Column(name = "chi_so_moi")
	private long CSMoi;
	@Column(name ="so_nuoc")
	private long soNuoc;
	
	@Column(name = "thanh_tien")
	private float thanhTien;
	@Column(name = "tien_thue")
	private float tienThue;
	@Column(name ="tong_tien")
	private float tongTien;
	@Column(name ="Status")
	private String status;
	public MoneyUnit getMoneyUnit() {
		return moneyUnit;
	}

	public void setMoneyUnit(MoneyUnit moneyUnit) {
		this.moneyUnit = moneyUnit;
	}

	
	
	public Bill() {
		super();
	}

	public long getIdBill() {
		return idBill;
	}

	public void setIdBill(long idBill) {
		this.idBill = idBill;
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

	public long getMonthUse() {
		return monthUse;
	}

	public void setMonthUse(long monthUse) {
		this.monthUse = monthUse;
	}

	public long getCSCu() {
		return CSCu;
	}

	public void setCSCu(long cSCu) {
		CSCu = cSCu;
	}

	public long getCSMoi() {
		return CSMoi;
	}

	public void setCSMoi(long cSMoi) {
		CSMoi = cSMoi;
	}

	public long getSoNuoc() {
		return soNuoc;
	}

	public void setSoNuoc(long soNuoc) {
		this.soNuoc = soNuoc;
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

	public float getTongTien() {
		return tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	

	
}
