package abstraction;

import java.util.Scanner;

public class MainShapeClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nameOfShape = sc.nextLine();
		double value = sc.nextDouble();
		GeometricShapes circle = new Circle(nameOfShape,value);
		System.out.println(circle.toString());
		sc.nextLine();
		nameOfShape = sc.nextLine();
		value = sc.nextDouble();
		GeometricShapes square = new Square(nameOfShape,value);
		System.out.println(square.toString());
	}

}
