package akram.esprit.examen.spring.historique.contract;

import java.util.List;

import akram.esprit.examen.spring.historique.domain.entities.Navigateur;



public interface INavigateurService {

	public void addNavigateur(Navigateur Navigateur);

	public void updateNavigateur(Navigateur Navigateur);

	public void deleteNavigateur(int cin);

	public Navigateur findNavigateurById(int cin);

	public List<Navigateur> findAllNavigateurs();
	

}
