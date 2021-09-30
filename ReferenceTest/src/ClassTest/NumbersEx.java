package ClassTest;

public class NumbersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 6, 6, 7, 8, 9 };
		
		Numbers numbers = new Numbers(num);
		
		System.out.println(numbers.plus());
		
		System.out.println(numbers.getAverage());
		
	}

}

