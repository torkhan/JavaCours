
public class Assertio {
	//assert permet de vérifier des conditions
	
	
	public static int fact( int value) {
		assert value >= 0 : "value doit être positive";
		//if ( value < 0 ) { throw new IllegalArgumentException( "value doit être positif");
		//ce test est du coup systématiquement refait
		//dont pour améliorer le temps d'action on fait un assert
		if ( value <=1 ) {
			return 1;
					
		}return value * fact( value -1 );
	}
	
	
	public static void main(String[] args) {
//		assert args.length == 2 : "deux paramètres sont requis";
		
		long begin = System.currentTimeMillis();
		
		System.out.println( "6! == " + fact( 6 ));
		
		long end = System.currentTimeMillis();
		System.out.println( "durée = " + (end-begin) + " ms ");
		
	}

}
