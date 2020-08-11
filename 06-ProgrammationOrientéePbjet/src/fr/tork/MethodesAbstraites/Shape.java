package fr.tork.MethodesAbstraites;

import java.awt.Point;

public abstract class Shape {
	
	//nous avons ici la classe m�re qui reprends toutes les formes (cercle, carr�..)
	//que l on vas d�finir ensuite
	
	//on part duprincipe que toutes les formes que l on vas travailler
	//ici sont rep�sent�es par leur centre de gravit�
	//on cr�e un attribut de type Point
	
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
	
	public abstract double surface();//�a ne compile pas, il nous propose de passer cette
	// methode en abstract => ok mais �a ne compile tjrs pas car  il nous demande
	// d abstract la class Shape
	public abstract void draw();
	

}
