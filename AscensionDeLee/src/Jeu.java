
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import element.Epreuve; 
import Personnage.PersoJouable;
import elementGraphique.Panneau;
import elementGraphique.Pupop;


public class Jeu extends JFrame implements ActionListener {
	
	PersoJouable bruceLee = new PersoJouable("Bruce Lee", 1, "Salle Centrale");

	
	//Niveau 1 

	private Panneau panneauImage1 = new Panneau("image/Tour.jpg");
	private Panneau panneauImage3 = new Panneau("image/Accueil.jpg");
	private Panneau panneauImage2 = new Panneau("image/Centre1.jpg");
	private Panneau panneauImage4 = new Panneau("image/SalleRiz.jpg");//Ouest Niv1
	private Panneau panneauImage5 = new Panneau("image/Salle-Nunchaku.jpeg");//EST Nunchaku Niv1
	private Panneau panneauImage6 = new Panneau("image/salleCoffre1.jpg");//SUD Niv1
	private Panneau panneauImage7 = new Panneau("image/Indice1.jpg");//SUD Voir l'indice1 Niv1
	private Panneau panneauImage8 = new Panneau("image/PorteVerr1 (1).jpg");//NORD Salle vÃ©rouiller Niv1
	private Panneau panneauImage9 = new Panneau("image/LiuKang.jpg");//NORD Salle de Combat Niv1
	private Panneau panneauImage10 = new Panneau("image/vieSup.jpg");//Ouest Niv1 + une vie 
	private Panneau panneauImage11 = new Panneau("image/bruceNunchaku.jpg");//EST Nunchaku Niv1
	
	// Niveau 2
	private Panneau panneauImage12 = new Panneau("image/Accueil2.png");
	private Panneau panneauImage13 = new Panneau("image/Centre2.jpg");
	private Panneau panneauImage14 = new Panneau("image/PorteVerr2.jpg");//OUEST salle de combat Niv2
	private Panneau panneauImage15 = new Panneau("image/CombattantOptionnel.jpg");//EST Combattant Optionnel Niv2
	private Panneau panneauImage16 = new Panneau("image/salleCoffre1.jpg");//SUD Niv2 Coffre2
	private Panneau panneauImage17 = new Panneau("image/Indice2.jpg");//SUD Voir l'indice2 Niv2
	private Panneau panneauImage18 = new Panneau("image/BossNiv2.jpg");//Ouest Salle Boss final niveau 2 
	private Panneau panneauImage19 = new Panneau("image/salleClef.jpg");//NORD Salle avec clï¿½s Niv2
	private Panneau panneauImage20 = new Panneau("image/clef.png");//NORD Niv2 Image clï¿½s 
	
	// Niveau 3
	
	private Panneau panneauImage21 = new Panneau("image/Accueil3.jpg");
	private Panneau panneauImage22 = new Panneau("image/Centre3.jpg");
	private Panneau panneauImage23 = new Panneau("image/SallePiege.jpg");//Ouest Niv3
	private Panneau panneauImage24 = new Panneau("image/salleCombatNiv3.jpg");//EST salle avec l'Ã©quation Niv3
	private Panneau panneauImage25 = new Panneau("image/AncienCombattant.jpg");//SUD Niv3
	private Panneau panneauImage27 = new Panneau("image/plus2vies.jpeg");//SUD Niv3 + 3 vie 
	private Panneau panneauImage28 = new Panneau("image/Boss.jpg");//NORD Salle de Combat avec le Boss Niv3
	
	// Fin 
	private Panneau panneauImage29 = new Panneau("image/ImageFin.jpeg");// Image fin


	// Panel servant de containerPane  Ã  la fenetre -----------------------------------------------
	
	//Niveau1
	JPanel panelImage1 = new JPanel();
	JPanel panelImage2 = new JPanel();
	JPanel panelImage3 = new JPanel();
	JPanel panelImage4 = new JPanel();
	JPanel panelImage5= new JPanel();
	JPanel panelImage6 = new JPanel();
	JPanel panelImage7 = new JPanel();
	JPanel panelImage8 = new JPanel();
	JPanel panelImage9 = new JPanel();
	JPanel panelImage10= new JPanel();
	JPanel panelImage11 = new JPanel();
	
	//Niveau 2
	JPanel panelImage12 = new JPanel();
	JPanel panelImage13 = new JPanel();
	JPanel panelImage14 = new JPanel();
	JPanel panelImage15= new JPanel();
	JPanel panelImage16 = new JPanel();
	JPanel panelImage17 = new JPanel();
	JPanel panelImage18 = new JPanel();
	JPanel panelImage19 = new JPanel();
	JPanel panelImage20 = new JPanel();
	
	//Niveau3
	JPanel panelImage21 = new JPanel();
	JPanel panelImage22 = new JPanel();
	JPanel panelImage23 = new JPanel();
	JPanel panelImage24= new JPanel();
	JPanel panelImage25 = new JPanel();
	JPanel panelImage26 = new JPanel();
	JPanel panelImage27= new JPanel();
	JPanel panelImage28 = new JPanel();
	
	//Fin
	JPanel panelImage29 = new JPanel();

	
	// BOUTONS NIVEAU 1 ----------------------------------------------

	// buttons panel 1
	JButton commencerPannel1 = new JButton("Jouer");
	JButton quitterPanel1 = new JButton("Quitter");

	// buttons panel 2
	JButton partiEst = new JButton("Est");
	JButton partiOuest = new JButton("Ouest");
	JButton partiNord = new JButton("Nord");
	JButton partiSud = new JButton("Sud");
	
	// buttons panel 3
	JButton pieceCentrale1Pannel3 = new JButton("GO !");
	
	// buttons panel 4 : Salle Bol de Riz / Salle de boutton OUEST
	JButton prendreRiz = new JButton("Prendre le bol de riz");
	JButton retourMenu = new JButton("Retour Menu");
	
	// buttons panel 5 : Salle nunchaku / Salle de boutton EST
	JButton prendreArme = new JButton("Prendre le nunchaku");
	JButton retourMenu1 = new JButton("Retour Menu");
	
	// buttons panel 6 : Salle Coffre / Salle de boutton SUD
	JButton buttonCoffre = new JButton("Ouvrir Coffre");
	JButton retourMenu2 = new JButton("Retour Menu");
	
