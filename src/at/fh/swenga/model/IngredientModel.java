package at.fh.swenga.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class IngredientModel implements java.io.Serializable {

	@Id
	@Column(name = "id_ingredient")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 45)
	private String name;

	@Column(nullable = false)
	private int menge;

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

	public IngredientModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IngredientModel(String name, int menge) {
		super();
		this.name = name;
		this.menge = menge;
	}

}
