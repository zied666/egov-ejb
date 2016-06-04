package com.egov.entities;

import com.egov.entities.Citoyen;

import java.io.Serializable;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Facture
 *
 */
@Entity
@Table(name = "egov_facture")
public class Facture implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer numero;
	@ManyToOne
	private Citoyen citoyen;
	private EtatFacture etat;
	private Float total;
	private static final long serialVersionUID = 1L;

	public Facture() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}   
	public Citoyen getCitoyen() {
		return this.citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	public EtatFacture getEtat() {
		return etat;
	}
	public void setEtat(EtatFacture etat) {
		this.etat = etat;
	}
}
