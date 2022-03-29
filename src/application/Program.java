package application;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		AbstractShape as1 = new Circle(Color.BLACK, 2.0);
		AbstractShape as2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Circle Color: " + as1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", as1.area()));
		System.out.println("Rectangle Color: " + as2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", as2.area()));

	}

}
