package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusPointAccount bonus = new BonusPointAccount("122-12", 10000, "ȫ�浿",100);
		
		bonus.deposit(100000);
		System.out.println("���� �ܾ� : "+bonus.getBalance());
		System.out.println("���� ���ʽ� ����Ʈ : "+bonus.getBounsPoint());
		
	}

}
