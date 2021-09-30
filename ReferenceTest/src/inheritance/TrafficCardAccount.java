package inheritance;

// Account2
// CheckingAccount

public class TrafficCardAccount extends CheckingAccount{
// CheckingAccount => 계좌번호,계좌주,잔액, 카드번호, 	
// CheckingAccount => 입금하다, 출금하다, 체크카드 결제
	
	
	// 교통카드 기능여부 
	private boolean hasTrafficCard;  
	
	public TrafficCardAccount(String accountNo, int balance, String name, 
			 String cardNo, boolean hasTrafficCard) {
		super(accountNo, balance, name, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	
	// 교통카드 기능이 있다면 교통비 지불한다.
	// 입력값 : 카드번호, 교통비 사용액
	// 반환값 : 정수
	int payTrafficCard(String cardNo,int amount) {
		if(!hasTrafficCard) { // hasTrafficCard != true
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}
		return pay(cardNo, amount);		
	}

}









