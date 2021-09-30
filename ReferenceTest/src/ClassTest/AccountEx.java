package ClassTest;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		System.out.printf("°èÁÂ ¹øÈ£ : %s\n",acc.num = "122-01-1313");
		System.out.printf("ÀÜ¾× : %d\n",acc.money = 100000);
		System.out.printf("ÀÌ¸§ : %s\n",acc.name = "ÀÌºÀÈÆ");
		
		acc.input(20000);
		
		System.out.println("ÇöÀç ÀÜ¾× : "+ acc.output(5000));
		
	}

}
