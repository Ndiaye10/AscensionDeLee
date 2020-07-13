package Personnage;

public class Personnages {
	
	protected String identite;
	protected int niveau;
	protected String piece;
	protected int sante;
	
	protected Personnages(String identite,int niveau,String piece,int sante)
		{
			this.identite = identite;
			this.niveau = niveau;
			this.piece = piece;
			this.sante = sante;
		}
	
	public int getNiveau(){
		return this.niveau;
	}
	
	public String getPiece(){
		return this.piece;
	}
	
	public int getSante(){
		return this.sante ;
	}
	
	public void setSante(int op){
		this.sante = op ;
	}
	

	
	public void retirerVie() {
		this.sante = this.sante-1;
	}
	public void ajouterVie() {
		this.sante += 1;
	}
	public void afficheSante() {
		System.out.println("Vous �tes maintenant en possession de "+this.sante +" vie");
	}
	
	//Cette m�thode nous permettra de d�finir la nature du personnage en lui donnant
	//son identite propre dans la red�finition de cette m�thode dans les classes filles
	public String toString()
	{
		String chaine = this.identite + "(Objet(s) d�tenu(s) : ";
		
		return(chaine);
		
	}
}