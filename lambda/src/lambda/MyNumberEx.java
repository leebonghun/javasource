package lambda;

public class MyNumberEx {

	public static void main(String[] args) {
		MyNumber number = (x,y) -> (x >= y) ? x : y;
		System.out.println(number.max(10, 20));
			
			
		
	}

}
