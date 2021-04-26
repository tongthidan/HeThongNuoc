package api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Taxes;

@Controller
@RequestMapping(value = "/api/taxes")

public class TaxesController {
	@Autowired
	private TaxesRepository taxesRes;
	
	@GetMapping(value = "/")
	@ResponseBody
	public List<Taxes> getAllTaxes(){
		return taxesRes.findAll();
	}
	
	@GetMapping(value = "/{idTaxes}")
	@ResponseBody
	public Optional<Taxes> findByIdTaxes(@PathVariable("idTaxes") int idTaxes){
		return taxesRes.findById(idTaxes);
	}
	
	@PostMapping(value = "/")
	@ResponseBody
	public HttpStatus postTaxes(@RequestBody Taxes taxes) {
		taxesRes.save(taxes);
		return HttpStatus.OK;
	}
	
	@PutMapping(value = "/{idTaxes}")
	@ResponseBody
	public HttpStatus putTaxes(@PathVariable Integer idTaxes, @RequestBody Taxes taxes) {
		taxes.setIdTaxes(idTaxes);
		taxesRes.save(taxes);
		return HttpStatus.OK;
	}
	
	@DeleteMapping(value = "/")
	@ResponseBody
	public HttpStatus delTaxes() {
		taxesRes.deleteAll();
		return HttpStatus.OK;
	}
	
	@DeleteMapping(value = "/{idTaxes}")
	@ResponseBody
	public HttpStatus delTaxes(@PathVariable Integer idTaxes, @RequestBody Taxes taxes) {
		taxesRes.deleteById(idTaxes);
		return HttpStatus.OK;
	}

}
