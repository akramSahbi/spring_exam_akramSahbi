package akram.esprit.examen.spring.historique.domain.contract;

import java.util.List;

import akram.esprit.examen.spring.historique.domain.entities.Personne;



public interface IPersonneDao {

	public void addPersonne(Personne Personne);

	public void updatePersonne(Personne Personne);

	public void deletePersonne(int cin);

	public Personne findPersonneById(int cin);

	public List<Personne> findAllPersonnes();
	public boolean authenticatePersonne(String firstname, String lastname);

}
