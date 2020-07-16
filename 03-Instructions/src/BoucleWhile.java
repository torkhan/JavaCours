import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BoucleWhile {
	//utiliser crtl espace  pour importer la classe
	//pour chopper la saisie clavier
	private static BufferedReader Keyboard = new BufferedReader(
			new InputStreamReader ( System.in)
		);
		
	public static void main(String[] args) throws Exception{
//
//		int i = 0;
//		while( 1 < 10) {
//			System.out.println( i );
//			i++;
//		}
		
		boolean mustExit = false;
		while( mustExit == false) {
			System.out.print( "veuillez saisir une commande : ");
			String command = Keyboard.readLine();
			System.out.println( "traitement de la commande " + command);
			if( command.equals( "exit")) {
				mustExit = true;
			}
			
		}
		System.out.println( "bye" );
		
		
	}

}
