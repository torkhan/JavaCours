
public class Switch {

	public static void main(String[] args) {
		
		var value = (int) (Math.random() * 10);
		
		 switch( value ) {
		 case 0:
			 System.out.println( "0");
			 break;
		 case 1:
			 System.out.println( "1");
			 break;
		 case 2:
			 System.out.println( "2");
			 break;
		 case 3:
		 case 4:
		 case 5:
			 System.out.println( "3-5");
			 break;
			default:
			System.out.println( "autre" );
		 }
		 
		 //switch en java 14
		 //plus de break remplacé par "->" et  le case accepte plusieures valeurs
		 
		 int value2 = (int) (Math.random() * 10);
		 
		 switch( value2 ) {
		 case 0, 1, 2, 3, 4 -> System.out.println( "petit chiffre");
		 case 5, 6, 7, 8, 9 -> System.out.println( "grandchiffre");
		 default -> System.out.println("bleble");
		 }
		 
		 //on peux utiliser le switch sous forme d'expression
		 
		 var value3 = (int) (Math.random() * 10);
		 
		 String result = switch( value3) {
			 case 0, 1, 2, 3, 4 ->  "petit chiffre";
			 case 5, 6, 7, 8, 9 ->  "grandchiffre";
			 default -> "bleble";
			 
		 };
		 System.out.println( result );
		 

		 //si plusieures instructions dans le case  il faut utiliser les mot clé yield
		 
		 var value4 = (int) (Math.random() * 10);
		 
		 String result2 = switch( value3) {
		 	case 0, 1, 2, 3, 4 -> {
				double sqrt = Math.sqrt(value);
				yield "petit chiffre dont la racine carrée vaux" + sqrt;
			}
		 	case 5, 6, 7, 8, 9 -> {
			 	double square = value4 * value4;
			 	yield "grand chiffre dont le carré vaux " + square;
		 	}
		 	default -> "bleble";
			
		};
		
		System.out.println( result2 );
		
	}

}
