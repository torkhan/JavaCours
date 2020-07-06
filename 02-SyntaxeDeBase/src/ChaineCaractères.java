
public class ChaineCaractères {

	public static void main(String[] args) {

		String message = "C'est une chaîne De caractères (\u03c0)";
		System.out.println(message);
		
		// Opérateurs pour manipuler les chaînes de caractères
		String start = "Start";
		start = start + " After";// ou start += "after"
		
		// la classe String propose des méthodes par ex..
		// --!!-- Le contenu d'une chaîne de caractères stockée ne peux être modifié
		//  donc si je veux tout passer en Maj je modifie la chaîne et l'initialise dans une nex var
		String maj = message.toUpperCase();
		System.out.println( maj );
		System.out.println(message); 
		
		String partieDeChaîne = message.substring( 10, 16);//( le 1er caractère à extraire  et celui AVANT lequel on s'arrete 
		System.out.println(partieDeChaîne);
		
		String [] plusieuresPArties = message.split( " " );
		for (String str : plusieuresPArties) {
		System.out.println( str + " - " );
		}
		System.out.println();
		
		String remplace = message.replace( "chaîne", "replacement");
		System.out.println(remplace);
		
		
		// Pour transformer des chaînes en nombres et inversement
		
		String strValue = "123";
		int value = Integer.parseInt( strValue );
		strValue = "3.14592654";
		double value2 = Double.parseDouble( strValue );
		System.out.println( value + " - " + value2 );


		//--!-- Comparaison chaînes de caractères
		
		String str1 = "toto";
		String str2 = "tata";
		String str3 = "toto";
		System.out.println(str1 == str2);// on pourrait croire que c'est bon
		System.out.println(str1 == str3);// mais ce qui est comparé ce sont les adresses en mémoire
		
		//pour vérifier ça
		
		String moitiéDeTo = "to";
		String str4 = moitiéDeTo + moitiéDeTo;
		System.out.println( str1 + " - " + str4 + " - " + (str1 == str4));
		// ce qui donne toto - toto - false!
		//car les pointeurs en mémoire sont !=
		
		// pour comparer 2 chaînes ce caracrtères
		System.out.println( str1.equals(str4));
		// pour comparer 2 chaînes ce caracrtères sans tenir compte de la casse
		System.out.println( str1.equalsIgnoreCase( str4));
	}

}
