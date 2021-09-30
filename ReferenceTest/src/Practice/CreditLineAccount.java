package Practice;

public class CreditLineAccount extends Account2 {

	public CreditLineAccount(String accountNo, int balance, String name) {
		super(accountNo, balance, name);
		// TODO Auto-generated constructor stub
	}
//계좌번호 , 계좌주, 잔액 , 마이너스 한도 / 입금하다, 출금하다

//출금하다 오버라이딩
//부모의 기능 : 잔액 = 잔액 - 출금액
//자식 : 잔액(현재잔액 + 마이너스 한도)-출금액

}
