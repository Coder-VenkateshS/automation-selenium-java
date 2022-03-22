package abstraction;

public abstract class GeometricShapes {
	
	String nameOfShape;
	
	abstract double calculateArea();
	public abstract String toString();
	public GeometricShapes(String nameOfShape) {
		this.nameOfShape = nameOfShape;
	}
	
	public String getNameOfShape() {
		return nameOfShape;
	}
	
	
}
