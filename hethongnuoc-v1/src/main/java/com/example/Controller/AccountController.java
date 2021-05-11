package com.example.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Account;
//import com.example.Mapper.AccountMapping;
import com.example.Repository.AccountRepository;
import com.example.DTO.AccountDTO;



@RestController
@RequestMapping("api")
public class AccountController {
	@Autowired
	public AccountRepository accountRepository;

//	AccountMapping accountMapping = new AccountMapping();
	
	
	
//	getAllAccount -ok 
	@GetMapping(value = "/getAllAccount")
	public ResponseEntity<?> getAllAccount(){
		List<Account> listAccount = accountRepository.findAll();
//		List<AccountDTO> listDTO = new ArrayList<>();
//		for(Account item: listAccount) {
//			AccountDTO accountDTO = accountMapping.AccountMapperAccountDTO(item);
//			listDTO.add(accountDTO);
//		} 
//		return new ResponseEntity<>(listDTO, HttpStatus.OK);
		return new ResponseEntity<>(listAccount, HttpStatus.OK);
	}
//	findAccount by Name - ok
//	@GetMapping(value = "findAccount/{userName}")
//	
//	public ResponseEntity<?> findByUserName(@PathVariable("userName") String userName){
//		List<Account> listAccount = accountRepository.findByUsername(userName);
//		
//		List<AccountDTO> listDTO = new ArrayList<>();
//		for(Account item: listAccount) {
//			AccountDTO accountDTO = accountMapping.AccountMapperAccountDTO(item);
//			listDTO.add(accountDTO);
//		} 
//		return new ResponseEntity<>(listDTO, HttpStatus.OK);
//	}
//	
//// deleteAccount  - ok
//	@DeleteMapping("/deleteAccount/{id}")
//	@Transactional
//	@ResponseBody
//	public HttpStatus deleteAccountById(@PathVariable("id") long id) {
//		try {
//			accountRepository.deleteById(id);
//			return HttpStatus.OK;
//		} catch (Exception e) {
//			// TODO: handle exception
//			return HttpStatus.NOT_FOUND;
//		}
//
//	}
////Create Account -ok
//	@PostMapping("/createAccount")
//	@ResponseBody
//	public HttpStatus createNewAccount(@RequestBody Account account) {
//		try {
//			Account acc = new Account();
//			acc.setIdAccount(account.getIdAccount());
//			acc.setUsername(account.getUsername());
//			acc.setPassword(account.getPassword());
//			accountRepository.save(acc);
//			return HttpStatus.OK;
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			return HttpStatus.NOT_ACCEPTABLE;
//		}
//		
//	}
//	
//	//Update Account -ok
//	@PutMapping("/modifyAccount/{id}")
//	@ResponseBody
//	public HttpStatus modifiAccount(@PathVariable("id") long id, @RequestBody Account account) {
//		try {
//			Account acc = accountRepository.findById(id).orElse(null);
//			System.out.println(acc.getUsername());
//			if(acc != null) {
//				if(account.getUsername() == null) {
//					acc.setUsername(acc.getUsername());
//				}
//				else if(account.getPassword() == null) {
//					acc.setPassword(acc.getPassword());
//				}
//				else if (account.getPassword() != null &&  account.getUsername() != null) {
//					acc.setUsername(account.getUsername());
//					acc.setPassword(account.getPassword());
//				}
//				accountRepository.save(acc);
//				
//				
//			}
//			return HttpStatus.OK;
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			return HttpStatus.NOT_MODIFIED;
//		}
//	}
}