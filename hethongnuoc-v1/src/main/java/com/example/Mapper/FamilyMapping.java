package com.example.Mapper;



import com.example.DTO.FamilyDTO;
import com.example.Entity.Family;

public class FamilyMapping {
	public FamilyDTO FamilyMappperFamilyDTO(Family family) {
		FamilyDTO familyDTO = new FamilyDTO();
		familyDTO.setIdFamily(family.getIdFamily());
		familyDTO.setNameFamily(family.getNameFamily());
		familyDTO.setDatePayment(family.getDatePayment());
		familyDTO.setTypePayment(family.getTypePayment());
		return familyDTO;
	}

	public Family FamilyDTOMappperFamily(FamilyDTO familyDTO) {
		Family family = new Family();
		family.setIdFamily(familyDTO.getIdFamily());
		family.setNameFamily(familyDTO.getNameFamily());
		family.setDatePayment(familyDTO.getDatePayment());
		family.setTypePayment(familyDTO.getTypePayment());
		return family;
	}
}
