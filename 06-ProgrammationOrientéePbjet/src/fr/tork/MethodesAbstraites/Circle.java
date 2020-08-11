package fr.tork.MethodesAbstraites;

import java.awt.Point;

public class Circle extends Shape{

	//pour le cercle ime faut son rayon (ou diametre)
	private double rayon;

	public Circle() {
		super();
		this.setRayon( 1 );
	}
	
	
	
	public Circle( Point center, double rayon) {
		super( center );
		this.setRayon ( rayon );
	}
	
	
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		
		this.rayon = Math.abs( rayon );// enl�ve le signe si l on passe un rayon n�gatif
	}
	
	//m�thode de calcul de la surface du cercle (pi r�)
	@Override
	public double surface() {
		return Math.PI * this.rayon * this.rayon;
	}


	@Override
	public void draw() {
		System.out.println( "un cercle position� en " + this.getCenter() + "et de rayon " + this.rayon);
	}
	
	
	
	
	
	
}
