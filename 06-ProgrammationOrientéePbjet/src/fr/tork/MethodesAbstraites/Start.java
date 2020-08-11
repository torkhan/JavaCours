package fr.tork.MethodesAbstraites;

import java.awt.Point;
import java.util.ArrayList;



public class Start {

	public static void main(String[] args) {

		java.util.List<Shape> shapes = new ArrayList<>();
		shapes.add( new Circle());
//		shapes.add( new Shape() );// du coup on ne peux plus instancié d objet de class
		//shape car elle est abstraite
		shapes.add( new Square( new Point( 10, 10 ), 2 ) );
		
		for (Shape shape : shapes) {
			System.out.println( shape );
			System.out.println( shape.surface() );//on veux avoir les surfaces des figures
			//mais nous n avons pas d area dans shape
			//suivre les commentaires dans Shape
		}
		
	}

}
