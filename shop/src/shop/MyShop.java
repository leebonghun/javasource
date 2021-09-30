package shop;

import java.util.Scanner;

public class MyShop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private Product carts[] = new Product[10];
	// 장바구니 배열
	private String selUser;

	// 회원정보 배열 -회원 이름, 결제 타입
	private User users[] = new User[2];
	// 상품정보 배열 -상품이름 , 가격 ,
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		products[0] = new CellPhone("Z플립", 1500000, "sk");
		products[1] = new CellPhone("아이폰14", 1500001, "kt");
		products[2] = new SmartTv("lg", 1500002, "4k");
		products[3] = new SmartTv("samsung", 1500003, "3k");
		products[4] = new SmartTv("mac", 1500004, "2k");
	
	}

	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("봉's shop 메인화면");
		System.out.println("====================");
		
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s (%s)\n",i,users[i].getName(),users[i].getPayType());
		}
		System.out.println("[x] 종료");
		System.out.print("선택 : ");
		String select = sc.next();
		
		switch (select) {
		case "x":
			System.out.println("## 종료 ##");
			System.exit(0);
			break;
		default:
			selUser = select;
			productList();
			break;
		}
	}	
	public void productList() {
		System.out.println("MyShop : 상품 목록 - 상품 선택");
		System.out.println("==========================");
		for (int i = 0; i < products.length; i++) {
			
		System.out.printf("[%d]",i);
		products[i].printDetail();
		
	
	}
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		
		System.out.print("선택 :");
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
				System.out.printf("[%d] 제품명 : %s 가격 : %d\n",i,carts[i].getPname(),carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		System.out.println("결제 방법 : "+users[Integer.parseInt(selUser)].getPayType());
		System.out.println("총 가격 : "+total);
		System.out.println("[p] 이전 , [q] 결제 완료");
		System.out.println("선택 : ");
		String input = sc.next();
		
		switch (input) {
		case "p":
			productList();;
			break;
		case "q":
			System.out.println("결제가 완료되었습니다 종료합니다");
			System.exit(0);
		default:
			break;
		}
	}

}
