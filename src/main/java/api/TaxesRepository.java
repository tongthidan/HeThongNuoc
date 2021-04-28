package api;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Taxes;

public interface TaxesRepository extends JpaRepository<Taxes, Integer>{

}
