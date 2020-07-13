package element;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Enigme {
	
	public int numEnigme;
	public String question;
	public String Reponse;
	public boolean etat;
	private DAOEnigme monDAO;
	

	public int getNumEnigme() {
		return numEnigme;
	}


	public void setNumEnigme(int numEnigme) {
		this.numEnigme = numEnigme;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getReponse() {
		return Reponse;
	}


	public void setReponse(String reponse) {
		Reponse = reponse;
	}


	public boolean getEtat() {
		return etat;
	}


	public void setEtat(boolean etat) {
		this.etat = etat;
	}


	public DAOEnigme getMonDAO() {
		return monDAO;
	}


	public void setMonDAO(DAOEnigme monDAO) {
		this.monDAO = monDAO;
	}


	public void Init(String pseudoURL, String Driver)
		{
		    /*  tentative de connexion */
		    this.monDAO=new DAOEnigme();
		    this.monDAO.doConnection(pseudoURL, Driver);
		   
		}
	
	
	public void donneEnigme(int numero)
	{
	   	String req = new String("SELECT * FROM enigmes WHERE numEnigme = '"+numero+"'");
	   	
	    ResultSet res= monDAO.doSearch(req);

	    if (res == null) 
	    {
	    	System.out.println("Problème dans la requete ... : " + req);
	    	}
	    
	    else {
			    try { 
			    	 if (res.next()==false) {System.out.println("Aucun tuple résultat pour la requete ... : " + req);}
			    	 
			    	 else
			    	 {
			    
			    		 this.numEnigme = res.getInt("numEnigme");
			    		 this.question = res.getString("Questions");
			    		 this.Reponse = res.getString("Reponse");
			    		 this.etat = res.getBoolean("Etat");
			    	 }
			    	 
			    	 res.close();//Fermeture de la connexion.
			    	 
			    	}
			    	 catch (SQLException e) {e.printStackTrace();}
	    	}
	}

}
