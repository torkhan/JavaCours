
public class InstructionDebranchementBoucleContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			
			if ( i ==5 ) {
				continue;// si i=5 il passe la outre la commande suivant ici le
				//sys pour relancer la boucle et donc 5 ne sera pas affiché
			}
			System.out.println( i );
		}
		System.out.println( "bye" );
	}

}
