import java.util.Scanner;

public class OperatorMain3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� :");
		double garo = sc.nextDouble();
		System.out.print("���� :");
		double sero = sc.nextDouble();
		System.out.print("���� :");
		double height = sc.nextDouble();
		System.out.print("���� :");
		double kg = sc.nextDouble();
		
		System.out.println("====================");
		
		double bupi = garo * sero * height;
		System.out.println("���� :"+bupi);
		System.out.println("���� :"+kg);
		
		//and ���� Ȯ�������� �����ɾ���
		boolean a = (bupi>=10 && kg>=1000); 
		System.out.println(a);
		//or ������ Ȯ�������� ������ �տ� ����.
		boolean b = (bupi<10 || kg<1000);
		System.out.println(b);
		
		boolean c = (20<=kg && 30<=kg);
		System.out.println(c);
	}
}
