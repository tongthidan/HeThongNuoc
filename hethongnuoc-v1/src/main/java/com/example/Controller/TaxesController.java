package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Entity.MoneyUnit;
import com.example.Entity.Taxes;
import com.example.Repository.TaxesRepository;

@Controller
@RequestMapping("api")
public class TaxesController {
	@Autowired
	TaxesRepository taxesRepository;
	//getAllTaxes - ok
	@GetMapping("/getAllTaxes")
	@ResponseBody
	public List<Taxes> getAllTaxes() {
		return taxesRepository.findAll();
	}
	//findByName - ok

	@GetMapping("/findByNameTaxes/{nameTaxes}")
	@ResponseBody
	public List<Taxes> findByNameTaxes(@PathVariable("nameTaxes") String nameTaxes) {
		return taxesRepository.findByNameTaxes(nameTaxes);
	}
	//createNewBac -ok
		 @PostMapping("/createNewTaxes")
		 @ResponseBody
		 public HttpStatus createNewTaxes(@RequestBody Taxes taxes) {
			 try {
				 taxesRepository.save(taxes);
				 return HttpStatus.OK;
			} catch (Exception e) {
				// TODO: handle exception
				return HttpStatus.NOT_ACCEPTABLE;
			}
			 
		 }
	//updateBac -ok
		 
		 @PutMapping("/updateTaxesById/{id}")
		 @ResponseBody
		 public HttpStatus modifiTaxes(@PathVariable("id") long id, @RequestBody Taxes taxes) {
			 try {
				 Taxes t =  taxesRepository.findById(id).orElse(null);
				 System.out.println(t.getNameTaxes());
				 if(t != null) {
					 if(taxes.getNameTaxes() == null) {
						 t.setNameTaxes(t.getNameTaxes());
					 }
					 else if(taxes.getRetrict() == null) {
						t.setRetrict(t.getRetrict());
					 }
					 else if(taxes.getTypeTaxes() == null) {
						t.setTypeTaxes(t.getTypeTaxes());
					 }
					 else {
						 t.setNameTaxes(taxes.getNameTaxes());
						 t.setRetrict(taxes.getRetrict());
						 t.setTypeTaxes(taxes.getTypeTaxes());
						 }
					 taxesRepository.save(t);
				 }
				 return HttpStatus.OK;
			} catch (Exception e) {
				// TODO: handle exception
				return HttpStatus.NOT_MODIFIED;
			}
			 
			 
		 }
//		deletedBac 
		 @DeleteMapping("/deleteTaxesById/{id}")
		 @ResponseBody
		 public HttpStatus deleteTaxestById(@PathVariable("id")  long  id) {
			 try {
				 Taxes m =  taxesRepository.findById(id).orElse(null);
				 System.out.println(m.getNameTaxes());
				 if(m != null) {
					 taxesRepository.deleteById(id);
				 }
				return HttpStatus.OK;
			} catch (Exception e) {
				// TODO: handle exception
				return HttpStatus.NOT_MODIFIED;
			}
		 }

}
