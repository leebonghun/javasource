import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("��ǰ�� :");
		String name = sc.next();

		System.out.print("���� :");
		int price = sc.nextInt();

		System.out.print("���� :");
		double size = sc.nextDouble();
		
//		��������
//			%s %d %f %b , ���� ���� �Ǽ� �Ҹ�
//			%05d : �ڸ��� ���߱�
//			%.3f : �ݿø� �ؼ� �Ҽ��� ���ڸ� ����
//			%% : %�� ���ڷ� �߷�
		System.out.println("=========================");
		System.out.printf("��ǰ�� :%s\n", name);
		System.out.printf("���� :%05d��\n", price);
		System.out.printf("���� :%.2f kg\n", size);
		double pct = 88.6;
		System.out.printf("%.2f%%\n", pct);
		System.out.printf("[%s]\n[%d��]\n[%.3fkg]",name,price,size);

	}

}
