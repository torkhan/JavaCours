import java.util.ArrayList;

public class Tableaux {

	public static void main(String[] args) {
		
		int [] monTableau = new int[5]; // un tab d'entiers (int) contenant 5 elements
		monTableau[0] = 10;
		monTableau[1] = 20;
		monTableau[2] = 30;
		monTableau[3] = 40;
		monTableau[4] = 50;
		
		for( int value : monTableau) {
			System.out.println( value );
		}
		//ou ecrit plus rapidement
		int [] tab2 = { 50, 60, 70, 80, 90 };
		for ( int value : tab2 )
		System.out.println( value );
		
		//pour écrire un tableau qui n a pas de taille fixe
		//on utilise une "collection"
		
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add( "truc" );
		collection1.add ( "machin" );
		for (String string : collection1) {
			System.out.println( string );
		}

	}

}
