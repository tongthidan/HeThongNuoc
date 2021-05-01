package com.example.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.FamilyDTO;
import com.example.Entity.Family;
import com.example.Mapper.FamilyMapping;
import com.example.Repository.FamilyRepository;


@RestController
@RequestMapping("api")
public class FamilyController {
	@Autowired
	public FamilyRepository familyRepository;
	FamilyMapping familyMapping = new FamilyMapping();

	// getALl
	@GetMapping(value = "/getAllFamily")
	@ResponseBody
	public ResponseEntity<?> getAllFamily() {
		List<Family> families = familyRepository.findAll();
		List<FamilyDTO> familyDTOs = new ArrayList<>();
		
		for (Family f : families) {
			FamilyDTO fDto = familyMapping.FamilyMappperFamilyDTO(f);
			familyDTOs.add(fDto);

		}
		return new ResponseEntity<>(familyDTOs, HttpStatus.OK);

	}

	// findByName
	@GetMapping("/find/{nameFamily}")
	@ResponseBody
	public ResponseEntity<?> findByNameFamily(@PathVariable("nameFamily") String nameFamily) {
		List<Family> listFamilies = familyRepository.findByNameFamily(nameFamily);
		List<FamilyDTO> listFamilyDTOs = new ArrayList<>();
		for (Family f : listFamilies) {
			FamilyDTO familyDTO = familyMapping.FamilyMappperFamilyDTO(f);
			listFamilyDTOs.add(familyDTO);
		}
		return new ResponseEntity<>(listFamilyDTOs, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	@ResponseBody
	public HttpStatus modifiLogin(@PathVariable String id, @RequestBody Family family) {

		try {

			Family f = familyRepository.findById(id).orElse(null);
			System.out.println(f);
			if (family.getNameFamily() == null) {
				family.setNameFamily(f.getNameFamily());
			} 
//			else if (family.getDatePayment() == null) {
//				family.setDatePayment(f.getDatePayment());
//			}
		else if (family.getTypePayment() == null) {
				family.setTypePayment(f.getTypePayment());
			} else {
				family.setNameFamily(family.getNameFamily());
//				family.setDatePayment(family.getDatePayment());
				family.setTypePayment(family.getTypePayment());
			}
			familyRepository.save(family);
			return HttpStatus.OK;

		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_MODIFIED;
		}

	}

	// thêm family - ok
	@PostMapping("/createFamily")
	@ResponseBody
	public HttpStatus createFamily(@RequestBody Family family) {
		try {
			//family.setIdFamily(3);
			family.setNameFamily("DAN P");
//			family.setDatePayment("2021-01-02");
			family.setTypePayment("Vi MOMO");
			familyRepository.save(family);
			return HttpStatus.OK;

		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_FOUND;
		}

	}

	// deleteFamily -
	@DeleteMapping(value = "delete/{nameFamily}")
	@ResponseBody
	public HttpStatus deleteFamilyByNameFamily(@PathVariable("nameFamily") String nameFamily) {
		try {
			familyRepository.deleteByNameFamily(nameFamily);
			return HttpStatus.OK;
		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_FOUND;
		}

	}

}
