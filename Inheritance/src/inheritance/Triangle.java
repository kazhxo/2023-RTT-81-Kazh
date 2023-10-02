package inheritance;

public class Triangle extends Shape {
	private double base;
	private double height;
	private double side1;
	private double side2;
	private double side3;
	
	
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return 1/2*base*height;
	}
	@Override
	public double perimeter() {
		return side1+side2+side3;
	} 
	
	

}
