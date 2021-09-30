package ClassTest;

public class AccountEx3 {
//	1) 기본타입 2) 참조타입
//	참조타입 : null로 초기화가 된다.
	// -배열
//	-클래스
//	클래스 -> 대문자로 시작
	public static void main(String[] args) {
		// Account 객체를 5개를 생성하고 싶어요
		/*
		 * Account3 account1 = new Account3("122-1",25000,"홍길동"); Account3 account2 =
		 * new Account3("122-2",26000,"장길동"); Account3 account3 = new
		 * Account3("122-3",27000,"김길동"); Account3 account4 = new
		 * Account3("122-4",28000,"이길동"); Account3 account5 = new
		 * Account3("122-5",29000,"박길동");
		 */

		// 동일한 타입으로 객체 생성시 효율성을 적용한다면?
		Account3 accArr[] = new Account3[5];

		accArr[0] = new Account3("122-1", 25000, "홍길동");
		accArr[1] = new Account3("122-1", 25000, "홍길동");
		accArr[2] = new Account3("122-1", 25000, "홍길동");
		accArr[3] = new Account3("122-1", 25000, "홍길동");
		accArr[4] = new Account3("122-1", 25000, "홍길동");

		// int arr[] = new int[5];
		for (int i = 0; i < accArr.length; i++) {
			accountPrint(accArr);
			System.out.print(accArr[i].getName() + "\t");
			System.out.print(accArr[i].getNum() + "\t");
			System.out.println(accArr[i].getMoney());
		}

		for (int i = 0; i < accArr.length; i++) {

			Account3 account = accArr[i];
			accountPrint(account);

			/*
			 * account.input(10000); accArr[1].setName("이봉탁");
			 * System.out.print(account.getName() + "\t"); System.out.print(account.getNum()
			 * + "\t"); System.out.println(account.getMoney());
			 */
		}

	}

	// 오버로딩
	static void accountPrint(Account3 accArr[]) {

		for (int i = 0; i < accArr.length; i++) {

			System.out.print(accArr[i].getName() + "\t");
			System.out.print(accArr[i].getNum() + "\t");
			System.out.println(accArr[i].getMoney());
		}
	}

	static void accountPrint(Account3 account) {

		System.out.print(account.getName() + "\t");
		System.out.print(account.getNum() + "\t");
		System.out.println(account.getMoney());

	}

}
