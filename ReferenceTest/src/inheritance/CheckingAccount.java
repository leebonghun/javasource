package inheritance;

public class CheckingAccount extends Account2 {
	// 계좌번호,계좌주,잔액 => 부모
	// 입금하다, 출금하다 => 부모, 

	// 카드번호(111-11-1234)
	private String cardNo;
	
	public CheckingAccount(String accountNo, int balance, String name,String cardNo) {
		super(accountNo, balance, name);
		this.cardNo = cardNo;
	}	
	// 입력값 : 카드번호, 사용금액
	// 반환값 : 정수(int)
	// 카드값을 지불한다.(넘어온 카드번호와 실제 발급된 카드번호가 같은지,
	//     사용금액은 현재 잔액보다 작은지 확인한 후)
	int pay(String cardNo,int amount) {
		
		if(!cardNo.equals(this.cardNo) || getBalance() < amount) {
			System.out.println("카드번호와 사용금액을 확인해 주세요");
			return 0;
		}
		
		// 잔액 = 현재 잔액 - 카드사용액
		//setBalance(getBalance() - amount);
		//부모의 withdraw 가 구현한 기능과 같다
		//따라서 다시 만들지 말고 부모의 withdraw 를 사용하면 됨
		return withdraw(amount);
		
	}
	
	
}












