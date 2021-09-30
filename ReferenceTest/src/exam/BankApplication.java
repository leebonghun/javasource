package exam;

import java.util.Scanner;

public class BankApplication {
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==========================================");
			System.out.println("|   1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료         |");
			System.out.println("==========================================");
			System.out.print("선택 >");

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
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("==========================");
		System.out.println("\t계좌 생성\t");
		System.out.println("==========================");

		System.out.print("계좌번호 :");
		String ano = scanner.next();
		System.out.print("계좌주 :");
		String owner = scanner.next();
		System.out.print("초기입급액 :");
		int money = scanner.nextInt();

		Account newAccount = new Account(ano, owner, money);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");

	}

	private static void accountList() {
		System.out.println("==========================");
		System.out.println("\t계좌 목록\t");
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
		System.out.println("\t예금 하기\t");
		System.out.println("==========================");

		System.out.print("계좌번호 :");
		String ano = scanner.next();

		System.out.print("예금 액 :");
		int money = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("계좌가 존재하지않습니다");
		}
		account.setMoney(account.getMoney() + money);
		System.out.println("예금이 완료되었습니다");

	}

	private static void withdraw() {
		System.out.println("==========================");
		System.out.println("\t출금 하기\t");
		System.out.println("==========================");

		System.out.print("계좌번호 :");
		String ano = scanner.next();

		System.out.print("출금 액 :");
		int money = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("계좌가 존재하지않습니다");
		}
		if(account.getMoney()>=money) {
		account.setMoney(account.getMoney() - money);
		System.out.println("출금이 완료되었습니다");}
		else if(account.getMoney()<money) {
			System.out.println("출금액이 더 많습니다 다시 확인해주세요");
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
