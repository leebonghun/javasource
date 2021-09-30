package exam;

import java.util.Random;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int random = (int)((Math.random()*6)+1);//0~5 + 1 = 1~6
		
		switch (random) {
		case 1:
			System.out.println("1¹ø ³ª¿È");
			break;
		case 2:
			System.out.println("2¹ø ³ª¿È");
			break;
		case 3:
			System.out.println("3¹ø ³ª¿È");
			break;
		case 4:
			System.out.println("4¹ø ³ª¿È");
			break;
		case 5:
			System.out.println("5¹ø ³ª¿È");
			break;
		case 6:
			System.out.println("6¹ø ³ª¿È");
			break;
		default:
			break;
		}
	}

}
