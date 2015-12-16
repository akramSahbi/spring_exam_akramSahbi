package akram.esprit.examen.spring.historique.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPersonne;
	private String login;
	private String password;
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Personne() {
		super();
	}
	public Personne(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	
	
	
}
