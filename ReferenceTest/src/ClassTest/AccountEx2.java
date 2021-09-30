package ClassTest;

public class AccountEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 acc = new Account2("122-01-1313",10000,"ÀÌºÀÈÆ");
		
		/*System.out.printf("°èÁÂ ¹øÈ£ : %s\n",acc.num = "122-01-1313");
		System.out.printf("ÀÜ¾× : %d\n",acc.money = 100000);
		System.out.printf("ÀÌ¸§ : %s\n",acc.name = "ÀÌºÀÈÆ");*/
		acc.setNum("123-222-222");
		acc.setMoney(50000);
		acc.setName("ÀÌºÀºÀ");

		acc.input(20000);
		
		System.out.println("ÇöÀç ÀÜ¾× : "+ acc.output(5000));
		
	}

}
