@SuppressWarnings( "unused" )
public class StringOptimisation {
	
	private static final int LOOP_COUNT = 10_000_000;
	
	public static void sansOptimisations() {
		long begin = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		for (int i=0; i<LOOP_COUNT; i++) {//dure 6sdes
		String fullMessage = "begin - ";
		fullMessage += part1;
		fullMessage += " - ";
		fullMessage += part2;
		fullMessage += " - ";
		fullMessage += part3;
		fullMessage += " - ";
		fullMessage += part4;
		fullMessage += " - End";
//		System.out.println( fullMessage );
		}
		long end = System.currentTimeMillis();	
		System.out.println( "Durée: " + (end-begin) + "ms");
		
	}
	// Pour optimiser il existe 2 methodes
	// StringBuffer (j1)
	// StringBuilder (j5)
	
	public static void avecOptithreadSafe() {//dure 4sdes
		long begin = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		for (int i=0; i<LOOP_COUNT; i++) {
		StringBuffer buffer = new StringBuffer( "begin - " );
			buffer.append( part1);
			buffer.append( " - ");
			buffer.append( part2);
			buffer.append( " - ");
			buffer.append( part3);
			buffer.append( " - ");
			buffer.append( part4);
			buffer.append( " - End");
		String fullMessage = buffer.toString();
//		System.out.println( fullMessage );
		}
		long end = System.currentTimeMillis();	
		System.out.println( "Durée: " + (end-begin) + "ms");
		
	}
	public static void avecOptithreadUnsafe() {//dure 4sdes
		long begin = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		for (int i=0; i<LOOP_COUNT; i++) {//dure 3.7sdes
		StringBuilder builder = new StringBuilder( "begin - " );
			builder.append( part1);
			builder.append( " - ");
			builder.append( part2);
			builder.append( " - ");
			builder.append( part3);
			builder.append( " - ");
			builder.append( part4);
			builder.append( " - End");
		String fullMessage = builder.toString();
//		System.out.println( fullMessage );
		}
		long end = System.currentTimeMillis();	
		System.out.println( "Durée: " + (end-begin) + "ms");
		
	}

	public static void main(String[] args) {


		sansOptimisations();
		avecOptithreadSafe();//StringBuffer
		avecOptithreadUnsafe();//StringBuilder
		
		//--!-- Les concaténations en ligne sont automatiquement optimisées
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03c0';
		
		String fullMessage = "Begin -" + part1 + " - "  + part2 + " - " + part3 + " - " + part4 + " -End ";
		// Le compilateur utilise auto un builder
		System.out.println(fullMessage);
		
		//parcontre si l'on doit concaténer dans une boucle comme au dessus on écrit le builder
	}

}
