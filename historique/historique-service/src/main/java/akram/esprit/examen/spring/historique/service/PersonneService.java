package akram.esprit.examen.spring.historique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import akram.esprit.examen.spring.historique.contract.IPersonneService;
import akram.esprit.examen.spring.historique.domain.contract.IPersonneDao;
import akram.esprit.examen.spring.historique.domain.entities.Personne;


@Service
@Transactional
public class PersonneService implements IPersonneService {

	@Autowired
	IPersonneDao dao;
	
	
	@Override
	public void addPersonne(Personne Personne) {
		dao.addPersonne(Personne);

	}

	@Override
	public void updatePersonne(Personne Personne) {
		dao.updatePersonne(Personne);

	}

	@Override
	public void deletePersonne(int Id) {
		dao.deletePersonne(Id);

	}

	@Override
	public Personne findPersonneById(int Id) {
		// TODO Auto-generated method stub
		return dao.findPersonneById(Id);
	}

	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return dao.findAllPersonnes();
	}

	@Override
	public boolean authenticatePersonne(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return dao.authenticatePersonne(firstname, lastname);
	}

}
