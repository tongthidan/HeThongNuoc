package api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import lombok.Getter;
import model.Bill;

@Controller
@RequestMapping(value = "/api/bill")

public class BillController {
	@Autowired
	private BillRepository billRes;
	
	@GetMapping(value = "/")
	@ResponseBody
	public List<Bill> getAllBill(){
		return billRes.findAll();
	}
	
	@GetMapping(value = "/{idBill}")
	@ResponseBody
	public Optional<Bill> FindById(@PathVariable("idBill") int idBill){
		return billRes.findById(idBill);
	}
	
	@PostMapping(value = "/")
	@ResponseBody
	public HttpStatus postBill(@RequestBody Bill bill) {
		billRes.save(bill);
		return HttpStatus.OK;
	}
	
	@PutMapping(value = "/{idBill}")
	@ResponseBody
	public HttpStatus putBill(@PathVariable Integer idBill, @RequestBody Bill bill) {
		bill.setIdBill(idBill);
		billRes.save(bill);
		return HttpStatus.OK;
	}
	
	@DeleteMapping(value = "/")
	@ResponseBody
	public HttpStatus delBill() {
		billRes.deleteAll();
		return HttpStatus.OK;
	}
	
	@DeleteMapping(value = "/{idBill}")
	@ResponseBody
	public HttpStatus delBill(@PathVariable Integer idBill, @RequestBody Bill bill) {
		billRes.deleteById(idBill);
		return HttpStatus.OK;
	}

}