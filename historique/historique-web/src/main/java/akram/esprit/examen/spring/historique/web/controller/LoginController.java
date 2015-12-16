package akram.esprit.examen.spring.historique.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import akram.esprit.examen.spring.historique.contract.IHistoriqueService;
import akram.esprit.examen.spring.historique.contract.INavigateurService;
import akram.esprit.examen.spring.historique.contract.IPersonneService;
import akram.esprit.examen.spring.historique.domain.entities.Navigateur;
import akram.esprit.examen.spring.historique.domain.entities.Personne;




@Controller
public class LoginController {

	@Autowired
	IHistoriqueService histoService;
	@Autowired
	IPersonneService personneService;
	@Autowired
	INavigateurService navigateurService;

	 /*
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 @ModelAttribute("student")
	 public Student getGreetingObject() {
	  return new Student();
	 }
	 */
	
	 @RequestMapping(value = "/")
		public ModelAndView doInitModel() {
			return new ModelAndView();
					
		}
	 
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView doLogin(@RequestParam("list") int list , ModelMap modelMap) {
		
		
			Personne p = personneService.findPersonneById(list);
			int i = 1;
			Navigateur n = navigateurService.findAllNavigateurs().get(0);
			modelMap.addAttribute("historiques", histoService.findAllHistorique_navigationsByPersonneAndNavigateur(p, n));
			
			ModelAndView mav = new ModelAndView("home");
			
			return mav;
		
	}

}