	// buttons panel 7 : Salle Indice / Salle de boutton SUD dans le Coffre
	//JButton prendreIndice = new JButton("Prendre INDICE");
	JButton retourMenu3 = new JButton("Retour Menu");
	
	// buttons panel 8 : Salle VÃ©rouiller / Salle de boutton NORD, combat
	JButton retourMenu4 = new JButton("Retour Menu");
	
	// buttons panel 9 : Salle de combat / Salle de boutton NORD , Combat
	JButton accesNiveau2 = new JButton("Continuer ou quitter");
	JButton combat1 = new JButton("Démarrer le combat");
	
	// buttons panel 10 : Gagne 1 vie
	JButton retourMenu10 = new JButton("Retour Menu");
	
	// buttons panel 11 : Aller Ã  la salle de combat
	
	JButton retourMenu6 = new JButton("Retour Menu");
	
	
	// BOUTONS NIVEAU 2 -----------------------------------------------------------
	
	// buttons panel 12
		JButton commencerPannel12 = new JButton("Accéder au niveau 2");
		JButton quitterPanel12 = new JButton("Quitter");

		// buttons panel 13
		JButton partiEst2 = new JButton("Est");
		JButton partiOuest2 = new JButton("Ouest");
		JButton partiNord2 = new JButton("Nord");
		JButton partiSud2 = new JButton("Sud");
		
		// buttons panel 14 : Salle verouillï¿½e / Salle de boutton OUEST
		JButton retourMenu14 = new JButton("Retour Menu");
		
		// buttons panel 15 : Salle Combattant optionnel / Salle de boutton EST
		JButton combattre = new JButton("Choisir de Combattre");
		JButton retourMenu15 = new JButton("Retour Menu");
		
		// buttons panel 16 : Salle Coffre / Salle de boutton SUD
		JButton buttonCoffre2 = new JButton("Ouvrir Coffre");
		JButton retourMenu16 = new JButton("Retour Menu");
		
		// buttons panel 17 : Salle Indice2 / Salle de boutton SUD dans le Coffre
		//JButton prendreIndice2 = new JButton("Prendre INDICE");
		JButton retourMenu17 = new JButton("Retour Menu");
		
		// buttons panel 18 : Salle Epreuve Chuck Norris niveau 2
		JButton valider = new JButton("Continuer / Quitter");
		JButton epreuve18 = new JButton("Démarrer l'épreuve");
		JButton retourMenu18 = new JButton("Retour Menu");
		
		// buttons panel 19 : Salle de clef
		JButton prendreClef = new JButton("Prendre la Clef");
		JButton retourMenu19 = new JButton("Retour Menu");
		
		// buttons panel 20 : Image clef
		JButton retourMenu20 = new JButton("Retour Menu");
		
		
		// BOUTONS NIVEAU 3 --------------------------------------------------------------------
		
		// buttons panel 21
		JButton commencerPannel21 = new JButton("Jouer");
		JButton quitterPanel21 = new JButton("Quitter");

		// buttons panel 22
		JButton partiEst3 = new JButton("Est");
		JButton partiOuest3 = new JButton("Ouest");
		JButton partiNord3 = new JButton("Nord");
		JButton partiSud3 = new JButton("Sud");

		// buttons panel 23 : Salle piÃ¨ge / Salle de boutton OUEST
		JButton quitter23 = new JButton("Quitter");
		
		// buttons panel 24 : Salle Equation / Salle de boutton EST
		JButton retourMenu24 = new JButton("Retour Menu");
		JButton combatPiege = new JButton("Démarrer le combat pour pouvoir sortir") ;
		
		// buttons panel 25 : Salle Marchant / Salle de boutton SUD
		JButton donnerItem = new JButton("Donner mon arme");
		JButton retourMenu25 = new JButton("Retour Menu");


		// buttons panel 26 : Nunchaku
		
		JButton stock = new JButton("Voir la récompense ");
		//JButton validerReponse = new JButton("Valider rï¿½ponse");
		
		// buttons panel 27 : Gagne 3 vie
		JButton retourMenu27 = new JButton("Retour Menu");
		
		// buttons panel 28 : Salle ï¿½preuve finale
		JButton debutEpreuve = new JButton("Démarrer l'épreuve finale");
		JButton quitterFinale = new JButton("Quitter la partie");
		
		//FIN
		JButton quitterJeu = new JButton("Fermer");

		
		

	// Evenements niveau 1
	int mangerRiz = 0 ;
	int recupIndice = 0 ;
	int recupNunchaku = 0 ;
	int debutEpreuve1 = 0 ;
	
	//Evenements Niveau 2
	int ouvrircoffre=0;
	int clef=0;
	int combatOpt = 0 ;
	int combatChuck = 0 ;
	
	//Evenements Niveau 3
	int rendreNunchaku = 0 ;
	int equationRep = 0 ;
	int repSalleBloque = 0 ;
	int debutCombatPiege = 0 ;
	int debutCombatFinal = 0 ;
	
	//Enigme aleatoire
	int combat1LiuKang = 1 + (new Random().nextInt(4));
	int combat2opt = 5 + (new Random().nextInt(4));
	int combat3Chuck = 9 + (new Random().nextInt(4));
	int combat4Otage = 13 + (new Random().nextInt(4));
	
