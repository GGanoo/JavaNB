package vo;

public abstract class Shape {
	protected Point p;
	Shape() {
		this(new Point(0, 0));
	}
	Shape(Point p) {
		this.p = p;
	}
	
	// 도형의 면적을 계산해서 반환하는 메서드
	abstract double calcArea();
	
	Point getPosition() {
		return this.p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}
