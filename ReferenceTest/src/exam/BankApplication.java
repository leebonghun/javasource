package exam;

import java.util.Scanner;

public class BankApplication {
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==========================================");
			System.out.println("|   1.���»��� 2.���¸�� 3.���� 4.��� 5.����         |");
			System.out.println("==========================================");
			System.out.print("���� >");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("==========================");
		System.out.println("\t���� ����\t");
		System.out.println("==========================");

		System.out.print("���¹�ȣ :");
		String ano = scanner.next();
		System.out.print("������ :");
		String owner = scanner.next();
		System.out.print("�ʱ��Ա޾� :");
		int money = scanner.nextInt();

		Account newAccount = new Account(ano, owner, money);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				break;
			}
		}
		System.out.println("���°� �����Ǿ����ϴ�.");

	}

	private static void accountList() {
		System.out.println("==========================");
		System.out.println("\t���� ���\t");
		System.out.println("==========================");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s %s %d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getMoney());
			}
		}
	}

	private static void deposit() {
		System.out.println("==========================");
		System.out.println("\t���� �ϱ�\t");
		System.out.println("==========================");

		System.out.print("���¹�ȣ :");
		String ano = scanner.next();

		System.out.print("���� �� :");
		int money = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("���°� ���������ʽ��ϴ�");
		}
		account.setMoney(account.getMoney() + money);
		System.out.println("������ �Ϸ�Ǿ����ϴ�");

	}

	private static void withdraw() {
		System.out.println("==========================");
		System.out.println("\t��� �ϱ�\t");
		System.out.println("==========================");

		System.out.print("���¹�ȣ :");
		String ano = scanner.next();

		System.out.print("��� �� :");
		int money = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("���°� ���������ʽ��ϴ�");
		}
		if(account.getMoney()>=money) {
		account.setMoney(account.getMoney() - money);
		System.out.println("����� �Ϸ�Ǿ����ϴ�");}
		else if(account.getMoney()<money) {
			System.out.println("��ݾ��� �� �����ϴ� �ٽ� Ȯ�����ּ���");
		}
	}

	private static Account findAccount(String ano) {
		Account account =null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if(ano.equals(accountArray[i].getAno()))
				account = accountArray[i];
				break;
			}
		}
		return account;
	}
}
