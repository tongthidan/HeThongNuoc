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

//import com.example.DTO.FamilyDTO;
//import com.example.Entity.Family;
//import com.example.Mapper.FamilyMapping;
import com.example.Repository.FamilyRepository;

@RestController
@RequestMapping("api")
public class FamilyController {
	@Autowired
	public FamilyRepository familyRepository;
	FamilyMapping familyMapping = new FamilyMapping();

//	AccountRepository accountRepository;
	// getAll- ok
	@GetMapping(value = "getAllFamily")
	@ResponseBody
	public ResponseEntity<?> getAllFamily() {
		List<Family> listFamilies = familyRepository.findAll();
//		List<FamilyDTO> lisDtos = new ArrayList<FamilyDTO>();
//		for (Family f : listFamilies) {
//			FamilyDTO fDTO = familyMapping.FamilyMappperFamilyDTO(f);
//			lisDtos.add(fDTO);
//		}
//		return new ResponseEntity<>(lisDtos, HttpStatus.OK);
		return new ResponseEntity<>(listFamilies,HttpStatus.OK);
// 

	}

//	// findByName- ok
	@GetMapping("/findByMaHo/{maHo}")
	@ResponseBody
	public ResponseEntity<?> findByMaHo(@PathVariable("maHo") String maHo) {
		List<Family> listFamilies = familyRepository.findByMaHo(maHo);
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
			System.out.println(f.getTenChuHo());
			if (f != null) {
				if (family.getTenChuHo() == null) {
					f.setTenChuHo(f.getTenChuHo());
				} else if (family.getMaHo() == null) {
					f.setMaHo(f.getMaHo());
				} else if (family.getUsername() == null) {
					f.setUsername(f.getUsername());
				} else if (family.getPassword() == null) {
					f.setPassword(f.getPassword());
				} else if (family.getSoCanCuoc() == null) {
					f.setSoCanCuoc(f.getSoCanCuoc());
				} else if (family.getLoaiHo() == null) {
					f.setLoaiHo(f.getLoaiHo());
				} else if (family.getEmail() == null) {
					f.setEmail(f.getEmail());
				} else if (family.getSdt() == 0) {
					f.setSdt(f.getSdt());
				} else if (family.getDia_chi() == null) {
					f.setDia_chi(f.getDia_chi());
				}
//				else if(family.getLoaiHo()== "ho thuong") {
//					f.setSoHN(null);
//					
//				}
				else {
					f.setTenChuHo(family.getTenChuHo());
					f.setUsername(family.getUsername());
					f.setMaHo(family.getMaHo());
					f.setPassword(family.getPassword());
					f.setSoCanCuoc(family.getSoCanCuoc());
					f.setLoaiHo(family.getLoaiHo());
					f.setEmail(family.getEmail());
					f.setSdt(family.getSdt());
					f.setDia_chi(family.getDia_chi());
					f.setSoHN(family.getSoHN());
					f.setTrangThai(family.getTrangThai());
				}
				familyRepository.save(f);
				
			}
			return HttpStatus.OK;
		}

		catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_MODIFIED;
		}

	}

	// thêm family - ok
	@PostMapping("/createFamily")
	@ResponseBody
	public HttpStatus createFamily(@RequestBody Family family) {
		Family f = new Family();
		try {
			f.setIdFamily(family.getIdFamily());
			f.setUsername(family.getUsername());
			f.setPassword(family.getPassword());
			f.setDia_chi(family.getDia_chi());
			f.setEmail(family.getEmail());
			f.setSdt(family.getSdt());
			f.setSoCanCuoc(family.getSoCanCuoc());
			f.setSoHN(family.getSoHN());
			f.setTenChuHo(family.getTenChuHo());
			f.setMaHo(family.getMaHo());
			f.setLoaiHo(family.getLoaiHo());
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
	public HttpStatus deleteFamilyById(@PathVariable("id") long id) {
		try {
			familyRepository.deleteById(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_FOUND;
		}

	}

}
