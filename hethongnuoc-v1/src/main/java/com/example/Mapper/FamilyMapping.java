package com.example.Mapper;



import com.example.DTO.FamilyDTO;

import com.example.Entity.Family;

public class FamilyMapping {
	
//	public Account FamilyDTOMapperAccount(FamilyDTO familyDTO) {
//		Account acc = new Account();
//		acc.setIdAccount(familyDTO.getIdFamily());
//		acc.setUsername(familyDTO.getUserName());
//		acc.setPassword(familyDTO.getPassWord());
//
//		return acc;
//		
//	}
	public FamilyDTO FamilyMappperFamilyDTO(Family family) {
		
		FamilyDTO familyDTO = new FamilyDTO();
		familyDTO.setIdFamily(family.getIdFamily());
		familyDTO.setTenChuHo(family.getTenChuHo());
		familyDTO.setMaHo(family.getMaHo());
		familyDTO.setSoCanCuoc(family.getSoCanCuoc());
		familyDTO.setLoaiHo(family.getLoaiHo());
		familyDTO.setEmail(family.getEmail());
		familyDTO.setDiaChi(family.getDia_chi());
		familyDTO.setSdt(family.getSdt());
		
			familyDTO.setSoHN(family.getSoHN());

		
		familyDTO.setUserName(family.getUsername());
		familyDTO.setPassWord(family.getPassword());
//		familyDTO.setTrangthaiTT(family.getTrangThai());
		return familyDTO;
	}

	public Family FamilyDTOMappperFamily(FamilyDTO familyDTO) {
		
		Family family = new Family();
		family.setIdFamily(familyDTO.getIdFamily());
		family.setUsername(familyDTO.getUserName());
		family.setPassword(familyDTO.getPassWord());
		family.setTenChuHo(familyDTO.getTenChuHo());
		family.setMaHo(familyDTO.getMaHo());
		family.setSoCanCuoc(familyDTO.getSoCanCuoc());
		family.setIdFamily(familyDTO.getIdFamily());
		family.setLoaiHo(familyDTO.getLoaiHo());
		family.setEmail(familyDTO.getEmail());
		family.setDia_chi(familyDTO.getDiaChi());
		family.setSdt(familyDTO.getSdt());
		family.setSoHN(familyDTO.getSoHN());

		
		return family;
	}
}
