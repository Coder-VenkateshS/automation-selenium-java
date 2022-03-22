package abstraction;

public class Square extends GeometricShapes {

	double length;
	
	public Square(String nameOfShape,double length) {
		super(nameOfShape);
		this.length = length;
	}

	@Override
	double calculateArea() {
		return length * length;
	}

	@Override
	public String toString() {
		return "Name of the Shape" + super.nameOfShape + "it's area is "+ calculateArea();
	}
}
