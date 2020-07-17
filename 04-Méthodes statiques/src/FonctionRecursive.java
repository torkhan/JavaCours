
public class FonctionRecursive {
	
	//une fonction recursive est une fonction qui s'apelle elle meme
	
	//on vas coder une focntion factorielle en iteratif (boucle) puis en factoriel
	
	//en iteratif
	public static long factIt (long value) {
		long accumulator = 1;
		for (int i = 2; i <= value; i++) {
			accumulator *= i;
		}
		return accumulator;
	}
	
	//en recursive !! peut etre plus gourmande en ressources
	public static long factRec ( long value) {
		//on commence par le cas terminal cad ici pour la factoreille 0 ou 1
		if (value == 0 || value == 1) {
			return 1;
		}
		return value * factRec( value-1 );
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println( "factorielle 0! == " + factIt (0));
		System.out.println( "factorielle 1! == " + factIt (1));
		System.out.println( "factorielle 5! == " + factIt (5));
		System.out.println( "factorielle 6! == " + factIt (6));
		
		System.out.println( "factorielle 0! == " + factRec (0));
		System.out.println( "factorielle 1! == " + factRec (1));
		System.out.println( "factorielle 5! == " + factRec (5));
		System.out.println( "factorielle 6! == " + factRec (6));
	
	}
}
