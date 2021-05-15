package com.example.Mapper;

import com.example.DTO.BillDTO;
import com.example.Entity.Bill;

public class BillMapping {
	public BillDTO BillMapperBillDTO(Bill bill) {
		BillDTO billDTO = new BillDTO();
		billDTO.setIdBill(bill.getIdBill());
		billDTO.setCSCu(bill.getCSCu());
		billDTO.setCSMoi(bill.getCSMoi());
		billDTO.setSoNuoc(bill.getSoNuoc());
		billDTO.setFamily(bill.getFamily());
		billDTO.setTaxes(bill.getTaxes());
		billDTO.setFamily(bill.getFamily());
		billDTO.setThanhtien(bill.getThanhTien());
		billDTO.setTienthue(bill.getTienThue());
		billDTO.setTongtien(bill.getTongTien());
		billDTO.setStatus(bill.getStatus());
		
		return billDTO;
	}

}
