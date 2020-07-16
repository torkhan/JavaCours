
public class InstructionDebranchementBoucleBreak {

	public static void main(String[] args) {
		
			for (int i = 0; i < 10; i++) {
			
			
			if ( i ==5 ) {
				break;//break interromp la boucle et passe à la finalisation
			}
			System.out.println( i );
		}
		System.out.println( "bye" );
		
		
		for (int line = 0; line < 10; line++) {
			for (int colonne = 0; colonne < 10; colonne++) {
				if ( line ==5 && colonne==5) {
					break;
					//ici a 5x4 il arrete la 2eieme boucle et passe a 6x0
				}
				System.out.println( line + "x" + colonne);
			}
			
		}
		System.out.println( "bye" );
	
		//si l'on vaux arreter les 2 boucles
		//on crée un système d'étiquette
		
	firstBoucle:
		for (int line = 0; line < 10; line++) {
			for (int colonne = 0; colonne < 10; colonne++) {
				if ( line ==5 && colonne==5) {
					break firstBoucle;
					
				}
				System.out.println( line + "x" + colonne);
			}
			
		}
		System.out.println( "bye" );
		
		
	}
	
}
