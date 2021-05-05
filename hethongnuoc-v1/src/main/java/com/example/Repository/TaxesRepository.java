package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Taxes;

public interface TaxesRepository extends JpaRepository<Taxes, Long>{
	List<Taxes> findByNameTaxes(String nameTaxes);
}
