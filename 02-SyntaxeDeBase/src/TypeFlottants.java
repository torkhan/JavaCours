@SuppressWarnings( "unused" )
public class TypeFlottants {

	public static void main(String[] args) {
		
		//float f1; //folttant simple pr�cision qui prend 4 octets en m�moire
		//double f2; //folttant simple pr�cision qui prend 8 octets en m�moire
		double f2 = 3.141592654; 
		//f1 = 3.6;  donne une erreur car le "." type en double et dnc il y a risuqe de perte de pr�cision
		//pour "forcer" une valeur flottante il faut la typer avec f ou F
		float f1= 3.6f;
		
		//System.out.println(f2 + " - " + f1);
		
		// il y a 2 formes pour repr�senter un nombre flottant avec le "." et l'exposant
		 
		double avecLePoint = 1.1234;
		double avecLexposant = 11234e-4;
		//System.out.println(avecLePoint + " - " + avecLexposant);
		
		// Attention pi�ge
		//double result = 1 / 3; // donne 0 car il s'agit de deux entiers il faut aumoins 1 flottant
		double result = 1 / 3.00; // donne bien 0.33333
		//System.out.println(result);
		
		// Valeurs possibles
		double essai1 = 3.1415; // affiche la valeur folttante 3.1415
		double essai2 = 3 / 0.0; // affiche Infinity obtenu aussi avec //double essai2 = Double.POSITIVE_INFINITY;
		
		double essai3 = 0.0 / 0.0; //affiche NaN obtenu aussi avec //double essai2 = Double.NaN;
		//System.out.println(essai1 + " - " + essai2 + " - " + essai3);
		
		//pour tester
		float fl1 = 3.6f;
		float fl2 = Float.NaN;
		float fl3 = Float.NEGATIVE_INFINITY;
		System.out.println(Float.isFinite( fl1 ));
		System.out.println(Float.isFinite( fl2 ));
		System.out.println(Float.isFinite( fl3 ));
		
		System.out.println(Float.isInfinite( fl1 ));
		System.out.println(Float.isInfinite( fl2 ));
		System.out.println(Float.isInfinite( fl3 ));
		
		System.out.println(Float.isNaN( fl1 ));
		System.out.println(Float.isNaN( fl2 ));
		System.out.println(Float.isNaN( fl3 ));
		
		
 
	}

}
