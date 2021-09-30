package ClassTest;

public class Triangle2 {
	//삼각형 너비 구하기
	
	private int height;
	private int garo;
	
	Triangle2(){};
	
	Triangle2(int height,int garo){
		this.height = height;
		this.garo = garo;
	}
	
	
	int tri() {
		return height * garo /2;
	}
	static void tvprint(Tv3 tv3[]) {
		for (int i = 0; i < tv3.length; i++) {
			System.out.print(tv3[i].getChannel()+"\t");
			System.out.print(tv3[i].getColor()+"\t");
			System.out.println(tv3[i].isPower());
		}
		
	}
	
}
