package com.egov.entities;

import com.egov.entities.Citoyen;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CompteCourrant
 *
 */
@Entity
@Table(name = "egov_compte_courrant")
public class CompteCourrant implements Serializable {


	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	private Integer rib;
	private Float montant;
	@ManyToOne
	private Citoyen citoyen;
	private static final long serialVersionUID = 1L;

	public CompteCourrant() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Integer getRib() {
		return this.rib;
	}

	public void setRib(Integer rib) {
		this.rib = rib;
	}   
	public Float getMontant() {
		return this.montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}   
	public Citoyen getCitoyen() {
		return this.citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
   
}
