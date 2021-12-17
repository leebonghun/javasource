package lambda;

import java.util.stream.IntStream;

public class FromIntRangeEx1 {

	static int sum =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100합계 구하기
		//int sum =0;
		IntStream.rangeClosed(1, 100).forEach(s->sum+=s);
		System.out.println(sum);
	}

}
