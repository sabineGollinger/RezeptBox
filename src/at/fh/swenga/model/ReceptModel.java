package at.fh.swenga.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Rezepte")
public class ReceptModel implements java.io.Serializable {

	// Attribute
	@Id
	@Column(name = "id_recept")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 45)
	private String name;

	@Column(nullable = false, length = 500)
	private String beschreibung;

	@Column(nullable = false, length = 1000)
	private String zubereitung;

	@Version
	long version;

	// Relationships
	@OneToMany(mappedBy="comment")
	private List<CommentModel> comment;

	@ManyToOne
	private UserModel user;

	@OneToMany(mappedBy = "like")
	private List<LikeModel> like;

	@ManyToOne
	private ReceptCategorieModel receptCategory;

	@OneToMany(mappedBy = "receptHas")
	private List<ReceptHasIngredientModel> receptHas;

	public ReceptModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceptModel(String name, String beschreibung, String zubereitung) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
		this.zubereitung = zubereitung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getZubereitung() {
		return zubereitung;
	}

	public void setZubereitung(String zubereitung) {
		this.zubereitung = zubereitung;
	}

	public int getId1() {
		return id;
	}

	public void setId1(int id) {
		this.id = id;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public List<LikeModel> getLike() {
		return like;
	}

	public void setLike(List<LikeModel> like) {
		this.like = like;
	}

	public ReceptCategorieModel getReceptCategory() {
		return receptCategory;
	}

	public void setReceptCategory(ReceptCategorieModel receptCategory) {
		this.receptCategory = receptCategory;
	}

	public List<ReceptHasIngredientModel> getReceptHas() {
		return receptHas;
	}

	public void setReceptHas(List<ReceptHasIngredientModel> receptHas) {
		this.receptHas = receptHas;
	}

	public List<CommentModel> getComments() {
		return comment;
	}

	public void setComments(List<CommentModel> comment) {
		this.comment = comment;
	}

}
