
public class BoucleFor {

	public static void main(String[] args) {

		for ( int i=0; i<10; i++) {
			System.out.println( i );
		}
		System.out.println( "fini" );//sortie de boucle
		
		for ( int j=0; j<10; j+=2) {//incrément +2
			System.out.println( j );
		}
		System.out.println( "fini2" );
		
//		for ( int j=10; j>10; j--) décremente
		//la variable i n existe ici que dans la boucle si je veux l utiliser plusieures fois
		//il faut la déclarer comme variable globale
	}
	

}
