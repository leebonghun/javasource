package shop;

import java.util.Scanner;

public class MyShop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private Product carts[] = new Product[10];
	// ��ٱ��� �迭
	private String selUser;

	// ȸ������ �迭 -ȸ�� �̸�, ���� Ÿ��
	private User users[] = new User[2];
	// ��ǰ���� �迭 -��ǰ�̸� , ���� ,
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		products[0] = new CellPhone("Z�ø�", 1500000, "sk");
		products[1] = new CellPhone("������14", 1500001, "kt");
		products[2] = new SmartTv("lg", 1500002, "4k");
		products[3] = new SmartTv("samsung", 1500003, "3k");
		products[4] = new SmartTv("mac", 1500004, "2k");
	
	}

	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��'s shop ����ȭ��");
		System.out.println("====================");
		
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s (%s)\n",i,users[i].getName(),users[i].getPayType());
		}
		System.out.println("[x] ����");
		System.out.print("���� : ");
		String select = sc.next();
		
		switch (select) {
		case "x":
			System.out.println("## ���� ##");
			System.exit(0);
			break;
		default:
			selUser = select;
			productList();
			break;
		}
	}	
	public void productList() {
		System.out.println("MyShop : ��ǰ ��� - ��ǰ ����");
		System.out.println("==========================");
		for (int i = 0; i < products.length; i++) {
			
		System.out.printf("[%d]",i);
		products[i].printDetail();
		
	
	}
		
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		
		System.out.print("���� :");
		String select1 = sc.next();
		
		switch (select1) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
		default:
			for (int i = 0; i < carts.length; i++) {
				if(carts[i]==null) {
					carts[i]= products[Integer.parseInt(select1)]; 
					break;
				}
			}
			productList();
			break;
		}
}
	public void checkOut() {
		int total=0;
		System.out.println("==============================");
		for (int i = 0; i < carts.length; i++) {
			if(carts[i]!=null) {
				System.out.printf("[%d] ��ǰ�� : %s ���� : %d\n",i,carts[i].getPname(),carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		System.out.println("���� ��� : "+users[Integer.parseInt(selUser)].getPayType());
		System.out.println("�� ���� : "+total);
		System.out.println("[p] ���� , [q] ���� �Ϸ�");
		System.out.println("���� : ");
		String input = sc.next();
		
		switch (input) {
		case "p":
			productList();;
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ� �����մϴ�");
			System.exit(0);
		default:
			break;
		}
	}

}
