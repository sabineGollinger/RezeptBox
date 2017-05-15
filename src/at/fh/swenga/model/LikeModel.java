package at.fh.swenga.model;

import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name = "Like")
public class LikeModel implements java.io.Serializable{
	
	@ManyToOne
	private UserModel user;
	
	@ManyToOne
	private ReceptModel recept;

}
