package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.DTO.BillDTO;
import com.example.Entity.Bill;
import com.example.Mapper.BillMapping;
import com.example.Repository.BillRepository;

@Controller
@RequestMapping("api")
public class BillController {
	 @Autowired
	 BillRepository billRepository;
	 BillMapping billMapping = new BillMapping();
	 @GetMapping("/getAllBill")
	 @ResponseBody
	 public ResponseEntity<?> getAllBill(){
		 List<Bill> listBill = billRepository.findAll();
//		 List<BillDTO> listBillDTOs = new ArrayList<BillDTO>();
//		 for(Bill b: listBill) {
//			 BillDTO billDTO = billMapping.BillMapperBillDTO(b);
//			 System.out.println(billDTO.getFamily().getTenChuHo());
//			 listBillDTOs.add(billDTO);
//		 }
//		
//		 return listBillDTOs;
		 return new ResponseEntity<>(listBill,HttpStatus.OK);

	 }
	 
	 @GetMapping("/findByMonthUse/{monthUse}")
	 @ResponseBody
	 public List<Bill> findByMonthUse(@PathVariable("monthUse") int monthUse){
		 return ((BillRepository) billRepository).findByMonthUse(monthUse);
	 }

}
