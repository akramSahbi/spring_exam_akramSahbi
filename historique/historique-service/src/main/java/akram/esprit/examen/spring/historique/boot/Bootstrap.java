package akram.esprit.examen.spring.historique.boot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;

import akram.esprit.examen.spring.historique.contract.IHistoriqueService;
import akram.esprit.examen.spring.historique.contract.INavigateurService;
import akram.esprit.examen.spring.historique.contract.IPersonneService;
import akram.esprit.examen.spring.historique.domain.entities.Historique_navigation;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;
import akram.esprit.examen.spring.historique.domain.entities.Personne;



public class Bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("serviceContext.xml");
		INavigateurService navService =  context.getBean(INavigateurService.class);
		IPersonneService personneService = context.getBean(IPersonneService.class);
		IHistoriqueService histoService = context.getBean(IHistoriqueService.class);
		
		Navigateur nav = new Navigateur("firefox", 2.5f);
		navService.updateNavigateur(nav);
		
		Personne personne = new Personne("admin", "admin");
		personneService.updatePersonne(personne);
		
		nav = navService.findNavigateurById(1);
		personne = personneService.findPersonneById(2);
		
		Historique_navigation historique1 = new Historique_navigation("www.springide.org", new Date(),nav,personne );
		histoService.updateHistorique_navigation(historique1);
		Historique_navigation historique2 = new Historique_navigation("www.facebook.org", new Date(),nav,personne );
		histoService.updateHistorique_navigation(historique2);
		
		
		
		
		
	}

}
