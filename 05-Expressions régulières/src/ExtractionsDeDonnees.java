import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractionsDeDonnees {

	public static void main(String[] args) {

		// ---extraire donn�es avec String.split
		String [] dates = { "20-08-2010", "14/02/2020" };
		for (String date : dates) {
			String [] dateParts = date.split( "[/-]");
			System.out.printf( "%s - %s - %s\n", dateParts[0], dateParts[1], dateParts[2]);
		}
		
		
		// ---extraire avec Matcher
		String monHtml = "<html><head><title>Titre</title></head><body><h1>Tire visuel</hi></body></html>";
		String regex = "<(.+?)>";//regex pour le tag qui doit commerncer et finir par <>
		//et qui contient des caract�res quelconques (.) au moins 1 fois (+)
		//les parenth�ses sont l� pour dire de r�cup�rer l interieur du tag
		//si on voulait recup le tag avec les <> on aurait ecrit (<.+>)
		//le ? vas rendre l expression r�guli�re "non gourmandes"
		//cad que sans le ? elle prendra toute la cha�ne
		//avec le ? elle prendra bien 1 tag � la fois
		
		Pattern htmlPattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher htmlMatcher = htmlPattern.matcher( monHtml);
		while ( htmlMatcher.find()) {
			System.out.println( "expression qui matchent: " + htmlMatcher.group( 0 ));
			System.out.println( "tag " + htmlMatcher.group( 1 ));
			
			
		}
		
		
		
		
		
		
	}

}
