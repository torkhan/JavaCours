
class Rational {
	int numerateur;
	int denominateur;
}


public class Mathematiques {
	
	public static int maxi ( int a, int b) {
		return a>b ? a : b;//si a>b alors renvoi a sinon b
	}
	
	public static int power ( int value, int pow) {
		int accumulator = 1;
		for (int i = 0; i < pow; i++) {
			accumulator *= value;
			
		}
		return accumulator;
		
	}
	
	public static int pgcd( int first, int second) {
		//pgcd plus grand commun diviseur
		while( second != 0) {
			int reste = first % second;
			first = second;
			second = reste;
		}
		return first;
	}
	
	public static void main( String[] args ) {//void= vide donc cette methode 
		//n attends pas de retour
		
		System.out.println( "maxi (3, 5) == " + maxi (3, 5));
		System.out.println( "power (2, 0) == " + power(2, 0));
		System.out.println( "power (2, 1) == " + power(2, 1));
		System.out.println( "power (2, 2) == " + power(2, 2));
		
		System.out.println( "le pgcd de (10, 2) est " + pgcd(10, 2));
		
		Rational r = new Rational();
		r.numerateur = 3*7*11*13; 
		r.denominateur = 2*3*7*11;
	}
	

}
