package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.example.Entity.Bill;
import com.example.Entity.User;

public interface BillRepository  extends JpaRepository<Bill, String>{

}
