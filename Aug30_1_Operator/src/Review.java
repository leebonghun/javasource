import java.util.Scanner;

//�� ������
public class Review {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("***�񸸵� �˻�***");

		System.out.print("�̸� :");
		String name = sc.next();

		System.out.print("Ű :");
		double height = sc.nextDouble();

		System.out.print("������ :");
		double weight = sc.nextDouble();

		System.out.println("===================");

		double avg = (height - 100) * 0.9;
		double biman = (weight / avg) * 100;
		String say = (biman > 120) ? "��" : "����";


		System.out.printf("ǥ��ü�� : %.2f\n", avg);
		System.out.printf("�񸸵� : %.2f%%\n", biman);
		System.out.printf("%s ���� %s �Դϴ�", name, say);
		
		Thread.sleep(5000);
	}

}
