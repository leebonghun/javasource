package ClassTest;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		System.out.printf("���� ��ȣ : %s\n",acc.num = "122-01-1313");
		System.out.printf("�ܾ� : %d\n",acc.money = 100000);
		System.out.printf("�̸� : %s\n",acc.name = "�̺���");
		
		acc.input(20000);
		
		System.out.println("���� �ܾ� : "+ acc.output(5000));
		
	}

}
