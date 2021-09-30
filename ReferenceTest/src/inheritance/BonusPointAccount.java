package inheritance;

public class BonusPointAccount extends Account2{
	
	int bonusPoint;
	public BonusPointAccount(String accountNo, int balance, String name) {
		super(accountNo, balance, name);
		this.bonusPoint = bonusPoint;
		// TODO Auto-generated constructor stub
	}
	
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += amount*0.001;
	}
	public int getBounsPoint() {
		return bonusPoint;
	}
}
