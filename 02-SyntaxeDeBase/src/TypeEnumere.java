import java.io.BufferedReader;

import java.io.InputStreamReader;

public class TypeEnumere {
	
	static BufferedReader keyboard = new BufferedReader( new InputStreamReader( System.in ) );

	public static void main(String[] args) throws Exception {


		//pour cet exemle sur un feu tricolore nous avons besoin
		//d'ENUMERER les différents états du feu ( vert, orange et rouge)
		//dans le rep défaut click droit new enum
		//ensuite on peux les utiliser
		Feu feu = Feu.VERT;
		
		//on affiche dans la demande d'action dans la console
		System.out.print( "Que voulez-vous faire? (passer, attendre):");
		//et on lit la réponse
		String action = keyboard.readLine();
		//il faut ajouter la ligne "static Buff....." pour que "keyboard" soit reconnu
		
		if ( action.equals( "passer")) {
			if ( feu != Feu.VERT) {
				System.out.println( "Impossible le feu n'est pas vert");
			}else {
				System.out.println( "bonne route");
			}
		}else if ( action.equals( "attendre")) {
			if ( feu == Feu.VERT) {
				System.out.println( "Le feu est vert vous devez passer");
			}else {
				System.out.println( "bien joué");
			}
		}else {
			System.out.println( "commande inconnue");
		}
		
	}

}
