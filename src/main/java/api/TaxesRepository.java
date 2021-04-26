package api;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Taxes;

public interface TaxesRepository extends JpaRepository<Taxes, Integer>{

	Optional<Taxes> findById(Integer idTaxes);

}
