package at.fh.swenga.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ReceptCategorieModel")
public class ReceptCategorieModel implements java.io.Serializable {

	@Id
	@Column(name = "id_receptCategorie")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 45)
	private String name;
	
	//Relationship
	//@OneToMany
	//private List<ReceptModel> recept;

	public ReceptCategorieModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceptCategorieModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
