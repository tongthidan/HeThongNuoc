//package com.example.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.example.Entity.MoneyUnit;
//import com.example.Repository.MoneyUnitRepository;
//
//@Controller
//@RequestMapping("api")
//public class MoneyUnitController {
//	@Autowired
//	private MoneyUnitRepository moneyUnitRepository;
////	getAll - ok
//	 @GetMapping("/getAllBac")
//	 @ResponseBody
//	 public List<MoneyUnit> getAllMoneyUnit(){
//		 
//		 return moneyUnitRepository.findAll();
//		 
//	 }
////findbyNameBAc -ok
//	 @GetMapping("/findByNameBac/{name}")
//	 @ResponseBody
//	 public List<MoneyUnit> findByName(@PathVariable("name") String name){
//		 
//		 return moneyUnitRepository.findByName(name);
//		 
//	 }
	 
//createNewBac -ok
//	 @PostMapping("/createNewBac")
//	 @ResponseBody
//	 public HttpStatus createNewMoneyUnit(@RequestBody MoneyUnit moneyUnit) {
//		 try {
//			 moneyUnitRepository.save(moneyUnit);
//			 return HttpStatus.OK;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return HttpStatus.NOT_ACCEPTABLE;
//		}
//		 
//	 }
////updateBac -ok
//	 
//	 @PutMapping("/updateBacById/{id}")
//	 @ResponseBody
//	 public HttpStatus modifiMoneyUnit(@PathVariable("id") long id, @RequestBody MoneyUnit moneyUnit) {
//		 try {
//			 MoneyUnit mU =  moneyUnitRepository.findById(id).orElse(null);
//			 System.out.println(mU.getName());
//			 if(mU != null) {
//				 if(moneyUnit.getName() == null) {
//					 mU.setName(mU.getName());
//				 }
//				 else if(moneyUnit.getDinhMuc() == null) {
//					 mU.setDinhMuc(moneyUnit.getDinhMuc());
//				 }
//				 else if(moneyUnit.getMoneyUnit() == null) {
//					 mU.setMoneyUnit(mU.getMoneyUnit());
//				 }
//				 else {
//					 mU.setName(moneyUnit.getName());
//					 mU.setDinhMuc(moneyUnit.getDinhMuc());
//					 mU.setMoneyUnit(moneyUnit.getMoneyUnit());
//				 }
//				 moneyUnitRepository.save(mU);
//			 }
//			 return HttpStatus.OK;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return HttpStatus.NOT_MODIFIED;
//		}
//		 
//		 
//	 }
////	deletedBac 
//	 @DeleteMapping("/deleteBac/{id}")
//	 @ResponseBody
//	 public HttpStatus deleteMoneyUnitById(@PathVariable("id")  long  id) {
//		 try {
//			 MoneyUnit m =  moneyUnitRepository.findById(id).orElse(null);
//			 System.out.println(m.getName());
//			 if(m != null) {
//				 moneyUnitRepository.deleteById(id);
//			 }
//			return HttpStatus.OK;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return HttpStatus.NOT_MODIFIED;
//		}
//	 }
//	 
//	 
	
	
//}
