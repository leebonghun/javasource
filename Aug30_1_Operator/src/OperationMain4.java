import java.util.Scanner;

public class OperationMain4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int a = 3 << 2; // shift ����
		System.out.println(a);
		
		System.out.print("�̸� :");
		String name = sc.next();
		
		System.out.print("���� :");
		int age = sc.nextInt();
		
		//.equls �� ������ ,�����ڶ�°͵��� stack ������ ���
		String say2 =(name.equals("ȫ�浿"))? "��?��!!!" : "�������";
		System.out.println(say2);
	
		
		// 20�� ������ �ȳ��ϼ��� �̸��̸� ����
		// ���׿��� ���ǽ� ? ������ �� : Ʋ���� ��
		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		
		String oe = (age%2==0) ? "¦" : "Ȧ";
		System.out.println(oe);
	}

}
