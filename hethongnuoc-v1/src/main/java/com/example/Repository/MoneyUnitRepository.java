package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.MoneyUnit;

public interface MoneyUnitRepository  extends JpaRepository<MoneyUnit, String>{

}
