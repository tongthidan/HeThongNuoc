package com.example.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import antlr.collections.List;
@Entity
@Table(name ="family")
public class Family implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private int idFamily;
	@Column(name ="NameFamily")
	private String nameFamily;
	@Column(name ="Date")
	private String datePayment;
	@Column(name ="HinhThucTT")
	private String hinhThucTT;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = ("bill"))
	private Set<Bill> listBill = new HashSet<>();
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = ("user"))
	private Set<Bill> listUser = new HashSet<>();
	
	public Family() {
		super();
	}

	public Family(int idFamily, String nameFamily, String datePayment, String hinhThucTT) {
		super();
		this.idFamily = idFamily;
		this.nameFamily = nameFamily;
		this.datePayment = datePayment;
		this.hinhThucTT = hinhThucTT;
		
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

	public String getHinhThucTT() {
		return hinhThucTT;
	}

	public void setHinhThucTT(String hinhThucTT) {
		this.hinhThucTT = hinhThucTT;
	}

	public Set<Bill> getListBill() {
		return listBill;
	}

	public void setListBill(Set<Bill> listBill) {
		this.listBill = listBill;
	}

	public Set<Bill> getListUser() {
		return listUser;
	}

	public void setListUser(Set<Bill> listUser) {
		this.listUser = listUser;
	}
	
	
	
}
