package at.fh.swenga.model;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "ReceptHasIngredientModel")
public class ReceptHasIngredientModel implements java.io.Serializable{
	
	@ManyToOne
	private ReceptModel recept;
	
	@ManyToOne
	private IngredientModel ingredient;
	

}
