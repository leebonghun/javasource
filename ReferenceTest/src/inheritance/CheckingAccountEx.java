package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		// CheckingAccount(String accountNo, int balance, String name,String cardNo)
		CheckingAccount checkingAccount = new CheckingAccount("122-12",200000,"ȫ�浿","122-12-133");
		
		//ī�� ��ȣ �ȸ´� ���
		//System.out.println(checkingAccount.pay("322-12", 20000));
		
		//ī�� ��ȣ �´� ���
		System.out.println("���� �ܾ� "+checkingAccount.pay("122-12-133", 20000));

	}
}
