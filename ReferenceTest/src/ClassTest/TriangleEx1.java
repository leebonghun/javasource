package ClassTest;

public class TriangleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle();
		
		obj.garo = 30;
		obj.height = 5;
		
		System.out.println(obj.tri());
		
		Triangle obj2 = new Triangle();
		
		obj.garo = 40;
		obj.height = 5;
		
		System.out.println(obj.tri());
	}

}
