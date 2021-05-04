package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findByUsername(String username);
	
}
