
public class Assertio {
	//assert permet de v�rifier des conditions
	
	
	public static int fact( int value) {
		assert value >= 0 : "value doit �tre positive";
		//if ( value < 0 ) { throw new IllegalArgumentException( "value doit �tre positif");
		//ce test est du coup syst�matiquement refait
		//dont pour am�liorer le temps d'action on fait un assert
		if ( value <=1 ) {
			return 1;
					
		}return value * fact( value -1 );
	}
	
	
	public static void main(String[] args) {
//		assert args.length == 2 : "deux param�tres sont requis";
		
		long begin = System.currentTimeMillis();
		
		System.out.println( "6! == " + fact( 6 ));
		
		long end = System.currentTimeMillis();
		System.out.println( "dur�e = " + (end-begin) + " ms ");
		
	}

}
