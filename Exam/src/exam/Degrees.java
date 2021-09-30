package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("È­¾¾¿Âµµ : ");
		int de = sc.nextInt();
		
		double de1 = (de-32)*5/9;
		
		System.out.println(de1);
	}

}
