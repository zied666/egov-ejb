package com.egov.entities;

import com.egov.entities.Facture;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FactureSteg
 *
 */
@Entity

public class FactureSteg extends Facture implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FactureSteg() {
		super();
	}
   
}
