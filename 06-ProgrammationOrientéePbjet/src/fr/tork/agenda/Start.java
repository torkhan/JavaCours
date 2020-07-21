package fr.tork.agenda;

public class Start {

	public static void main(String[] args) {

		Personne James = new Personne ( "Bond", "James", "007@mi6.uk");
		System.out.println( James);
		
		Employe emp = new Employe(  "Bourne", "Jason", "jb@cia.com", 1500 );
		System.out.println( emp );//on ne spécifie rien donc il prend le 
		//commun defini dans la class Personne => John Doe
		
		Client client = new Client( "White", "House", "white@house.com", 1 );
		System.out.println( client );
		
		System.out.println( "-------------------------------------");
		
		Personne [ ] personnes = new Personne[3];
		personnes[0] = new Personne();
		personnes[1] = new Employe( "Bourne", "Jason", "jb@cia.com", 1500 );
		personnes[2] = new Client( "Bond", "James", "007@mi6.uk", 154);
		
		//traite toutes les personnes
		for (Personne personne : personnes) {
			System.out.println( personne );
		}
		System.out.println( "-------------------------------------");
		//traite que les employes
		for (Personne personne : personnes) {
			if( personne instanceof Employe) {// toutes sont Object ou Personne
				System.out.println( personne );
			}
		}
		System.out.println( "-------------------------------------");
		//traite que les clients
		for (Personne personne : personnes) {
			if( personne instanceof Client) {
				System.out.println( personne);
			}
		}
		
	}

}
