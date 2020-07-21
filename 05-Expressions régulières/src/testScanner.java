import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) {

//		try (Scanner variable = new Scanner( System.in)) {
//			System.out.print( "veuillez saisir votre login:  " );
//			String login = variable.nextLine();
//			System.out.print( "veullez saisir votre MDP:  " );
//			String mdp = variable.nextLine();
//			if (login.equalsIgnoreCase( "bond" ) && (mdp.equals( "007" ))){
//				System.out.println( " Bijour Mr Vincent");
//			}else {
//				System.out.println( "connais pas" );
//			}
//			System.out.print( "donne un chiffre");
//			int chiffre = variable.nextInt();
//			if( chiffre>100) {
//				System.out.println( "glop");
//			}else {
//				System.out.println( "pasGlop");
//			}
//		}
		
//		ProcessBuilder process = new ProcessBuilder( "ipConfig" );
//		process.redirectErrorStream(true);
//		try ( Scanner scanner = new Scanner( process.start().getInputStream() )){
//			while ( scanner.hasNext()) {
//				String line = scanner.nextLine();
//				if ( line.length() > 0 && line.charAt( 0 ) !=  ' ' ) {
//					System.out.println( line );
//				}
//				System.out.println( "tototo");
//			}
//		}
		//--- recuperer la lecture selon un format
		try ( Scanner scanner = new Scanner( System.in)){
			System.out.print( "entre adress ip, une valeur en double et un email: ");
			
			String ip = scanner.next( "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}" );
			System.out.println( "adrres ip = " + ip);
			
			double valeur = scanner.nextDouble();
			System.out.println( "double ==: " + valeur);
			
			String email = scanner.next( "[\\w.-]+@[\\w.-]+\\.[a-z]{2,}" );
			System.out.println( "email = " + email);
		}
		
	}

}
