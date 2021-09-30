package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		// CheckingAccount(String accountNo, int balance, String name,String cardNo)
		CheckingAccount checkingAccount = new CheckingAccount("122-12",200000,"홍길동","122-12-133");
		
		//카드 번호 안맞는 경우
		//System.out.println(checkingAccount.pay("322-12", 20000));
		
		//카드 번호 맞는 경우
		System.out.println("현재 잔액 "+checkingAccount.pay("122-12-133", 20000));

	}
}
