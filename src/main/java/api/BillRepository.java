package api;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

}
