import java.util.Scanner;

//		변수 드래그 후 refactor -> Rename 관련 변수 이름 다 바뀜
//		stack -> 프로그램 종료시 자동 반납 -> 수동 반납 불가능
//		heap -> 자동 반납되지 않음 -> 개발자가 수동 반납해야함 java에는 GarbageCollection 기능 , heap영역 자동정리 시스템 
//		없다 - void 
public class VariableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp;//기본형
//		Double temp2 //참조형
		temp = 24.38;
		System.out.println(temp);
		
		float tem;
		tem =(float)24.37; // 형변환 ->(자료형) 값
		System.out.println(tem);
		
		char name;
		name = 'ㅋ';
		System.out.println(name);
		
		String laugh; 
		laugh = "ㅋㅋ";
		System.out.println(laugh);
		
		boolean isHungry;
		isHungry = true;
		System.out.println(isHungry);
		
		boolean isHungry2;
		isHungry2 = false;
		System.out.println(isHungry2);
		
		int age = 25; //지역변수를 만들고 값을 안넣으면 사용이 불가능
		System.out.println(age);
				
		
	}

}
