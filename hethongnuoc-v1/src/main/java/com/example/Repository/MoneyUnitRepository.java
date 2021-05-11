package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.MoneyUnit;

public interface MoneyUnitRepository  extends JpaRepository<MoneyUnit, Long>{
//	List<MoneyUnit> findByName(String name);
}
