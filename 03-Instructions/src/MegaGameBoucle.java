import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MegaGameBoucle {
	
	//jeux : trouver la chiffre aléatoire défini par le programme
		//et indiquer le nombre de tours
	

	private static BufferedReader Keyboard = new BufferedReader(
			new InputStreamReader ( System.in)
		);
		
	public static void main(String[] args) throws Exception{
		
		int value = 1 + (int)(Math.random() * 100)	;	
		//Math.random donne une valeur entre 0.0 et 0.9
		// on ajoute 1 et * 100 pour avoir une plage de 1 à 100
		 System.out.println( value );
		 
		int valeurDonnée;
		int coups = 0;
		do {
			
			System.out.print( "Entrez une valeur entre 1 et 100 :");
			valeurDonnée = Integer.parseInt(Keyboard.readLine());
			coups++;
			
			if (valeurDonnée < value) {
				System.out.println( "vous êtes en dessous");
			}else if( valeurDonnée > value){
				System.out.println( "vous êtes au dessus");
			}
			
		} while ( valeurDonnée != value);
		
		System.out.println( "Bravo! vous avez trouvé en " + coups + "coup(s)");
	}

}
