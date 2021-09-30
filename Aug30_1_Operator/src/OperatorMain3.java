import java.util.Scanner;

public class OperatorMain3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("가로 :");
		double garo = sc.nextDouble();
		System.out.print("세로 :");
		double sero = sc.nextDouble();
		System.out.print("높이 :");
		double height = sc.nextDouble();
		System.out.print("무게 :");
		double kg = sc.nextDouble();
		
		System.out.println("====================");
		
		double bupi = garo * sero * height;
		System.out.println("부피 :"+bupi);
		System.out.println("무게 :"+kg);
		
		//and 쓸때 확률적으로 낮은걸쓴다
		boolean a = (bupi>=10 && kg>=1000); 
		System.out.println(a);
		//or 쓸떄는 확률적으로 높은걸 앞에 쓴다.
		boolean b = (bupi<10 || kg<1000);
		System.out.println(b);
		
		boolean c = (20<=kg && 30<=kg);
		System.out.println(c);
	}
}
