package ClassTest;

public class Account {
	//�Ӽ� : ���� ��ȣ �ܾ� �̸�
	String num;
	int money;
	String name;
	
	void input(int account1) {
		money += account1;
	}//��ȯ�� ������ void
	int output(int account1) {
		if(money>account1) {
		money -= account1;
		}
		return money;
	}//��ȯ�� ������ int,double ��� ���
}
