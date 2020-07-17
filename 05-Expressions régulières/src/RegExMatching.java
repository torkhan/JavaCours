
public class RegExMatching {
	
	public static boolean isValideEmail ( String email) {
		//regex simple qui accepterait @@@@.@ par ex
		//String regExp = "^.+@.+\\..+$" ;
		
		//plus restrictif
		String regExp = "^[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[a-z]{2,}$";
		
		//la meme en mode raccourci
		//String regExp = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";
		// --!!-- n'accepte que les caractères latins
		
		
		return email.matches( regExp );
	}
	
	public static boolean isValideDate ( String date) {
		// on veux valider  jj/mm/aaaa ou aa
		
		String regExp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)?([0-9]{2})$";
		
		return date.matches( regExp );
	}
	
	// --!!--  les performances peuvent être améliorées
	// voire tuto 28 compilations d'expressions régulières
	
	

	public static void main(String[] args) {

		System.out.println( isValideEmail( "martin@societe.com" ));
		System.out.println( isValideEmail( "martin.societe.com" ));
		System.out.println( isValideEmail( "martin@societe" ));
		
		System.out.println( isValideDate( "30/05/1998" ));

	}

}
 