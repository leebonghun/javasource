package Test;

public class Exam1 {

	public static void main(String[] args) {

		while (true) {
			int ran = (int) (Math.random() * 6) + 1;
			int ran2 = (int) (Math.random() * 6) + 1;
			System.out.println("*********************************");
			System.out.println("ù��° �ֻ�����" + ran + "�� ���Խ��ϴ�\t\t*");
			System.out.println("�ι�° �ֻ�����" + ran2 + "�� ���Խ��ϴ�\t\t*");
			System.out.println("*********************************");

			if (ran + ran2 == 5) {
				break;
			}
		}
		System.out.println("***���� 5�� ���� ���α׷��� �����մϴ�***");
	}

}
