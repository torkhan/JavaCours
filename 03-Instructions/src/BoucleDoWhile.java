import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BoucleDoWhile {

	private static BufferedReader Keyboard = new BufferedReader(
			new InputStreamReader ( System.in)
		);
		
	public static void main(String[] args) throws Exception{

		//  do while sert a faire AU MOINS un tour de boucle
		String command = "";
		do {
			System.out.println( "veuillez saisir une commande : " );
			command = Keyboard.readLine();
			System.out.println( "traitement de la commande " + command);
		}while ( ! command.equals( "exit"));
		
		System.out.println( "bye");
		

	}

}
