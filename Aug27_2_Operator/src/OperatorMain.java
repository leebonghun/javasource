import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		System.out.printf("x : %d y : %d\n", x, y);
//		��� ������ -> +,-,*,/,%
		int a = x + y;
		int b = x - y;
		int c = x * y;
		double d = (double) x / y;// ���߿� �ϳ��� �Ǽ������� ������Ѵ�.
		String laugh = "��";
		String e = x + laugh;
		String bb = "����" + b;// string + ���� = string���� �������� �ٿ����� ��µ�
		int f = x % y; // %�� ������
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(bb);
		System.out.println(f);
//������ ������(���Կ����� + ���������)
//		+=
//		-=
//		*=
//		/=
//		%=
		x += 5;//x=x+5�� �Ȱ���     =�� �� ��������
		System.out.println(x);
		y -= 3;//y=y-3�� �Ȱ���     =�� �� ��������
		System.out.println(y);
//		����������
//		++
//		--
//		x++ <=> x=x+1
	}
}
