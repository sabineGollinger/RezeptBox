package at.fh.swenga.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ingredient")
public class IngredientModel implements java.io.Serializable {

	@Id
	@Column(name = "id_ingredient")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 45)
	private String name;

	@Column(nullable = false)
	private int menge;

	/*---------------------------------------------------------*/
	// Relationship
	@OneToMany(mappedBy="receptHasIngredient")
	private List<ReceptHasIngredientModel> receptHas;

	@OneToOne
	private QuantityUnitModel quantity;

	/*---------------------------------------------------------*/

	public IngredientModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IngredientModel(String name, int menge) {
		super();
		this.name = name;
		this.menge = menge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public List<ReceptHasIngredientModel> getReceptHas() {
		return receptHas;
	}

	public void setReceptHas(List<ReceptHasIngredientModel> receptHas) {
		this.receptHas = receptHas;
	}

	public QuantityUnitModel getQuantity() {
		return quantity;
	}

	public void setQuantity(QuantityUnitModel quantity) {
		this.quantity = quantity;
	}

}
