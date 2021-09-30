package exam;

public class Account {
	private String ano;
	private String owner;
	private int money;

	public Account(String num, String owner, int money) {
		super();
		this.ano = num;
		this.owner = owner;
		this.money = money;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


}