	int nb = 0 ;
	

	
	public Jeu() {

		panneauImage1.setSize(500, 500);
		panneauImage2.setSize(500, 500);
		panneauImage3.setSize(500, 500);
		panneauImage4.setSize(500, 500);
		panneauImage5.setSize(500, 500);
		panneauImage6.setSize(500, 500);
		panneauImage7.setSize(500, 500);
		panneauImage8.setSize(500, 500);
		panneauImage9.setSize(500, 500);
		panneauImage10.setSize(500, 500);
		panneauImage11.setSize(500, 500);
		//
		panneauImage12.setSize(500, 500);
		panneauImage13.setSize(500, 500);
		panneauImage14.setSize(500, 500);
		panneauImage15.setSize(500, 500);
		panneauImage16.setSize(500, 500);
		panneauImage17.setSize(500, 500);
		panneauImage18.setSize(500, 500);
		panneauImage19.setSize(500, 500);
		panneauImage20.setSize(500, 500);
		//
		panneauImage21.setSize(500, 500);
		panneauImage22.setSize(500, 500);
		panneauImage23.setSize(500, 500);
		panneauImage24.setSize(500, 500);
		panneauImage25.setSize(500, 500);
		//panneauImage26.setSize(500, 500);
		panneauImage27.setSize(500, 500);
		panneauImage28.setSize(500, 500);
		//
		panneauImage29.setSize(500, 500);

		
		// Niveau1

		// listeners fenetre 1
		commencerPannel1.addActionListener(this);
		quitterPanel1.addActionListener(this);

		// listeners fenetre 2
		partiEst.addActionListener(this);
		partiNord.addActionListener(this);
		partiSud.addActionListener(this);
		partiOuest.addActionListener(this);
		
		// listeners fenetre 3
		pieceCentrale1Pannel3.addActionListener(this);
		
		// listeners fenetre 4
		prendreRiz.addActionListener(this);
		retourMenu.addActionListener(this);
		
		// listeners fenetre 5
		prendreArme.addActionListener(this);
		retourMenu1.addActionListener(this);
		
		// listeners fenetre 6
		buttonCoffre.addActionListener(this);
		retourMenu2.addActionListener(this);
		
		// listeners fenetre 7
		//prendreIndice.addActionListener(this);
		retourMenu3.addActionListener(this);
		
		// listeners fenetre 8
		retourMenu4.addActionListener(this);

		// listeners fenetre 9
		accesNiveau2.addActionListener(this);
		combat1.addActionListener(this);
		
		// listeners fenetre 10
		retourMenu10.addActionListener(this);
		
		// listeners fenetre 11
		retourMenu6.addActionListener(this);
		
		// Niveau 2
		
		// listeners fenetre 12
				commencerPannel12.addActionListener(this);
				quitterPanel12.addActionListener(this);

				// listeners fenetre 13
				partiEst2.addActionListener(this);
				partiNord2.addActionListener(this);
				partiSud2.addActionListener(this);
				partiOuest2.addActionListener(this);
				
				// listeners fenetre 14
				retourMenu14.addActionListener(this);
				
				// listeners fenetre 15
				combattre.addActionListener(this);
				retourMenu15.addActionListener(this);
				
				// listeners fenetre 16
				buttonCoffre2.addActionListener(this);
				retourMenu16.addActionListener(this);
				
				// listeners fenetre 17
				//prendreIndice.addActionListener(this);
				retourMenu17.addActionListener(this);
				
				// listeners fenetre 18
				valider.addActionListener(this);
				retourMenu18.addActionListener(this);
				epreuve18.addActionListener(this);
				
				// listeners fenetre 19
				prendreClef.addActionListener(this);
				retourMenu19.addActionListener(this);
				
				// listeners fenetre 20
				retourMenu20.addActionListener(this);
				
			//Niveau3
				
				// listeners fenetre 21
				commencerPannel21.addActionListener(this);
				quitterPanel21.addActionListener(this);

				// listeners fenetre 22
				partiEst3.addActionListener(this);
				partiNord3.addActionListener(this);
				partiSud3.addActionListener(this);
				partiOuest3.addActionListener(this);
				
				
				// listeners fenetre 23
				quitter23.addActionListener(this);
				
				// listeners fenetre 24
				retourMenu24.addActionListener(this);
				combatPiege.addActionListener(this);
				
				// listeners fenetre 25
				donnerItem.addActionListener(this);
				retourMenu25.addActionListener(this);

				// listeners fenetre 26
				
				stock.addActionListener(this);
				//validerReponse.addActionListener(this);
				
				// listeners fenetre 27
				retourMenu27.addActionListener(this);
				
				// listeners fenetre 28
				debutEpreuve.addActionListener(this);
				quitterFinale.addActionListener(this);
			
			//FIN
				quitterJeu.addActionListener(this);



		this.setTitle("L'ascension de Lee");

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
		panelImage1.setLayout(new BorderLayout());
		panelImage2.setLayout(new BorderLayout());
		panelImage3.setLayout(new BorderLayout());
		panelImage4.setLayout(new BorderLayout());
		panelImage5.setLayout(new BorderLayout());
		panelImage6.setLayout(new BorderLayout());
		panelImage7.setLayout(new BorderLayout());
		panelImage8.setLayout(new BorderLayout());
		panelImage9.setLayout(new BorderLayout());
		panelImage10.setLayout(new BorderLayout());
		panelImage11.setLayout(new BorderLayout());
//
		panelImage12.setLayout(new BorderLayout());
		panelImage13.setLayout(new BorderLayout());
		panelImage14.setLayout(new BorderLayout());
		panelImage15.setLayout(new BorderLayout());
		panelImage16.setLayout(new BorderLayout());
		panelImage17.setLayout(new BorderLayout());
		panelImage18.setLayout(new BorderLayout());
		panelImage19.setLayout(new BorderLayout());
		panelImage20.setLayout(new BorderLayout());
		
	//	
		panelImage21.setLayout(new BorderLayout());
		panelImage22.setLayout(new BorderLayout());
		panelImage23.setLayout(new BorderLayout());
		panelImage24.setLayout(new BorderLayout());
		panelImage25.setLayout(new BorderLayout());
		panelImage26.setLayout(new BorderLayout());
		panelImage27.setLayout(new BorderLayout());
		panelImage28.setLayout(new BorderLayout());
	//
		panelImage29.setLayout(new BorderLayout());

		// AFFICHAGE BOUTONS ------------------------------------------------------------------------------
		
		// afficahage ACCUEIL
		panelImage1.add(panneauImage1, BorderLayout.CENTER);
		panelImage1.add(commencerPannel1, BorderLayout.SOUTH);
		panelImage1.add(quitterPanel1, BorderLayout.NORTH);

		
		// affichage 2
		panelImage2.add(panneauImage2, BorderLayout.CENTER);
		panelImage2.add(partiEst, BorderLayout.EAST);
		panelImage2.add(partiOuest, BorderLayout.WEST);
		panelImage2.add(partiNord, BorderLayout.NORTH);
		panelImage2.add(partiSud, BorderLayout.SOUTH);
		
		// afficahage 3
		panelImage3.add(panneauImage3, BorderLayout.CENTER);
		panelImage3.add(pieceCentrale1Pannel3, BorderLayout.SOUTH);
		
		// afficahage 4 / suite button OUEST bol de Riz
		panelImage4.add(panneauImage4, BorderLayout.CENTER);
		panelImage4.add(prendreRiz, BorderLayout.SOUTH);
		panelImage4.add(retourMenu, BorderLayout.NORTH);
		
		// afficahage 5 / suite button EST Nunchaku
		panelImage5.add(panneauImage5, BorderLayout.CENTER);
		panelImage5.add(prendreArme, BorderLayout.SOUTH);
		panelImage5.add(retourMenu1, BorderLayout.EAST);
		
		// afficahage 6 / suite button SUD COFFRE
		panelImage6.add(panneauImage6, BorderLayout.CENTER);
		panelImage6.add(buttonCoffre, BorderLayout.SOUTH);
		panelImage6.add(retourMenu2, BorderLayout.NORTH);
		
		// afficahage 7 / suite button SUD COFFRE : Affichage Indice dans coffre
		panelImage7.add(panneauImage7, BorderLayout.CENTER);
	//	panelImage7.add(prendreIndice, BorderLayout.SOUTH);
		panelImage7.add(retourMenu3, BorderLayout.NORTH);
		
		// afficahage 8 / Salle vÃ©rouiller
		panelImage8.add(panneauImage8, BorderLayout.CENTER);
		panelImage8.add(retourMenu4, BorderLayout.NORTH);
		
		// afficahage 9 / Salle de COMBAT
		panelImage9.add(panneauImage9, BorderLayout.CENTER);
		panelImage9.add(accesNiveau2, BorderLayout.NORTH);
		panelImage9.add(combat1, BorderLayout.SOUTH);

		// afficahage 10 / Salle vÃ©rouiller
		panelImage10.add(panneauImage10, BorderLayout.CENTER);
		panelImage10.add(retourMenu10, BorderLayout.NORTH);
		
		// afficahage 11 / suite button EST Nunchaku
		panelImage11.add(panneauImage11, BorderLayout.CENTER);
		panelImage11.add(retourMenu6, BorderLayout.NORTH);
		
		// Niveau 2

		// afficahage 12
				panelImage12.add(panneauImage12, BorderLayout.CENTER);
				panelImage12.add(commencerPannel12, BorderLayout.SOUTH);
				panelImage12.add(quitterPanel12, BorderLayout.NORTH);


				// affichage 13
				panelImage13.add(panneauImage13, BorderLayout.CENTER);
				panelImage13.add(partiEst2, BorderLayout.EAST);
				panelImage13.add(partiOuest2, BorderLayout.WEST);
				panelImage13.add(partiNord2, BorderLayout.NORTH);
				panelImage13.add(partiSud2, BorderLayout.SOUTH);
				
				// afficahage 14 / suite button OUEST valider rï¿½ponse
				panelImage14.add(panneauImage14, BorderLayout.CENTER);
				panelImage14.add(retourMenu14, BorderLayout.NORTH);
				
				// afficahage 15 / suite button EST Combattant optionnel
				panelImage15.add(panneauImage15, BorderLayout.CENTER);
				panelImage15.add(combattre, BorderLayout.SOUTH);
				panelImage15.add(retourMenu15, BorderLayout.EAST);
				
				// afficahage 16 / suite button SUD COFFRE du niveau 2
				panelImage16.add(panneauImage16, BorderLayout.CENTER);
				panelImage16.add(buttonCoffre2, BorderLayout.SOUTH);
				panelImage16.add(retourMenu16, BorderLayout.NORTH);
				
				// afficahage 17 / suite button SUD COFFRE : Affichage du niveau 2 Indice dans coffre
				panelImage17.add(panneauImage17, BorderLayout.CENTER);
				
				panelImage17.add(retourMenu17, BorderLayout.NORTH);
				
				// afficahage 18 / Salle Chuck Norris
				panelImage18.add(panneauImage18, BorderLayout.CENTER);
				panelImage18.add(valider, BorderLayout.SOUTH);
				panelImage18.add(retourMenu18, BorderLayout.EAST);
				panelImage18.add(epreuve18, BorderLayout.NORTH);
				
				// afficahage 19 / Salle pour prendre la clef
				panelImage19.add(panneauImage19, BorderLayout.CENTER);
				panelImage19.add(prendreClef, BorderLayout.SOUTH);
				panelImage19.add(retourMenu19, BorderLayout.NORTH);

				// afficahage 20 / Salle vï¿½rouiller
				panelImage20.add(panneauImage20, BorderLayout.CENTER);
				panelImage20.add(retourMenu20, BorderLayout.NORTH);
				
		
		// Niveau3
				
				
				// afficahage 21
				panelImage21.add(panneauImage21, BorderLayout.CENTER);
				panelImage21.add(commencerPannel21, BorderLayout.SOUTH);
				panelImage21.add(quitterPanel21, BorderLayout.NORTH);


				// affichage 22
				panelImage22.add(panneauImage22, BorderLayout.CENTER);
				panelImage22.add(partiEst3, BorderLayout.EAST);
				panelImage22.add(partiOuest3, BorderLayout.WEST);
				panelImage22.add(partiNord3, BorderLayout.NORTH);
				panelImage22.add(partiSud3, BorderLayout.SOUTH);
				
				// afficahage 23 / suite button OUEST salle PiÃ¨ge
				panelImage23.add(panneauImage23, BorderLayout.CENTER);
				panelImage23.add(quitter23, BorderLayout.NORTH);
				
				// afficahage 24 / suite button EST SalleEquation
				panelImage24.add(panneauImage24, BorderLayout.CENTER);
				panelImage24.add(retourMenu24, BorderLayout.NORTH);
				panelImage24.add(combatPiege, BorderLayout.SOUTH) ;
				
				// afficahage 25 / suite button SUD Marchant
				panelImage25.add(panneauImage25, BorderLayout.CENTER);
				panelImage25.add(donnerItem, BorderLayout.SOUTH);
				panelImage25.add(retourMenu25, BorderLayout.NORTH);
				
				
				// afficahage 27 / Salle Gain 2 vies
				panelImage27.add(panneauImage27, BorderLayout.CENTER);
				panelImage27.add(retourMenu27, BorderLayout.NORTH);
				
				// afficahage 28 / suite button EST Stock item
				panelImage28.add(panneauImage28, BorderLayout.CENTER);
				panelImage28.add(debutEpreuve, BorderLayout.SOUTH);
				panelImage28.add(quitterFinale, BorderLayout.NORTH);
		
		// FIN
				// afficahage 29 / FIN
				panelImage29.add(panneauImage29, BorderLayout.CENTER);
				panelImage29.add(quitterJeu, BorderLayout.NORTH);
				
		
		
		panelImage1.setVisible(true);

		this.setContentPane(panelImage1);

		this.setSize(500, 500);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource().equals(commencerPannel1)) {//Affichage 2---------------

			panelImage1.setVisible(false);
			panelImage3.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage3);
			this.repaint();
		}
		if (e.getSource().equals(quitterPanel1)) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int response = JOptionPane.showConfirmDialog(null, "Would You Like to exit game?", "Warning", dialogButton);

			if (response == JOptionPane.YES_OPTION) {
				this.dispose();
			}

		}
	
		if (e.getSource().equals(pieceCentrale1Pannel3)) {//Affichage 3 PiÃ¨ce Centrale---------------

			panelImage3.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();
			Pupop.Message(" Bienvenue dans la pièce centrale du niveau 1");
			Pupop.Message(" Vous possédez actuellement 3 vies.");

		}
		
