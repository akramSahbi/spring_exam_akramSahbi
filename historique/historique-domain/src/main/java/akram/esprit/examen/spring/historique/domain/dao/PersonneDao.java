package akram.esprit.examen.spring.historique.domain.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import akram.esprit.examen.spring.historique.domain.contract.IPersonneDao;
import akram.esprit.examen.spring.historique.domain.entities.Personne;



@Repository
@Transactional
public class PersonneDao implements IPersonneDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addPersonne(Personne Personne) {
		em.persist(Personne);
	}

	@Override
	public void updatePersonne(Personne Personne) {
		em.merge(Personne);
	}

	@Override
	public void deletePersonne(int cin) {
		em.remove(findPersonneById(cin));
	}

	@Override
	public Personne findPersonneById(int cin) {
		return em.find(Personne.class, cin);
	}

	@Override
	public List<Personne> findAllPersonnes() {
		TypedQuery<Personne> query = em.createQuery("select s from Personne s", Personne.class);
		return query.getResultList();
	}

	@Override
	public boolean authenticatePersonne(String firstname, String lastname) {
		// TODO Auto-generated method stub
		String query = "select s from Personne s where s.login = '"+firstname+"' and s.password = '"+lastname+"'";
		Personne s = (Personne) ( em.createQuery(query)).getSingleResult() ;
		
		return s == null ? false : true;
	}

}
