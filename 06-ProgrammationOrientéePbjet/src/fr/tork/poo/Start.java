package fr.tork.poo;

public class Start {

	public static void main(String[] args) {

		//encapsulation et fraction
		//il faut ce qu il y a dans les attributs
		//par exemple ici le dénominateur ne peux pas être 0 sinon cela génère une erreur
		//en settant et gettant  on voit de suite les erreurs et on sécurise
		
		NombresRationnels r = new NombresRationnels(0, 0);
		//ici mes atributs sont instanciés à 0 tant qu on ne les modifient pas
//		il faut alors passer par un constructeur dans ma classe NombresRationnels
//		
//		
		r.setNumerateur( 3 );
		r.setDenominateur( 4 );
//		
	System.out.printf( "[%d/%d]\n", r.getNumerateur(), r.getDenominateur());

	}

}
