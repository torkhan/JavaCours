package fr.tork.MethodesAbstraites;

import java.awt.Point;

public class Square extends Shape {
	
	//on d�fini une longueur de cot�
	private double longueur;
	
	
	
	
	public Square() {
		super();
		this.setLongueur( 1 );
	}
	
	

	public Square( Point center, double longueur) {
		super( center );
		this.setLongueur ( longueur );
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	//cacule de la surface l�
	@Override
	public double surface() {
		return this.longueur * this.longueur;
	}
	
	@Override
	public void draw() {
		System.out.println( "Un carr� positionn� en" + this.getCenter() + " et de Longueur" + this.longueur);
	}
	
	
	
}
