import java.util.Scanner;
//

public class ConsoleInputMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("레스토랑 이름을 입력하세요 :");
		String name = sc.nextLine();

		System.out.print("평수를 입력하세요 :");
		double size = sc.nextDouble();

		System.out.print("테이블 개수를 입력하세요 :");
		int table = sc.nextInt();
		
		System.out.print("영업중입니까?");
		boolean open = sc.nextBoolean();
		
		sc.close();
		
		System.out.println("*****************");
		System.out.println(name+"\t\t*");
		System.out.println(size+"\t\t*");
		System.out.println(table+"\t\t*");
		if(open == true) {
			System.out.println("영업중입니다\t*");
		}
		else if(open == false) {
			System.out.println("영업중이지않습니다\t*");
		}
		System.out.println("*****************");
		
	}
}
