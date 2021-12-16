package lambda;

public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaTest4 obj = str -> System.out.println(str+"!!");
		obj.showString("Hello");
		
		showMyString(obj);
	}
	public static void showMyString(LambdaTest4 lambda) {
		lambda.showString("¾È³ç");
	}

}
