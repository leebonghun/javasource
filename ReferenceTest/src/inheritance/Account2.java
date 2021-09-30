package inheritance;

public class Account2 {
	//속성 : 계좌번호(122-01-12222),잔액,이름
	private String accountNo; 
	private int balance;
	private String name;
	
//	public Account2() {
//		super();
//	}	
	public Account2(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}	
//	public Account2(String accountNo, String name) {
//		super();
//		this.accountNo = accountNo;
//		this.name = name;
//	}
	
	public int getBalance() {
		return balance;
	}	

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}


	//기능 : 입금한다.(입력값 : 입금액, 반환값:없음) => 현재잔액 += 입금액
	void deposit(int amount) {
		balance += amount;
	}
	//출금한다.(입력값 : 출금액, 반환값:현재잔액) => 현재잔액 -= 출금액
	int withdraw(int amount) {
		if(balance > amount) {
			balance -= amount;			
		}
		return balance;
	}
}








