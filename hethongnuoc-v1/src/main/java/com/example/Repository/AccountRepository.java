package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
	List<Account> findByUsername(String username);
//	@Query(value =  "SELECT a.USERNAME, a.PASSWORD, a.USER_ID\r\n"
//			+ "FROM account As a, user u\r\n"
//			+ "WHERE a.USER_ID = u.ID ")
//	List<Account> getAllAccount();
	
}
