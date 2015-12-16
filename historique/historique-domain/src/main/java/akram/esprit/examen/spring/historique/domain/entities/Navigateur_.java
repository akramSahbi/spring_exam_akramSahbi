package akram.esprit.examen.spring.historique.domain.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-11-28T10:15:02.581+0100")
@StaticMetamodel(Navigateur.class)
public class Navigateur_ {
	public static volatile SingularAttribute<Navigateur, Integer> idNaviguateur;
	public static volatile SingularAttribute<Navigateur, String> name;
	public static volatile SingularAttribute<Navigateur, Float> version;
	public static volatile ListAttribute<Navigateur, Historique_navigation> historiques;
}
