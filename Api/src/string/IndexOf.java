package string;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 프로그래밍";
		
		int index = str1.indexOf("프로그래밍");
		System.out.println(index);
		
		String str2 = "Hellohellohello world";
		System.out.println(str2.indexOf(65));//못찾으면 -1이 출력된다.
		System.out.println(str2.indexOf("el",2));//el을 두번째 위치부터 찾으라는 뜻
		
		//그가 들어있는지 확인
		
		
		System.out.println(str1.indexOf("그")); //그가 있으면 출력 그가 없으면 -1출력
		
	}

}
