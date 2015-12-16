package akram.esprit.examen.spring.historique.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Historique_navigation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idHistorique_navigation;
	private String url;
	private Date date_entree;
	@ManyToOne(targetEntity=Navigateur.class)
	private Navigateur navigateur;
	@ManyToOne(targetEntity=Personne.class)
	private Personne personne;
	
	public int getIdHistorique_navigation() {
		return idHistorique_navigation;
	}
	public void setIdHistorique_navigation(int idHistorique_navigation) {
		this.idHistorique_navigation = idHistorique_navigation;
	}
	public Date getDate_entree() {
		return date_entree;
	}
	public void setDate_entree(Date date_entree) {
		this.date_entree = date_entree;
	}
	public Navigateur getNavigateur() {
		return navigateur;
	}
	public void setNavigateur(Navigateur navigateur) {
		this.navigateur = navigateur;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Historique_navigation() {
		super();
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Historique_navigation(String url, Date date_entree, Navigateur navigateur, Personne personne) {
		super();
		this.url = url;
		this.date_entree = date_entree;
		this.navigateur = navigateur;
		this.personne = personne;
	}
	
	
	
	
	

}
