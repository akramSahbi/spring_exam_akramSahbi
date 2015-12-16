package akram.esprit.examen.spring.historique.domain.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import akram.esprit.examen.spring.historique.domain.contract.IHistoriqueDao;
import akram.esprit.examen.spring.historique.domain.entities.Historique_navigation;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;
import akram.esprit.examen.spring.historique.domain.entities.Personne;



@Repository
@Transactional
public class HistoriqueDao implements IHistoriqueDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addHistorique_navigation(Historique_navigation Historique_navigation) {
		em.persist(Historique_navigation);
	}

	@Override
	public void updateHistorique_navigation(Historique_navigation Historique_navigation) {
		em.merge(Historique_navigation);
	}

	@Override
	public void deleteHistorique_navigation(int cin) {
		em.remove(findHistorique_navigationById(cin));
	}

	@Override
	public Historique_navigation findHistorique_navigationById(int cin) {
		return em.find(Historique_navigation.class, cin);
	}

	@Override
	public List<Historique_navigation> findAllHistorique_navigations() {
		TypedQuery<Historique_navigation> query = em.createQuery("select s from Historique_navigation s", Historique_navigation.class);
		return query.getResultList();
	}

	@Override
	public List<Historique_navigation> findAllHistorique_navigationsByPersonneAndNavigateur(Personne personne,
			Navigateur navigateur) {
		// TODO Auto-generated method stub
		TypedQuery<Historique_navigation> query = em.createQuery("select s from Historique_navigation s where s.navigateur.idNaviguateur = "+navigateur.getIdNaviguateur()+" and s.personne.idPersonne = " + personne.getIdPersonne(), Historique_navigation.class);
		return query.getResultList();
	}

	

}
