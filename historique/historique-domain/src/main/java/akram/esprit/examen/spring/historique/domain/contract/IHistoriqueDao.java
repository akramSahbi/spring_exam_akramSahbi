package akram.esprit.examen.spring.historique.domain.contract;

import java.util.List;

import akram.esprit.examen.spring.historique.domain.entities.Historique_navigation;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;
import akram.esprit.examen.spring.historique.domain.entities.Personne;



public interface IHistoriqueDao {

	public void addHistorique_navigation(Historique_navigation Historique_navigation);

	public void updateHistorique_navigation(Historique_navigation Historique_navigation);

	public void deleteHistorique_navigation(int cin);

	public Historique_navigation findHistorique_navigationById(int cin);

	public List<Historique_navigation> findAllHistorique_navigations();
	public List<Historique_navigation> findAllHistorique_navigationsByPersonneAndNavigateur(Personne personne, Navigateur navigateur);
	

}
