
public class TypesEntiers {

	public static void main(String[] args) {
		
		int counter = 10;
		counter ++; // incr�ment
		System.out.println(counter);
		
		// R�gles pour les variables : caract�res(mais on �vite les accents, pas de maj en 1er et camelCase) 
		// chiffres (mais pas en 1er),
		// "_" et "$" autoris�es mais d�conseill�s
		// Il y a des mots cl�s r�serv�s (int, class, while......)
		
		
		// il y a 4 types d'entiers
		//  byte   qui prend 1 octet  => de -128 � 127
		//  short  qui prend 2 octets => de -32768 � 32767
		//  int              4 octets => de -2milliard150 � 2M150  a peu pr�s
		//  long             8 octets => 2�64 !!!!! dans ce cas  il faut typer la variable avec "L" ex:10_000_000_000L
		
		// il y a 4 bases num�riques
		int decilmalValue = 10;
		int binaryValue = 0b10;// =2 en binaire
		System.out.println(binaryValue);
		int octalValue = 010; // =8  ! si l'on fait commencer un chiffre par 0 (054) on rentre en octal
		int hexadecimalValue = 0xff;// =255
		System.out.println(decilmalValue + "-" + binaryValue + "-" + octalValue + "-" + hexadecimalValue);
		
		//Les op�rateurs: ++, --, + - * / %, += -= *= /= %=
		int a = 33;
		int b = 44;
		int result = a + b;
		System.out.println(result); 
		
	}

}
