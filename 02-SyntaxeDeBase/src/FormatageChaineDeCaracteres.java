import java.util.Date;

public class FormatageChaineDeCaracteres {

	public static void main(String[] args) {
		
		int num = 8;
		int den = 11;
		System.out.println( "[" + num + "/" + den + "]" );
		//que l on peux aussi écrire
		System.out.printf( "[%d/%d]\n", num, den);// le 1er parametre est le format
		// ici nous voulons ecrire [8/11] donc [    %d qui permet d'injecter une valeur entiere
		// ensuite viennent les valeurs autant qu il y a de %d.
		// \n pour forcer le retour à la ligne
		
		// Ou en mode variable
		String message = String.format( "[%d/%d]\n", num, den);
		System.out.print (message );// pas println  car le retour a la ligne est déjà fait \n
		
		//exemples de formatage
		
		//  --types entiers--
		System.out.printf( ">%5d<\n", num);//le 5 donne le nombre de caracteres
		//que l on veux pour afficher l'entier
		//ce qui donne ici  blancblazcblancblanc8
		System.out.printf(">%05d<\n", num);//le 0 remplace les blancs pas des zeros
		
		System.out.printf(">%d<\n", 1_000_000_000);//affiche 1000000000
		System.out.printf(">%,d<\n", 1_000_000_000);//gace à la ,  affiche 1 000 000 000
		
		System.out.printf( ">%d %o %x<\n", num, num ,num);//decimal(d)  octal(o) héxa(x)
		
		
		//  --types flottants--
		System.out.printf( "%f\n", Math.PI);//f pour flottants
		System.out.printf( "%5.2f\n", Math.PI);//5 taille totale de caracteres .2 => 2 apres la virgule
		System.out.printf( "%e\n", Math.PI);//e pour exponentiel
		
		//  --Caractères et chaînes
		System.out.printf( "%c - %s\n", 'n', "zozozozo");//c pour caractere('n') s pour chaîne("zozozo")
		System.out.printf( ">%-10s<\n", "toto");//-(10) pour caleer les blancs après la chaîne
		
		//  --autres types--
		System.out.printf ("%b \n", true);//booleen
		System.out.printf( "%tF %tT \n", new Date(), new Date() );//tF date tT heure  (local)
		
	}

}
