import java.util.Scanner;
//

public class ConsoleInputMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� �̸��� �Է��ϼ��� :");
		String name = sc.nextLine();

		System.out.print("����� �Է��ϼ��� :");
		double size = sc.nextDouble();

		System.out.print("���̺� ������ �Է��ϼ��� :");
		int table = sc.nextInt();
		
		System.out.print("�������Դϱ�?");
		boolean open = sc.nextBoolean();
		
		sc.close();
		
		System.out.println("*****************");
		System.out.println(name+"\t\t*");
		System.out.println(size+"\t\t*");
		System.out.println(table+"\t\t*");
		if(open == true) {
			System.out.println("�������Դϴ�\t*");
		}
		else if(open == false) {
			System.out.println("�����������ʽ��ϴ�\t*");
		}
		System.out.println("*****************");
		
	}
}