//-----------------------------< Bloc d'instruction salle EST >---------------------------------------------
		
		//Affichage de la piÃ¨ce avec Les Nunchaku/
		if (e.getSource().equals(partiEst) & this.recupNunchaku == 0) {//Affichage 5 PiÃ¨ce EST---------------
			 panelImage2.setVisible(false);
			 panelImage5.setVisible(true);
			
			 this.setTitle("L'ascension de Lee");
			
			 this.setContentPane(panelImage5);
			 this.repaint();
			 
				Pupop.Message("Le vieil homme vous offre son nunchaku ici présent pour poursuivre l'aventure.");

		}
		
		//Retour au menu d'accueil Niveau 1 
		if (e.getSource().equals(retourMenu1)) {
			panelImage5.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();

		}
		
		//Affichage image Niveau 1 : Rï¿½cupï¿½ration nunchaku
		if (e.getSource().equals(prendreArme)) {
			panelImage5.setVisible(false);
			panelImage11.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage11);
			this.repaint();
			this.recupNunchaku = 1 ;
			Pupop.Message("Avec ce nunchaku, vous pouvez maintenant accéder à la salle de combat. La salle EST est maintenant fermée.");


		}
		
		//Recup Nunchaku et retour salle centrale
		if (e.getSource().equals(retourMenu6)) {
			panelImage11.setVisible(false);
			panelImage2.setVisible(true);//

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();
		}
