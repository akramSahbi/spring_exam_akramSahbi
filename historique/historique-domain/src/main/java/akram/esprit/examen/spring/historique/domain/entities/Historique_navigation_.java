package akram.esprit.examen.spring.historique.domain.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-28T10:15:02.550+0100")
@StaticMetamodel(Historique_navigation.class)
public class Historique_navigation_ {
	public static volatile SingularAttribute<Historique_navigation, Integer> idHistorique_navigation;
	public static volatile SingularAttribute<Historique_navigation, String> url;
	public static volatile SingularAttribute<Historique_navigation, Date> date_entree;
	public static volatile SingularAttribute<Historique_navigation, Navigateur> navigateur;
	public static volatile SingularAttribute<Historique_navigation, Personne> personne;
}
