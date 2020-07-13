package Personnage;

public class PersoJouable extends Personnages{
	
	public PersoJouable(String identite, int niveau,String piece)
	{
		super(identite,niveau,piece,3);
	}
	
	public boolean enVie() {
		if (this.sante<=0) {
			System.out.println("Vous avez epuis� toutes vos vies vous êtes mort");
			return false;
		}
		else {
			return true;
		}
	}
	

	
	//Méthode redéfinie et nom attribuer à bruce
	public String donneLocalisation()
	{
		//String chaine = this.identite + super.toString(); modification par kame 26/03
		String chaine = "Vous êtes actuellement : ";
		chaine += this.piece;
		chaine += " du niveau ";
		chaine += this.niveau;
		return(chaine);
	}
	public void setPiece(String piece) {
		this.piece = piece;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

}