package inheritance;

public class CreditLineAccountEx {
	public static void main(String[] args) {
		CreditLineAccount credit = new CreditLineAccount("122-12", 10000, "ȫ�浿", 1000000);
		
		//System.out.println(credit.withdraw(1500000)); // ���ݾ� �ѵ� �ʰ�
		System.out.println(credit.withdraw(800000)); // -790000

	}
}
