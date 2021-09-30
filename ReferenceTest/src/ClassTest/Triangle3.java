package ClassTest;

public class Triangle3 {
	//삼각형 너비 구하기
	
	private int height;
	private int garo;
	
	Triangle3(){};
	
	Triangle3(int height,int garo){
		this.height = height;
		this.garo = garo;
	}
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	int tri() {
		return garo * height /2;
	}
	
}
