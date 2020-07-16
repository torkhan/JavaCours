
public class Mathssss {

	public static double mini ( double a, double b) {
		if ( a < b ) {
			return a;
		} else {
			return b;
		}
	}
	
	public static double mini2 ( double a, double b) {
		double result = ((a < b ) ? a : b);
		return result;//autre façon
	}
	
	//expression conditionnelle
	public static double mini3 ( double a, double b) {
		
		return (a < b ) ? a : b;//autre façon condition (a<b) la partie ou c est vrai
		// ?  et la partie ou  c'est faux
	}
	
	public static void main(String[] args) {
		System.out.println( mini (8.3, 5.7));
		System.out.println( mini2 (8.3, 5.7));
		System.out.println( mini3 (8.3, 5.7)); 

	}

}
