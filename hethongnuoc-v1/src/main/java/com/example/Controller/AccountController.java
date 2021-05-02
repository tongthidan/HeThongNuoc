package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Account;
import com.example.Mapper.AccountMapping;
import com.example.Repository.AccountRepository;
import com.example.DTO.AccountDTO;



@RestController
@RequestMapping("api")
public class AccountController {
	@Autowired
	public AccountRepository accountRepository;

	AccountMapping accountMapping = new AccountMapping();
	
	@GetMapping(value = "/getAllAccount")
	public ResponseEntity<?> getAllAccount(){
		List<Account> listAccount = accountRepository.findAll();
		List<AccountDTO> listDTO = new ArrayList<>();
		for(Account item: listAccount) {
			AccountDTO accountDTO = accountMapping.AccountMapperAccountDTO(item);
			listDTO.add(accountDTO);
		} 
		return new ResponseEntity<>(listDTO, HttpStatus.OK);
	}
	@GetMapping(value = "findAccount/{userName}")
	
	public ResponseEntity<?> findByUserName(@PathVariable("userName") String userName){
		List<Account> listAccount = accountRepository.findByUsername(userName);
		
		List<AccountDTO> listDTO = new ArrayList<>();
		for(Account item: listAccount) {
			AccountDTO accountDTO = accountMapping.AccountMapperAccountDTO(item);
			listDTO.add(accountDTO);
		} 
		return new ResponseEntity<>(listDTO, HttpStatus.OK);
	}
	
	// deleteUser - 
	@DeleteMapping(value = "deleteAccount/{id}")
	@ResponseBody
	public HttpStatus deleteLoginById(@PathVariable("id") String id) {
		try {
			accountRepository.deleteById(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			// TODO: handle exception
			return HttpStatus.NOT_ACCEPTABLE;
		}
		
		
	}
}