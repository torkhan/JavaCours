package fr.tork.agenda;

public class Personne {
	
	private String lastName;
	private String firstName;
	private String email;
	
	public Personne() {
		this( "Doe", "John", "toto@tata.fr");
	}
	
	public Personne(String lastName, String firstName, String email) {
	
		this.setLastName ( lastName );
		this.setFirstName ( firstName );
		this.setEmail ( email );
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if ( lastName == null || lastName.trim().equals( "")) {
			throw new RuntimeException( "last name cannot be null");
			//cette exception sera retravaillée
		}
		this.lastName = lastName.trim().toUpperCase();		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if ( firstName == null || firstName.trim().equals( "")) {
			throw new RuntimeException( "first name cannot be null");
			//cette exception sera retravaillée
		}
		this.firstName = firstName.trim().toLowerCase();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email == null || !email.matches( "^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]{2,}\\.[a-zA-Z]{2,4}$" )) {
			throw new RuntimeException( "bad email");
		}
		this.email = email;
	}
	
	@Override
	public String toString() {
		return lastName  + " " +  firstName + " " +  email;
	}
	
	

}