//-----------------------------< Fin Bloc d'instruction salle EST >---------------------------------------------
		
		
	
//-----------------------------< Bloc d'instruction salle OUEST >---------------------------------------------

      //Affichage de la piÃ¨ce avec bol de Riz
		if (e.getSource().equals(partiOuest) & mangerRiz ==0 ) {
			
			panelImage2.setVisible(false);
			panelImage4.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage4);
			this.repaint();
		}
		
		//Retour au menu d'accueil Niveau 1 
		if (e.getSource().equals(retourMenu) & mangerRiz == 0 ) {
			panelImage4.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();
		}
		
		// Prendre le bol de riz
		if (e.getSource().equals(prendreRiz)) {
			panelImage4.setVisible(false);
			panelImage10.setVisible(true);
			
			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage10);
			this.repaint();
			mangerRiz = 1 ;
			bruceLee.ajouterVie();
		}
		
		// image +1 vie
		if (e.getSource().equals(retourMenu10)) {
			panelImage10.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();
			Pupop.Message(" Vous venez de prendre un bol de riz. ");
			Pupop.Message(" Vous avez maintenant " + bruceLee.getSante() + " vies.");

		}
		
//-----------------------------< Fin Bloc d'instruction salle OUEST >---------------------------------------------
	
		

//-----------------------------< Bloc d'instruction salle SUD >---------------------------------------------
		//Affichage de la piÃ¨ce dans la Salle Coffre
		if (e.getSource().equals(partiSud) & this.recupIndice ==0) {
			panelImage2.setVisible(false);
			panelImage6.setVisible(true);//Affichage PiÃ¨ce Coffre---------------

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage6);
			this.repaint();
		}
		
		//Retour au menu d'accueil Niveau 1 aprÃ¨s etre rentre dans la salle coffre
		if (e.getSource().equals(retourMenu2)) {
			panelImage6.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();

		}
		
		//Affichage de l'image avec l'INDICE
		if (e.getSource().equals(buttonCoffre)) {//Affichage 7 PiÃ¨ce SUD partie Indice---------------
			panelImage6.setVisible(false);
			panelImage7.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage7);
			this.repaint();
			
			this.recupIndice = 1 ;
			Pupop.Message(" Les indices pourront vous servir pour l'épreuve finale. Pensez à les mémoriser");
			Pupop.Message(" La salle de coffre sera verrouillée une fois que vous retournez à la salle centrale.");

		}

		
		//Retour au menu d'accueil Niveau 1 aprÃ¨s etre rentre dans la salle coffre
		if (e.getSource().equals(retourMenu3)) {
			panelImage7.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();

		}

