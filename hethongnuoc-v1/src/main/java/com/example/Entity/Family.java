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
	
	@Column(name ="NAME_FAMILY")
	private String nameFamily;
	
	@Column(name ="DATE_FAMILY")
	private String datePayment;
	
	@Column(name ="TYPE_FAMILY")
	private String typePayment;
	
	 
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "family")
	  private Set<Bill> listBill = new HashSet<>();

	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = ("family"))
	private Set<User> listUser = new HashSet<>();
	
	public Family() {
		super();
	}

	
	

	public Family(int idFamily, String nameFamily,  String typePayment) {
		super();
		this.idFamily = idFamily;
		this.nameFamily = nameFamily;
		this.datePayment = datePayment;
		this.typePayment = typePayment;
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

	public Set<Bill> getListBill() {
		return listBill;
	}

	public void setListBill(Set<Bill> listBill) {
		this.listBill = listBill;
	}

	public Set<User> getListUser() {
		return listUser;
	}

	public void setListUser(Set<User> listUser) {
		this.listUser = listUser;
	}
	
	
	
}
