package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Family;

@Repository

public interface FamilyRepository extends JpaRepository<Family, String> {
	List<Family> findByNameFamily(String nameFamily);

	void deleteByNameFamily(String nameFamily);
}
