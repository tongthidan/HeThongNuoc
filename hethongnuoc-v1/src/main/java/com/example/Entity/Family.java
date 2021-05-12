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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import antlr.collections.List;
@Entity
@Table(name ="family")
public class Family implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private long idFamily;
	@Column(name = "user_name")
	private String username;
	@Column(name = "pass_word")
	private String password;
	@Column(name ="ten_chu_ho")
	private String tenChuHo;
	@Column(name ="so_can_cuoc")
	private String SoCanCuoc;
	@Column(name ="ma_ho")
	private String maHo;
	
	
	
	@Column(name = "loai_ho")
	private String loaiHo;
	@Column(name = "so_ho_ngheo")
	private String soHN;
	@Column(name = "email")
	private String email;
	@Column(nullable=true,name = "sdt")
	private Long sdt;
	
	@Column(name = "dia_chi")
	private String dia_chi;
	@Column(name = "trang_thai")
	private String trangThai;
	
	 
	


	public String getSoCanCuoc() {
		return SoCanCuoc;
	}


	public void setSoCanCuoc(String soCanCuoc) {
		SoCanCuoc = soCanCuoc;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSoHN() {
		return soHN;
	}
	

	public void setSdt(Long sdt) {
		this.sdt = sdt;
	}

	public void setSoHN(String soHN) {
		this.soHN = soHN;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "family")
	  private Set<Bill> listBill = new HashSet<>();

	public Family() {
		super();
	}

	public long getIdFamily() {
		return idFamily;
	}

	public void setIdFamily(long idFamily) {
		this.idFamily = idFamily;
	}

	public String getTenChuHo() {
		return tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}

	public String getMaHo() {
		return maHo;
	}

	public void setMaHo(String maHo) {
		this.maHo = maHo;
	}

	



	public String getLoaiHo() {
		return loaiHo;
	}

	public void setLoaiHo(String loaiHo) {
		this.loaiHo = loaiHo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSdt() {
		return sdt;
	}

	public void setSdt(long sdt) {
		this.sdt = sdt;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Set<Bill> getListBill() {
		return listBill;
	}

	public void setListBill(Set<Bill> listBill) {
		this.listBill = listBill;
	}

	
}
