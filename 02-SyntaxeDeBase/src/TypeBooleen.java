
public class TypeBooleen {

	public static void main(String[] args) {
		
		boolean etat1 = true;
		System.out.println( etat1 );
		boolean etat2 = false;
		System.out.println( etat2 );
		
		
		// Op�rateurs bool�ens:  && (AND)  || (OR)  ! (not)
		
		if ( etat1 && etat2 ) {
		System.out.println("Les deux vairiables sont initialis�es � 'true'");
		}
		
		if ( etat1 || etat2 ) {
			System.out.println("L'une des deux vairiables est initialis�e � 'true'");
		}
		if( ! etat1) {
		System.out.println("etat1 est true");
		}
		if( ! etat2) { // ou etat2 == false
			System.out.println("etat2 est false");
		}
	}

}
