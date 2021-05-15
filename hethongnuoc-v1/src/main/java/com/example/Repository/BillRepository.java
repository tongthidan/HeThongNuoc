package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.example.Entity.Bill;


public interface BillRepository  extends JpaRepository<Bill, Long>{
	List<Bill> findByMonthUse(long monthUse);
}
