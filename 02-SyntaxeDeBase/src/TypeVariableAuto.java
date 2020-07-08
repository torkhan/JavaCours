import java.util.Arrays;

public class TypeVariableAuto {

	public static void main(String[] args) {


		var val1 =10;// passe auto en occurence int
		System.out.println( val1);
		
		var date = new java.util.Date();
		System.out.println( date.getClass().getName());
		System.out.println( date);
		
		var value = Arrays.asList(10, 20, 30);
		System.out.println( value);
	}

}
 