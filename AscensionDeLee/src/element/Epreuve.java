package element;

import java.awt.Frame;
import java.text.Collator;
import java.util.Locale;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Epreuve extends Frame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame = new JFrame();
    public boolean verifReponse = false;

    public Epreuve() {
    	
    	
    	Enigme s3 = new Enigme();
		s3.Init("jdbc:mariadb://localhost:3306/jeuBruce","org.mariadb.jdbc.Driver");
		
		int enigmeAleatoire3 = 1 + (new Random().nextInt(15)); // 
		s3.donneEnigme(enigmeAleatoire3);
		System.out.println(s3.question);
		System.out.println(s3.Reponse);
		
			
		boolean flagEpreuve3 = false;

			
				if(flagEpreuve3 == false) {
					
				
			String reponse = JOptionPane.showInputDialog(this, "Question :"+ s3.question, "Dï¿½fit Enigme", JOptionPane.QUESTION_MESSAGE);
			
		if(reponse != null)
		{
			Collator collator3 = Collator.getInstance(Locale.FRENCH);
			collator3.setStrength(Collator.PRIMARY);
			
			int comparaison3 = collator3.compare(reponse,s3.Reponse);
			
				
				
			if (comparaison3 == 0) {
				
				flagEpreuve3 = true;
				verifReponse = true;
			}
			
			
		
		}
	    frame.pack(); }
    }
    
    public Epreuve(int op) {
    	
    	
    	
    	Enigme s3 = new Enigme();
		s3.Init("jdbc:mariadb://localhost:3306/jeuBruce","org.mariadb.jdbc.Driver");
		
		int enigmeAleatoire3= op ; // Number 17
		s3.donneEnigme(enigmeAleatoire3);
		System.out.println(s3.question);
		System.out.println(s3.Reponse);
		
			
		boolean flagEpreuve3 = false;

			
				if(flagEpreuve3 == false) {
					
				
			String reponse = JOptionPane.showInputDialog(this, "Question :"+ s3.question, "Énigme", JOptionPane.QUESTION_MESSAGE);
			
		if(reponse != null)
		{
			Collator collator3 = Collator.getInstance(Locale.FRENCH);
			collator3.setStrength(Collator.PRIMARY);
			
			int comparaison3 = collator3.compare(reponse,s3.Reponse);
			
				
				
			if (comparaison3 == 0) {
				
				flagEpreuve3 = true;
				verifReponse = true;
			}
			
			
		
		}
	    frame.pack(); }
    }
}