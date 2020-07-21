package fr.tork.agenda;

public class Client extends Personne {
	
	private int idClient;

	

	public Client(int idClient) {
		super();
		this.setIdClient ( 0 );
	}
	
	public Client(String lastName, String firstName, String email, int idClient) {
		super(lastName, firstName, email);
		this.setIdClient ( idClient);
	}
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " ID=" + this.idClient;
	}

}
