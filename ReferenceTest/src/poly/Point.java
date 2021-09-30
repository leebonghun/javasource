package poly;

public class Point {
	int x;
	int y;

	String getXY() {
		return "(" + x + "," + y + ")";
	}

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
