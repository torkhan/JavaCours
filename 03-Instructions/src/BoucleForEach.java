import java.util.ArrayList;

public class BoucleForEach {

	public static void main(String[] args) {

		int [] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		//on affiche toutes les valeurs du tableau
		
		//for classique
		for( int i=0; i<array.length; i++) {
			int value = array[i];
			System.out.println( value);
		}
		
		//avec for each (ctrl espace)
		
		for (int value : array) {
			System.out.println( value); 
		}
		
		//exemple sur une collection
		//le tableau a une taille définie lors de sa création
		//la collection est dynamique et peux être enrichie
		
		ArrayList<String> Languages = new ArrayList<>();
		Languages.add( "Java");
		Languages.add( "c+");
		Languages.add( "css");
		
		for (String langage : Languages) {
			System.out.println( langage);
		}
		
		
	}

}
