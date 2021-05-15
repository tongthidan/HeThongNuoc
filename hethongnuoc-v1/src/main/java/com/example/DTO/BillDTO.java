package com.example.DTO;

import com.example.Entity.Family;
import com.example.Entity.Taxes;

public class BillDTO {
	long idBill;
	Family family;
	Taxes taxes;
	long monthUse;
	long CSCu;
	long CSMoi;
	long soNuoc;
	float thanhtien;
	float tienthue;
	float tongtien;
	String status;
	
	String nameFamily = family.getTenChuHo();
	
	public String getNameFamily() {
		
		return nameFamily;
	}
	public void setNameFamily(String nameFamily) {
		this.nameFamily = nameFamily;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getIdBill() {
		return idBill;
	}
	public void setIdBill(long idBill) {
		this.idBill = idBill;
	}
	public Family getFamily() {
		return family;
	}
	public void setFamily(Family family) {
		this.family = family;
	}
	public Taxes getTaxes() {
		return taxes;
	}
	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
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
	public float getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(float thanhtien) {
		this.thanhtien = thanhtien;
	}
	public float getTienthue() {
		return tienthue;
	}
	public void setTienthue(float tienthue) {
		this.tienthue = tienthue;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
	
	
	

}
