package fr.tork.MethodesAbstraites;

import java.awt.Point;

public abstract class Shape {
	
	//nous avons ici la classe mère qui reprends toutes les formes (cercle, carré..)
	//que l on vas définir ensuite
	
	//on part duprincipe que toutes les formes que l on vas travailler
	//ici sont repésentées par leur centre de gravité
	//on crée un attribut de type Point
	
	private Point center;
	
	
	public Shape () {
		this ( new Point( 0,0 ));
	}

	public Shape(Point center) {
		super();
		this.setCenter ( center);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		if ( center == null) throw new NullPointerException( "Center can not be null");

		this.center = center;
	}
	
	public abstract double surface();//ça ne compile pas, il nous propose de passer cette
	// methode en abstract => ok mais ça ne compile tjrs pas car  il nous demande
	// d abstract la class Shape
	public abstract void draw();
	

}