//-----------------------------< Fin Bloc d'instruction salle SUD >---------------------------------------------
		
		
		
		
//-----------------------------< Bloc d'instruction salle Nord >---------------------------------------------
		//Affichage de la piÃ¨ce salle Nord
		
		if (e.getSource().equals(partiNord) & this.recupNunchaku == 0) {
			panelImage2.setVisible(false);
			panelImage8.setVisible(true);//Image salle vÃ©rouiller

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage8);
			this.repaint();
		}
		
		
		//Retour au menu d'accueil Niveau 1
		if (e.getSource().equals(retourMenu4)) {
			panelImage8.setVisible(false);
			panelImage2.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage2);
			this.repaint();
		}
		
		
		// Possession Nunchaku
		if (e.getSource().equals(partiNord) & this.recupNunchaku == 1) {
			panelImage2.setVisible(false);
			panelImage9.setVisible(true);

			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage9);
			this.repaint();
		}
		
		// combattre niveau 1
		if (e.getSource().equals(combat1) & debutEpreuve1 ==0) {
			Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");

			int stop = 0 ;
			//if 
			while (bruceLee.enVie() & stop == 0) {
				Epreuve egm = new Epreuve(this.combat1LiuKang) ;
				//nb = egm.num ;  // ICI ON A PRIT LE NUMERO DE L ENIGME
				
				if (egm.verifReponse == true) { 
				Pupop.Message("Bravo ! Vous avez trouvé la bonne réponse !");
				Pupop.Message("Vous pouvez donc continuer l'aventure !");
				Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");
				stop = 1 ;} 
				
							else {
				bruceLee.retirerVie() ; 
				Pupop.infoBox("Votre réponse est incorrecte. Vous avez perdu une vie.", "Message");
				Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");
		
							}
			
			if (bruceLee.enVie() == false) {
				
				Pupop.Message("Vous n'avez plus de vie. Vous êtes mort.");
				Pupop.Message("Partie terminée.");
	
			} 
				
			debutEpreuve1 = 1 ;
			}
		}
			
		
	// passage niveau 2
			
			
			if (e.getSource().equals(accesNiveau2)& debutEpreuve1 == 1 & bruceLee.enVie()) {
				panelImage9.setVisible(false);
				panelImage12.setVisible(true);
				
				this.setTitle("L'ascension de Lee");

				this.setContentPane(panelImage12);
				this.repaint();
				
			}
			
			if (e.getSource().equals(accesNiveau2)& debutEpreuve1 == 1 & bruceLee.enVie() == false) 
				{
				Pupop.Message("Vous êtes sur le point de quitter le jeu.");

					int dialogButton = JOptionPane.YES_NO_OPTION;
						int response = JOptionPane.showConfirmDialog(null, "Would You Like to exit game?", "Warning", dialogButton);

						if (response == JOptionPane.YES_OPTION) {
							this.dispose();
						}

					}	
//-----------------------------< Fin Bloc d'instruction salle Nord >---------------------------------------------

		
			
			
// ____________________________________________ NIVEAU 2 _______________________________________________________________
		

		
		// EntrÃ©e salle centrale
		
		if (e.getSource().equals(commencerPannel12)) {
			panelImage12.setVisible(false);
			panelImage13.setVisible(true);
			
			this.setTitle("L'ascension de Lee");

			this.setContentPane(panelImage13);
			this.repaint();
			
			Pupop.Message("Bienvenue au niveau 2 ! Vous êtes à la salle centrale.");
			
			Pupop.Message("Vous possédez actuellement " + bruceLee.getSante() + " vie(s).");

			
		}
		
		
		if (e.getSource().equals(quitterPanel12)) {
			int dialogButton = JOptionPane.YES_NO_OPTION;
				int response = JOptionPane.showConfirmDialog(null, "Would You Like to exit game?", "Warning", dialogButton);

				if (response == JOptionPane.YES_OPTION) {
					this.dispose();
				}

			}
		
		
		
	////-----------------------------< Bloc d'instruction salle EST >---------------------------------------------
		
			//Affichage de la piï¿½ce avec Combattant optionnel
			if (e.getSource().equals(partiEst2) & combatOpt == 0) {//Affichage 5 Piï¿½ce EST---------------
				 panelImage13.setVisible(false);
				 panelImage15.setVisible(true);
				
				 this.setTitle("L'ascension de Lee");
				 
				 this.setContentPane(panelImage15);
				 this.repaint();
				 
				 Pupop.Message("Dilemme : Combattre ou ne pas combattre ?");
				 Pupop.Message("Une victoire vous donnera une vie supplémentaire, alors qu'une défaite vous fera perdre une vie!");
				 Pupop.Message("Vous n'avez droit qu'à une seule tentative, osez-vous prendre le risque ?") ;
			}
			
			//Retour au menu d'accueil Niveau 2
			if (e.getSource().equals(retourMenu15)) {
				panelImage15.setVisible(false);
				panelImage13.setVisible(true);

				this.setTitle("L'ascension de Lee");

				this.setContentPane(panelImage13);
				this.repaint();

			}
			
			//Accepter le combat
					
					if (e.getSource().equals(combattre) & combatOpt == 0) {
						Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");

						int flag = 0 ;
						while (bruceLee.enVie() & flag == 0) {
							Epreuve egm = new Epreuve(combat2opt) ;
						if (egm.verifReponse == true) { 
							bruceLee.ajouterVie();
							
							Pupop.Message("Bravo ! Vous avez gagné le combat optionnel !");
							Pupop.Message("Vous gagnez une vie supplémentaire !");
							Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");
							
							combatOpt = 1 ;
						}
						else {
							bruceLee.retirerVie() ; 
							Pupop.infoBox("Votre réponse est incorrecte. Vous avez perdu une vie.", "Message");
							Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");
						}
						flag = 1 ;
						}
						if (bruceLee.enVie() == false) {
							
							Pupop.Message("Vous n'avez plus de vie. Vous êtes mort.");
							Pupop.Message("Partie terminée.");
				
						}
						combatOpt = 1 ;

						}
			
	////-----------------------------< Fin Bloc d'instruction salle EST >---------------------------------------------
				
					
					
					
	////-----------------------------< Bloc d'instruction salle Nord >---------------------------------------------
			//Affichage de la piï¿½ce salle Nord pour prendre la clï¿½s
			if (e.getSource().equals(partiNord2)&&clef==0) {
				panelImage13.setVisible(false);
				panelImage19.setVisible(true);//Image salle clef qui mï¿½ne ï¿½ salle combat 

				this.setTitle("L'ascension de Lee");

				this.setContentPane(panelImage19);
				this.repaint();

			}
			
			//Retour au menu d'accueil Niveau 2
			if (e.getSource().equals(retourMenu19)) {
				panelImage19.setVisible(false);
				panelImage13.setVisible(true);

				this.setTitle("L'ascension de Lee");

				this.setContentPane(panelImage13);
				this.repaint();

			}
			
			//prendre clef
					if (e.getSource().equals(prendreClef)) {
						panelImage19.setVisible(false);
						panelImage20.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage20);
						this.repaint();
						clef = 1 ;
						Pupop.Message("Cette clef vous permet d'accéder à la salle d'épreuve.");
					}
			// retour accueil apres prendfe clef
					
					if (e.getSource().equals(retourMenu20)) {
						panelImage20.setVisible(false);
						panelImage13.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage13);
						this.repaint();

					}
			
	////-----------------------------< Fin Bloc d'instruction salle Nord >---------------------------------------------

					
					
	////-----------------------------< Bloc d'instruction salle SUD >---------------------------------------------
					//Affichage de la piï¿½ce dans la Salle Coffre2
					if (e.getSource().equals(partiSud2)&&ouvrircoffre==0) {
						panelImage13.setVisible(false);
						panelImage16.setVisible(true);//Affichage Piï¿½ce Coffre---------------

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage16);
						this.repaint();
					}
					
					//Retour au menu d'accueil Niveau 2 aprï¿½s etre rentre dans la salle coffre
					if (e.getSource().equals(retourMenu16)) {
						panelImage16.setVisible(false);
						panelImage13.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage13);
						this.repaint();

					}
					
				//Affichage de l'image avec l'INDICE 2
					if (e.getSource().equals(buttonCoffre2)) {
						panelImage16.setVisible(false);
						panelImage17.setVisible(true);

						this.setTitle("L'ascension de Lee");
						
						this.setContentPane(panelImage17);
						this.repaint();
						ouvrircoffre=1;
						Pupop.Message("Les indices pourront vous servir pour l'épreuve finale. Pensez à les mémoriser");
					}

					
					//Retour au menu d'accueil Niveau 2 aprï¿½s ï¿½tre rentre dans la salle coffre et pris l'indice 2
					if (e.getSource().equals(retourMenu17)) {
						panelImage17.setVisible(false);
						panelImage13.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage13);
						this.repaint();

					}
	////-----------------------------< Fin Bloc d'instruction salle SUD >---------------------------------------------
					

					
