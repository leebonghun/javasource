package inheritance;

// ���¹�ȣ,������,�ܾ�,���̳ʽ��ѵ� / �Ա��ϴ�, ����ϴ�
public class CreditLineAccount extends Account2{
	private int creditLine; //���̳ʽ� �ѵ�

	public CreditLineAccount(String accountNo, int balance, String name,int creditLine) {
		super(accountNo, balance, name);
		this.creditLine = creditLine;
	}
	
	// ����ϴ� �������̵�
	// �θ��� ��� :  �ܾ� = �ܾ� - ��ݾ�
	// �ڽ� : �ܾ�(�����ܾ� + ���̳ʽ� �ѵ�) - ��ݾ�
	@Override
	int withdraw(int amount) {
		// �����ܾ�+���̳ʽ��ѵ��ʵ庸�� ���ݾ��� ������ ����Ұ� �޼��� ���,0�� ����
		if(getBalance()+creditLine < amount) {
			System.out.println("���ݾ� �ѵ� �ʰ�");
			return 0;
		}
		// �ܾ�(�����ܾ� + ���̳ʽ� �ѵ�) - ��ݾ�
		setBalance(getBalance() - amount);
		
		return getBalance();
	}

}









