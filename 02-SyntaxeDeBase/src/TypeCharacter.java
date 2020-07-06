
public class TypeCharacter {

	public static void main(String[] args) {
		
		String str = "une chaine de caractères"; // une chaine typ�e String avec doubleCot
		char chr = 'a'; //un caractère typé char avec singleCot
		System.out.println(str + "  " + chr );
		
		//les caract�res sp�ciaux avec \
		char retourALaLigne = '\n';
		char tabulation = '\t';
		System.out.println("début" + retourALaLigne + "milieu" + tabulation + "fin");
		
		//unicode  voir tous les caractères sur unicode-table.com
		char piMaj = '\u3DF7'; //codification en héxadécimal
		char piMin = 960; // codification en décimal
		String str2 = "chaine avec  un caractère spécial en héxa \u03A0";
		System.out.println(piMaj + " - " + piMin + " -" + retourALaLigne + str2);
		
		// des méthodes statiques pour tester les caractères
		boolean isDigit = Character.isDigit( chr);
		System.out.println(isDigit);
		boolean isLetter = Character.isLetter(piMin);
		System.out.println(isLetter);
		boolean isUpperCaseLettre = Character.isUpperCase( piMin);
		System.out.println( isUpperCaseLettre );
		
	}

}
