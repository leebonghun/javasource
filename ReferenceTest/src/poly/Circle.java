package poly;

public class Circle extends Shape {
	Point center;//원의 중심좌표
	int r;//반지름
	
	public Circle() {
		this(new Point(0, 0), 100);
	}
	
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}

	@Override
	void draw() {
		System.out.printf("[center=(%d,%d),r=%d, color=%s]\n",center.x,center.y,r,color);
	}	
	
}
