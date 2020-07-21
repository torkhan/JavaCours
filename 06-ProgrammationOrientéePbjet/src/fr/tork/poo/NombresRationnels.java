package fr.tork.poo;

public class NombresRationnels {

	//attributs de notre classe
	//si l on ne défini pas, ces attributs ne seront "visibles" que dans le packetage
	//pour qu ils soient visibles de partout  on ajoute public
	//si l on veux qu ils soient uniquement visibles dans leur classe => private
	private int numerateur;//ici instancié a 0
	private int denominateur;
		
	//du coup on défini les methodes ici, cela sécurise et factorise
	
	
	//le constructeur
	// ou click droit source et generate
	
	
	
	
	public NombresRationnels(int numerateur, int denominateur) {
		
//		this.numerateur = numerateur;
//		this.denominateur = denominateur;
		
		//---!!!!  ajouter les set pour appliquer les contraintes déjà faites
		this.setNumerateur( numerateur );
		this.setDenominateur ( denominateur );
	}
	
	
	
	
	
	//tape rapide avec eclispe => getN  et crtl espace
	//idem                        setN
	// ou click droit source et generate getters and stters
	
	
	public int getNumerateur ( ) {
		return this.numerateur;
	}
	
	

	public void setNumerateur( int numerateur) {	
		this.numerateur = numerateur;
	}

	public int getDenominateur() {
		return denominateur;
	}

	public void setDenominateur(int denominateur) {
		// c'est ici qu on gère les erreurs et ici le 0 interdit
		this.denominateur = denominateur;
	}
	
	

}


