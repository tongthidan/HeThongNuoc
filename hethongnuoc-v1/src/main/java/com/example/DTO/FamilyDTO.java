package com.example.DTO;

import java.sql.Date;

public class FamilyDTO {
	private long idFamily;
	
	private String tenChuHo;
	private String maHo;
	private String soCanCuoc;
	private String loaiHo;
	private String soHN;
	private String email;
	private long sdt;
	private String diaChi;
//	private String trangthaiTT;
	private String userName;
	private String passWord;
	
	public String getSoHN() {
		return soHN;
	}

	public void setSoHN(String soHN) {
		this.soHN = soHN;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public FamilyDTO() {
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

	public String getSoCanCuoc() {
		return soCanCuoc;
	}

	public void setSoCanCuoc(String soCanCuoc) {
		this.soCanCuoc = soCanCuoc;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

//	public String getTrangthaiTT() {
//		return trangthaiTT;
//	}
//
//	public void setTrangthaiTT(String trangthaiTT) {
//		this.trangthaiTT = trangthaiTT;
//	}
	
	
	
}
