package akram.esprit.examen.spring.historique.domain.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import akram.esprit.examen.spring.historique.domain.contract.INavigateurDao;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;



@Repository
@Transactional
public class NavigateurDao implements INavigateurDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addNavigateur(Navigateur Navigateur) {
		em.persist(Navigateur);
	}

	@Override
	public void updateNavigateur(Navigateur Navigateur) {
		em.merge(Navigateur);
	}

	@Override
	public void deleteNavigateur(int cin) {
		em.remove(findNavigateurById(cin));
	}

	@Override
	public Navigateur findNavigateurById(int cin) {
		return em.find(Navigateur.class, cin);
	}

	@Override
	public List<Navigateur> findAllNavigateurs() {
		TypedQuery<Navigateur> query = em.createQuery("select s from Navigateur s", Navigateur.class);
		return query.getResultList();
	}

	

}
