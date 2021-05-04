package com.example.Controller;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

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

	// getAll- ok
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

	// findByName- ok
	@GetMapping("/findFamilyByName/{nameFamily}")
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
	// update family- ok
	@PutMapping("/changeFamily/{id}")
	@ResponseBody
	public HttpStatus modifiLogin(@PathVariable long id, @RequestBody Family family) {

		try {

			Family f = familyRepository.findById(id).orElse(null);
			System.out.println(f);
			if(f != null) {
				if (family.getNameFamily() == null) {
					f.setNameFamily(f.getNameFamily());
				} 
				else if (family.getDatePayment() == null) {
					f.setDatePayment(f.getDatePayment());
				}
				else if (family.getTypePayment() == null) {
					f.setTypePayment(f.getTypePayment());
				} else {
					f.setNameFamily(family.getNameFamily());
					f.setDatePayment(family.getDatePayment());
					f.setTypePayment(family.getTypePayment());
				}
				familyRepository.save(f);
			}
			
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
			familyRepository.save(family);
			return HttpStatus.OK;

		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_FOUND;
		}

	}

	// deleteFamily -ok
	@DeleteMapping(value = "deleteFamilyById/{id}")
	@Transactional
	@ResponseBody
	public HttpStatus deleteFamilyById(@PathVariable("id") long  id) {
		try {
			familyRepository.deleteById(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_FOUND;
		}

	}

}
