package lambda;

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";	
		String str2="Hello World!";
		
		Lambda3 obj = (x,y) -> System.out.println(x+y);
		obj.makeString(str1, str2);
		}

}
