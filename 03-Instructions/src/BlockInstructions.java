
public class BlockInstructions {

	public static void main(String[] args) {

		//ceci est un bloc d'instructions
		//les variables d�clar�es dedans sont locales (� ce bloc)

		var a = 10;
		System.out.println( a );
		{
			var b= 20;
			a++;
			System.out.println( a + " - " + b);
		}
		System.out.println( a);//b n existe plus ici
	}

}
