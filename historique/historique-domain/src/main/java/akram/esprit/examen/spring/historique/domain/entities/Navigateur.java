package akram.esprit.examen.spring.historique.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="Navigateur")
public class Navigateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idNaviguateur;
	//@NotEmpty(message = "Le prénom ne doit pas être vide")
	//@Size(min = 3, max = 10)
	private String name;
	//@NotEmpty(message = "Le nom ne doit pas être vide")
	//@Size(min = 3, max = 10)
	private float version;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "navigateur", cascade = CascadeType.ALL)
	private List<Historique_navigation> historiques = new ArrayList<Historique_navigation>();

	public Navigateur() {
		// TODO Auto-generated constructor stub
	}

	public int getIdNaviguateur() {
		return idNaviguateur;
	}

	public void setIdNaviguateur(int idNaviguateur) {
		this.idNaviguateur = idNaviguateur;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	public List<Historique_navigation> getHistoriques() {
		return historiques;
	}

	public void setHistoriques(List<Historique_navigation> historiques) {
		this.historiques = historiques;
	}

	public Navigateur(int idNaviguateur, String name, float version, List<Historique_navigation> historiques) {
		super();
		this.idNaviguateur = idNaviguateur;
		this.name = name;
		this.version = version;
		this.historiques = historiques;
	}

	public Navigateur(String name, float version, List<Historique_navigation> historiques) {
		super();
		this.name = name;
		this.version = version;
		this.historiques = historiques;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((historiques == null) ? 0 : historiques.hashCode());
		result = prime * result + idNaviguateur;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(version);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Navigateur other = (Navigateur) obj;
		if (historiques == null) {
			if (other.historiques != null)
				return false;
		} else if (!historiques.equals(other.historiques))
			return false;
		if (idNaviguateur != other.idNaviguateur)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(version) != Float.floatToIntBits(other.version))
			return false;
		return true;
	}

	public Navigateur(String name, float version) {
		super();
		this.name = name;
		this.version = version;
	}
	
	

	
}
