
public class MethodesParamaetresVariables {
	
	public static int add (int [] values ) {//autre syntaxe avec int ... values
		int accumulator= 0;
		for (int val :values){
			accumulator += val;
		}
		return accumulator;
	}

	public static void main(String[] args) {

		int [] values = { 10, 20, 30, 40, 50 };
		System.out.println( add( values));//ici il lui faut un [] de values
		
		// si on avait utilisé la syntaxe int ... values
		//on aurait pu fait des println en donnant des valeurs directement
		//System.out.println( add( 10, 20);
		
		
		System.out.printf( "[%d/%d]\n", 3, 7);
		System.out.printf( "[%d,%d,%d]\n", 3, 7, 9);
		//printf prend "[un format]", et des valeurs respectant ce format
		//%d = un entier
	}

}
