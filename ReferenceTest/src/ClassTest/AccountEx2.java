package ClassTest;

public class AccountEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 acc = new Account2("122-01-1313",10000,"�̺���");
		
		/*System.out.printf("���� ��ȣ : %s\n",acc.num = "122-01-1313");
		System.out.printf("�ܾ� : %d\n",acc.money = 100000);
		System.out.printf("�̸� : %s\n",acc.name = "�̺���");*/
		acc.setNum("123-222-222");
		acc.setMoney(50000);
		acc.setName("�̺���");

		acc.input(20000);
		
		System.out.println("���� �ܾ� : "+ acc.output(5000));
		
	}

}
