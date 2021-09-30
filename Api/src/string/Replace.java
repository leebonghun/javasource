package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr1 = "자바는 객체지향 언어입니다. 자바는 풍부한 api를 제공합니다";
		
		sr1=sr1.replaceAll("니", "ㅇ");//변경한 것을 다시 담아줘야한다.
		System.out.println(sr1);
	}

}
