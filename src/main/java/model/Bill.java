package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bill")
@Getter
@Setter

public class Bill {
	@Id
	@Column(name = "id2") //Đây là ID của BILL
	private int idBill;
	@Column(name = "total")
	private float toltal;
	@Column(name = "monthuse")
	private int monthUse;
	@Column(name = "status")
	private String status;
	@Column(name = "sonuoc")
	private int soNuoc;
	@OneToOne
	@JoinColumn(name = "idtaxes")
	private Taxes taxes;

}