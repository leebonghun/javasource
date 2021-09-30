package ClassTest;

public class TriangleEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Triangle3 tri[]= new Triangle3[5];
	
	tri[0] = new Triangle3(3,5);
	tri[1] = new Triangle3(4,5);
	tri[2] = new Triangle3(5,5);
	tri[3] = new Triangle3(6,5);
	tri[4] = new Triangle3(7,5);
	
	printArr(tri);
		
	}
	static void printArr(Triangle3 tri[]) {
		for (int i = 0; i < tri.length; i++) {
			System.out.println(tri[i].tri());
		}
	}

}
