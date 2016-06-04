package com.egov.entities;

import com.egov.entities.Citoyen;

import java.io.Serializable;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ContratMariage
 *
 */
@Entity
@Table(name = "egov_contra_mariage")
public class ContratMariage implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Citoyen mari;
	@ManyToOne
	private Citoyen femme;
	private static final long serialVersionUID = 1L;

	public ContratMariage() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Citoyen getMari() {
		return this.mari;
	}

	public void setMari(Citoyen mari) {
		this.mari = mari;
	}   
	public Citoyen getFemme() {
		return this.femme;
	}

	public void setFemme(Citoyen femme) {
		this.femme = femme;
	}
   
}