////-----------------------------< Bloc d'instruction salle OUEST >---------------------------------------------

//Epreuve
					
					//pièce verrouillée
				if (e.getSource().equals(partiOuest2)&&clef==0) {
					panelImage13.setVisible(false);
					panelImage14.setVisible(true);

					this.setTitle("L'ascension de Lee");

					this.setContentPane(panelImage14);
					this.repaint();

				}
				if (e.getSource().equals(retourMenu14)) {
					panelImage14.setVisible(false);
					panelImage13.setVisible(true);

					this.setTitle("L'ascension de Lee");

					this.setContentPane(panelImage13);
					this.repaint();

				}
				
				//pièce déverouillée
				if (e.getSource().equals(partiOuest2)&&clef==1) {
					panelImage13.setVisible(false);
					panelImage18.setVisible(true);

					this.setTitle("L'ascension de Lee");

					this.setContentPane(panelImage18);
					this.repaint();
					
					

				}
				
				if (e.getSource().equals(retourMenu18) & combatChuck == 0) {
					panelImage18.setVisible(false);
					panelImage13.setVisible(true);

					this.setTitle("L'ascension de Lee");

					this.setContentPane(panelImage13);
					this.repaint();
				}
				
				if (e.getSource().equals(epreuve18) & combatChuck ==0) {
					Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");

					int stop = 0 ;
					//if
					while (bruceLee.enVie() & stop == 0) {
						Epreuve egm = new Epreuve(combat3Chuck) ;
						//nb = egm.num ;  // ICI ON A PRIT LE NUMERO DE L ENIGME
						
						if (egm.verifReponse == true) { 
						Pupop.Message("Bravo ! Vous avez trouvé la bonne réponse !");
						Pupop.Message("Vous pouvez donc continuer l'aventure !");
						Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");
						stop = 1 ;} 
						
									else {
						bruceLee.retirerVie() ; 
						Pupop.infoBox("Votre réponse est incorrecte. Vous avez perdu une vie.", "Message");
						Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");

									}
					
					if (bruceLee.enVie() == false) {
						
						Pupop.Message("Vous n'avez plus de vie. Vous êtes mort.");
						Pupop.Message("Partie terminée.");
			
					} 
						
					}
					combatChuck = 1 ;

				}
				
				if (e.getSource().equals(valider)& combatChuck == 1 & bruceLee.enVie()) {
					panelImage18.setVisible(false);
					panelImage21.setVisible(true);

					this.setTitle("L'ascension de Lee");

					this.setContentPane(panelImage21);
					this.repaint();
				}
				if (e.getSource().equals(valider)& combatChuck == 1 & bruceLee.enVie() == false) 
				{
				Pupop.Message("Vous n'avez plus de vie. Vous êtes sur le point de quitter le jeu.");

					int dialogButton = JOptionPane.YES_NO_OPTION;
						int response = JOptionPane.showConfirmDialog(null, "Would You Like to exit game?", "Warning", dialogButton);

						if (response == JOptionPane.YES_OPTION) {
							this.dispose();
						}

					}
				//
				
				////-----------------------------< Fin Bloc d'instruction salle OUEST >---------------------------------------------
 // ____________________________________________ NIVEAU 3 _______________________________________________
				
				// Entrée salle centrale 3
				
				if (e.getSource().equals(commencerPannel21)) {
					panelImage21.setVisible(false);
					panelImage22.setVisible(true);
					
					this.setTitle("L'ascension de Lee");

					this.setContentPane(panelImage22);
					this.repaint();
					Pupop.Message("Bienvenue au niveau 3 ! Tu es à la salle centrale.");
					
					// Niveau de vie remis à 1 !!!
					bruceLee.setSante(1);
					Pupop.Message("ANNONCE : Qui dit dernier niveau dit difficulté !");

					Pupop.Message("En arrivant au dernier étage, votre niveau de vie est retombé à " + bruceLee.getSante() + " !");

					
				}
				if (e.getSource().equals(quitterPanel21)) {
					int dialogButton = JOptionPane.YES_NO_OPTION;
						int response = JOptionPane.showConfirmDialog(null, "Would You Like to exit game?", "Warning", dialogButton);

						if (response == JOptionPane.YES_OPTION) {
							this.dispose();
						}

					}
				
				// Salle centrale 3 - choix
				
			////-----------------------------< Bloc d'instruction salle EST 3 >---------------------------------------------
				
				//Affichage de la pièce d'otage
				if (e.getSource().equals(partiEst3) & repSalleBloque == 0) {
					 panelImage22.setVisible(false);
					 panelImage24.setVisible(true);
					
					 this.setTitle("L'ascension de Lee");
					
					 this.setContentPane(panelImage24);
					 this.repaint();
						Pupop.Message("Vous êtes piégé ! Le seul moyen de sortir d'ici est de répondre juste à ma question.");
						Pupop.Message("Vous ne perdrez pas de vie ici, mais vous n'en gagnerez pas non plus !");

					 
				
				}
				
				
				if (e.getSource().equals(combatPiege) & repSalleBloque ==0) {
					int stop = 0 ;
					//if
					while (bruceLee.enVie() & stop == 0) {
						Epreuve egm = new Epreuve(combat4Otage) ;
						// nb = egm.num ;  // ICI ON A PRIT LE NUMERO DE L ENIGME
						
						if (egm.verifReponse == true) { 
						Pupop.Message("Bravo ! Vous avez trouvé la bonne réponse !");
						Pupop.Message("Vous pouvez quitter la salle !");
						Pupop.Message("RAPPEL : Vous avez actuellement " + bruceLee.getSante() + " vie(s).");
						stop = 1 ;} 
						
									else {
						Pupop.infoBox("Votre réponse est incorrecte. Recommencez si vous voulez quitter la salle.", "Message");
				
									}
						
					repSalleBloque = 1 ;
					}
				}
				// reponse juste
				if (e.getSource().equals(retourMenu24) & repSalleBloque == 1) {
					 panelImage24.setVisible(false);
					 panelImage22.setVisible(true);
					
					 this.setTitle("L'ascension de Lee");
					
					 this.setContentPane(panelImage22);
					 this.repaint();
				}
				
		///-----------------------------< Fin Bloc d'instruction salle EST3 >---------------------------------------------
		
				///-----------------------------< Bloc d'instruction salle OUEST3 >---------------------------------------------

			      //Affichage de la piÃ¨ce salle piÃ¨ge
					if (e.getSource().equals(partiOuest3)) {//Affichage 4 PiÃ¨ce OUEST---------------
						panelImage22.setVisible(false);
						panelImage23.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage23);
						this.repaint();

					}
					
					//Partie terminer Niveau 3 salle piÃ¨ge
					if (e.getSource().equals(quitter23)) {
								this.dispose();
						}
					


			//-----------------------------< Fin Bloc d'instruction salle OUEST >---------------------------------------------
					
					//-----------------------------< Bloc d'instruction salle SUD 3 >---------------------------------------------
					//Affichage de la piÃ¨ce dans salle Marchant
					if (e.getSource().equals(partiSud3) & rendreNunchaku == 0) {
						panelImage22.setVisible(false);
						panelImage25.setVisible(true);//Affichage PiÃ¨ce avec Marchant---------------

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage25);
						this.repaint();
						Pupop.Message("Si vous voulez bien me donner votre nunchaku, je vous offrirai une récompense.");

					}
					
					//Retour au menu d'accueil Niveau 3
					if (e.getSource().equals(retourMenu25)) {
						panelImage25.setVisible(false);
						panelImage22.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage22);
						this.repaint();

					}
					
					//Affichage de l'image avec le nunchaku
					if (e.getSource().equals(donnerItem)) {//Affichage 7 PiÃ¨ce SUD Nunchaku---------------
						panelImage25.setVisible(false);
						panelImage27.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage27);
						this.repaint();
						
						this.rendreNunchaku = 1 ;
						bruceLee.setSante(3);  // +2 vies en plus
					}
					

					
					//Retour au menu d'accueil Niveau 3 aprÃ¨s obtenu nos 3 vies
					if (e.getSource().equals(retourMenu27)) {
						panelImage27.setVisible(false);
						panelImage22.setVisible(true);

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage22);
						this.repaint();
						Pupop.Message("Après avoir accepté de donner votre arme, vous avez maintenent " + bruceLee.getSante() + " vie(s).");


					}

			////-----------------------------< Fin Bloc d'instruction salle SUD >---------------------------------------------
				
					//-----------------------------< Bloc d'instruction salle Nord >---------------------------------------------
					//Salle de combat final 
					if (e.getSource().equals(partiNord3)) {
						panelImage22.setVisible(false);
						panelImage28.setVisible(true);//Image combat final avec le Boss

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage28);
						this.repaint();
						
						Pupop.Message("Bienvenue à l'épreuve finale, c'est maintenant que tout se joue !");

					}
					
					if (e.getSource().equals(debutEpreuve) & debutCombatFinal ==0 & bruceLee.enVie()) {
						Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");

						int stop33 = 0 ;
						while (bruceLee.enVie() & stop33 == 0) {
							Epreuve egm = new Epreuve(17) ;
						if (egm.verifReponse == true) { 
							Pupop.Message("Bravo ! Vous avez trouvé la bonne réponse !");
							Pupop.Message("La partie est terminée ! Vous avez gagné ! FÉLICITATION !!!");

							stop33 = 1 ;
							}
						else {
							bruceLee.retirerVie() ; 
							Pupop.infoBox("Votre réponse est incorrecte. Vous avez perdu une vie.", "Message");
							Pupop.Message("Vous avez actuellement " + bruceLee.getSante() + " vie(s).");

							}

						}
						
						if (bruceLee.enVie() == false) {
							
							Pupop.Message("Vous n'avez plus de vie. Vous êtes mort.");
							Pupop.Message("Partie terminée.");
				
						}
						debutCombatFinal = 1 ;

						}
				
					
					if (e.getSource().equals(quitterFinale)& (debutCombatFinal ==0 || bruceLee.enVie() == false )) {
						int dialogButton = JOptionPane.YES_NO_OPTION;
							int response = JOptionPane.showConfirmDialog(null, "Would You Like to exit game?", "Warning", dialogButton);

							if (response == JOptionPane.YES_OPTION) {
								this.dispose();
							}

						}
					
					if (e.getSource().equals(quitterFinale)& debutCombatFinal ==1 & bruceLee.enVie()) {
						panelImage28.setVisible(false);
						panelImage29.setVisible(true);//Image fin

						this.setTitle("L'ascension de Lee");

						this.setContentPane(panelImage29);
						this.repaint();

						}
					
					if (e.getSource().equals(quitterJeu)) {
						this.dispose();
						}
					
	
	
	
	
	
	}
			///-----------------------------< Fin Bloc d'instruction salle Nord >---------------------------------------------

						
	

	public static void main(String[] args) {
		new Jeu();
	}

}

