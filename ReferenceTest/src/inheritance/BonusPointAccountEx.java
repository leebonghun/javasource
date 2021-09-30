package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusPointAccount bonus = new BonusPointAccount("122-12", 10000, "홍길동",100);
		
		bonus.deposit(100000);
		System.out.println("현재 잔액 : "+bonus.getBalance());
		System.out.println("현재 보너스 포인트 : "+bonus.getBounsPoint());
		
	}

}
