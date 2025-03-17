package vo;

public class Rectangle extends Shape {
	private double width;
	private double heihgt;
	public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
	}
	@Override
	public double calcArea() {
		return this.width * this.height;
	}
	public boolean isSquare() {
		return this.width * this.height != 0 && this.width;
	}

}
