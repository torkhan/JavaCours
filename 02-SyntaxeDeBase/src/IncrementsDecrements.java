
public class IncrementsDecrements {

	public static void main(String[] args) {
	
		int a = 10;
		a++;
		System.out.println(a);// a est incr�ment� = 11.
		
		int b = 10;
		System.out.println(b++); // b = 10 car l'affichage se fait avant l'incr�ment
		System.out.println(b++); // b = 11 car le 1er incr�ment � �t� fait
		
		int c = 10;
		System.out.println(++c); // c = 11 l'inc�ment est fait
		
		int d = 10;
		int e = 20;
		int result = d++ + e++;
		System.out.println(result + " - " + d++ + " - " + e++); // donne 30-11-20
		

	}

}
