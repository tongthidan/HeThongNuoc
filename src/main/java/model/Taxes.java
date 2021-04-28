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
@Table(name = "taxes")
@Getter
@Setter

public class Taxes {
	@Id
	@Column(name = "idtaxes")
	private int idTaxes;
	@Column(name = "nametaxes")
	private String nameTaxes;
	@Column(name = "retrict")
	private String retrict;
	@Column(name = "typetaxes")
	private String typeTaxes;
}