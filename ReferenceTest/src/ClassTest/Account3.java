package ClassTest;

public class Account3 {
	// �Ӽ� : ���� ��ȣ �ܾ� �̸�
	private String num;
	private int money;
	private String name;

	public Account3() {
		super();
	}

	public Account3(String num, int money, String name) {
		super();
		this.num = num;
		this.money = money;
		this.name = name;
	}
	
	

	public Account3(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	

	public String getNum() {
		return num;
	}

	public int getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	void input(int account1) {
		money += account1;
	}// ��ȯ�� ������ void

	int output(int account1) {
		if (money > account1) {
			money -= account1;
		}
		return money;
	}// ��ȯ�� ������ int,double ��� ���
}
