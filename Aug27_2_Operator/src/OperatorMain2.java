import java.util.Scanner;

public class OperatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Ű :");
		double height = sc.nextDouble();

		System.out.print("���� :");
		int age = sc.nextInt();

		System.out.println("===================");
		System.out.printf("Ű %.1fcm , ���� %d��\n", height, age);
//		��������
//		!= �ٸ��� 
//		== ����
//		�����տ�����
//		&& -> and		|| -> or		! -> not

//		Ű�� 150cm �ʰ��� true �̸��� �� false
		boolean a = height > 150; // ��ȣ ���� �� �򰥸�������.
		System.out.println(a);

//		���̰� 10�� ���Ͻ� true 10�� �ʰ��� false
		boolean b = age <= 10; // ��ȣ ���� �� �򰥸�������.
		System.out.println(b);

//		���̰� 5�� �̻��̰�, Ű�� 2m�̻�
		boolean c = (age >= 5 && height >= 200);
		System.out.println(c);

//		Ű�� 2m �̻��̰ų�, ���̰� 5�� �̻�
		boolean d = (height >= 200 || age >= 5);
		System.out.println(d);

//		d�� true�� e�� false , d�� false�� e�� true
		boolean e = !d;
		System.out.println(e);
	}

}
