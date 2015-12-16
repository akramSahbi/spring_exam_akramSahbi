package akram.esprit.examen.spring.historique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import akram.esprit.examen.spring.historique.contract.INavigateurService;
import akram.esprit.examen.spring.historique.domain.contract.INavigateurDao;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;
import akram.esprit.examen.spring.historique.domain.entities.Personne;



@Service
@Transactional
public class NavigateurService implements INavigateurService {

	@Autowired
	INavigateurDao dao;
	
	
	@Override
	public void addNavigateur(Navigateur Navigateur) {
		dao.addNavigateur(Navigateur);

	}

	@Override
	public void updateNavigateur(Navigateur Navigateur) {
		dao.updateNavigateur(Navigateur);

	}

	@Override
	public void deleteNavigateur(int Id) {
		dao.deleteNavigateur(Id);

	}

	@Override
	public Navigateur findNavigateurById(int Id) {
		// TODO Auto-generated method stub
		return dao.findNavigateurById(Id);
	}

	@Override
	public List<Navigateur> findAllNavigateurs() {
		// TODO Auto-generated method stub
		return dao.findAllNavigateurs();
	}

	

	

}
