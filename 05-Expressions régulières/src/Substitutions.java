import java.util.regex.Pattern;



public class Substitutions {

	public static void main(String[] args) {
		
		// ---Brouillage de chiffres (par ex cb)
		String myPhone = "01 03 02 04 05";
		System.out.println(myPhone.replaceAll("\\d", "x"));
		System.out.println(myPhone.replaceFirst("\\d\\d", "xx"));
		
		// ---Remplacer de multiples séparateurs par un espace
		String str = "this   is   \t   a string with\tmultiple   \n    separators";
		System.out.println(str.replaceAll("\\s{2,}", " "));//ou \\s+ pour également enlever le \t
		//la même en plus rapide et moins gourmande en ressources
		Pattern separatorsPattern = Pattern.compile( "\\s+" );
		System.out.println( separatorsPattern.matcher( str ).replaceAll( " " ));
		
		// ---Un exemple anti injection XSS
		String attak
			= "Begin\n"
			+ "<Script type='text/javascript'>document.location.href='http://site.fr'</script>\n"
			+ "<script type='text/javascript'>\n"
			+ "   windows.alert( 'ok' );\n"
			+ "</script>\n"
			+ "End\n";
		
		Pattern xssPattern = Pattern.compile("<script[^>]*>(.*?)</script>", Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
		//Pattern.DOTALL pour prendre aussi les retours lignes
		//Pattern.CASE_INSENSITIVE pour ne pas être sensible à la casse et prendre 
		//en compte  le "Script".
		String safeParram = xssPattern.matcher( attak ).replaceAll( " ");
		
		System.out.println( safeParram );
		
		
		// ---Un exemple pour mettre auto en gras certains mots
		String message = "ceci est un MESSAGE qui contient message";
				//on met en gras message et MESSAGE
		Pattern gras = Pattern.compile( "(message)", Pattern.CASE_INSENSITIVE);
					//  !!! bien mettre les () autour de la string que l on veux isoler
		System.out.println( gras.matcher( message).replaceAll( "<b>$1</b>" ));
		
		
	}

}
