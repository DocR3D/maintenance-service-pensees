import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import accesseur.cache.PenseeDAO;
import modele.Pensee;
import outils.Journal;
import vue.VueInspirationVisuelle;

public class App {

	public static void main(String[] parametres) throws SQLException {

		//Journal.activer();
		Journal.activerNiveau(0);
		
		//Pensee pensee = new Pensee("Rossetti","Ce qui est plus triste qu une oeuvre inachevee, c est une oeuvre jamais commencee.");
		//penseeDAO.ajouterPensee(pensee);		
		
		VueInspirationVisuelle.launch(VueInspirationVisuelle.class, parametres);
		PenseeDAO cachePenseeDAO = new PenseeDAO();
		cachePenseeDAO.enregistrerPensees(new Pensee("Moi","La vie c'est pas du gateau"));
		
		
	}

}
