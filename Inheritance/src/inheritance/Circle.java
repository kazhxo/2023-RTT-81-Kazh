package inheritance;

public class Circle extends Shape {

	private double diameter;
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// this functionality is only for a circle
	// because a rectangle does not have a radius
	// or a diameter
	public double getRadius() {
		return diameter / 2;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public double calculateArea() {
		
		return 3.14159 * getDiameter() * getDiameter();
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14159* getRadius();
	}
	

}
