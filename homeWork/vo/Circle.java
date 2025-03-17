package vo;

public class Circle extends Shape {
	// 반지름
	private double r;
	
	Circle(double r) {
		this.r = r;
	}
	@Override
	double calcArea() {
		return Math.PI * r * r ;
	}

}
