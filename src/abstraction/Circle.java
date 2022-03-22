package abstraction;

public class Circle extends GeometricShapes{

	double radius;
	
	public Circle(String nameOfShape,double radius) {
		super(nameOfShape);
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Name of the Shape" + super.nameOfShape + "it's area is "+ calculateArea();
	}

}
