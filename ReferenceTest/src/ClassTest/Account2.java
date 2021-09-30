package ClassTest;

public class Account2 {
	// 속성 : 계좌 번호 잔액 이름
	private String num;
	private int money;
	private String name;

	public Account2() {
		super();
	}

	public Account2(String num, int money, String name) {
		super();
		this.num = num;
		this.money = money;
		this.name = name;
	}

	public Account2(String num, String name) {
		super();
		this.num = num;
		this.name = name;
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
	}// 반환값 없을땐 void

	int output(int account1) {
		if (money > account1) {
			money -= account1;
		}
		return money;
	}// 반환값 있을땐 int,double 등등 사용
}
