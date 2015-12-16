package akram.esprit.examen.spring.historique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import akram.esprit.examen.spring.historique.contract.IHistoriqueService;
import akram.esprit.examen.spring.historique.domain.contract.IHistoriqueDao;
import akram.esprit.examen.spring.historique.domain.entities.Historique_navigation;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;
import akram.esprit.examen.spring.historique.domain.entities.Personne;



@Service
@Transactional
public class HistoriqueService implements IHistoriqueService {

	@Autowired
	IHistoriqueDao dao;
	
	
	@Override
	public void addHistorique_navigation(Historique_navigation Historique_navigation) {
		dao.addHistorique_navigation(Historique_navigation);

	}

	@Override
	public void updateHistorique_navigation(Historique_navigation Historique_navigation) {
		dao.updateHistorique_navigation(Historique_navigation);

	}

	@Override
	public void deleteHistorique_navigation(int Id) {
		dao.deleteHistorique_navigation(Id);

	}

	@Override
	public Historique_navigation findHistorique_navigationById(int Id) {
		// TODO Auto-generated method stub
		return dao.findHistorique_navigationById(Id);
	}

	@Override
	public List<Historique_navigation> findAllHistorique_navigations() {
		// TODO Auto-generated method stub
		return dao.findAllHistorique_navigations();
	}

	@Override
	public List<Historique_navigation> findAllHistorique_navigationsByPersonneAndNavigateur(Personne personne,
			Navigateur navigateur) {
		// TODO Auto-generated method stub
		return dao.findAllHistorique_navigationsByPersonneAndNavigateur(personne, navigateur);
	}

	

}
