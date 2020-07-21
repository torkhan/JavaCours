package fr.tork.agenda;

public class Employe extends Personne {

	private static final int SMIC = 1500;
	//1500 entré dans le setSalaire click droit refractor
	//extract constant   ce qui le défini en constante
	private double salaire;

	
	
	
	
	
	
	
	public Employe(double salaire) {
		super();
		this.setSalaire ( SMIC);
	}
	
	public Employe(String lastName, String firstName, String email, double salaire) {
		super(lastName, firstName, email);
		this.setSalaire ( salaire);
	}
	
	

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " salaire=" + this.salaire;
	}
	
	
	
}
