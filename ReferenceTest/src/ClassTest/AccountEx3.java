package ClassTest;

public class AccountEx3 {
//	1) �⺻Ÿ�� 2) ����Ÿ��
//	����Ÿ�� : null�� �ʱ�ȭ�� �ȴ�.
	// -�迭
//	-Ŭ����
//	Ŭ���� -> �빮�ڷ� ����
	public static void main(String[] args) {
		// Account ��ü�� 5���� �����ϰ� �;��
		/*
		 * Account3 account1 = new Account3("122-1",25000,"ȫ�浿"); Account3 account2 =
		 * new Account3("122-2",26000,"��浿"); Account3 account3 = new
		 * Account3("122-3",27000,"��浿"); Account3 account4 = new
		 * Account3("122-4",28000,"�̱浿"); Account3 account5 = new
		 * Account3("122-5",29000,"�ڱ浿");
		 */

		// ������ Ÿ������ ��ü ������ ȿ������ �����Ѵٸ�?
		Account3 accArr[] = new Account3[5];

		accArr[0] = new Account3("122-1", 25000, "ȫ�浿");
		accArr[1] = new Account3("122-1", 25000, "ȫ�浿");
		accArr[2] = new Account3("122-1", 25000, "ȫ�浿");
		accArr[3] = new Account3("122-1", 25000, "ȫ�浿");
		accArr[4] = new Account3("122-1", 25000, "ȫ�浿");

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
			 * account.input(10000); accArr[1].setName("�̺�Ź");
			 * System.out.print(account.getName() + "\t"); System.out.print(account.getNum()
			 * + "\t"); System.out.println(account.getMoney());
			 */
		}

	}

	// �����ε�
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
