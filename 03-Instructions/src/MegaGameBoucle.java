import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MegaGameBoucle {
	
	//jeux : trouver la chiffre al�atoire d�fini par le programme
		//et indiquer le nombre de tours
	

	private static BufferedReader Keyboard = new BufferedReader(
			new InputStreamReader ( System.in)
		);
		
	public static void main(String[] args) throws Exception{
		
		int value = 1 + (int)(Math.random() * 100)	;	
		//Math.random donne une valeur entre 0.0 et 0.9
		// on ajoute 1 et * 100 pour avoir une plage de 1 � 100
		 System.out.println( value );
		 
		int valeurDonn�e;
		int coups = 0;
		do {
			
			System.out.print( "Entrez une valeur entre 1 et 100 :");
			valeurDonn�e = Integer.parseInt(Keyboard.readLine());
			coups++;
			
			if (valeurDonn�e < value) {
				System.out.println( "vous �tes en dessous");
			}else if( valeurDonn�e > value){
				System.out.println( "vous �tes au dessus");
			}
			
		} while ( valeurDonn�e != value);
		
		System.out.println( "Bravo! vous avez trouv� en " + coups + "coup(s)");
	}

}
