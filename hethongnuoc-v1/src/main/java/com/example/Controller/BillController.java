package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Entity.Bill;
import com.example.Repository.BillRepository;

@Controller
@RequestMapping("api")
public class BillController {
	 @Autowired
	 BillRepository billRepository;
	 
	 @GetMapping("/getAllBill")
	 @ResponseBody
	 public List<Bill> getAllBill(){
		 List<Bill> listBill = billRepository.findAll();
		 return listBill;
	 }

}
