package math;

import static java.lang.Math.*;
//java lang 패키지는 기본적으로 import 가 되어 잇음.
public class MathEx3 {
//하나의 클래스에 모든 메소드가 static 메소드로 구성되어 있다면 
//import static 만들어서 사용 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 90.7552;
		System.out.println("round()" + round(val));// 반올림 math를 뺄수있음
		System.out.println("ceil()" + ceil(1.1));// 올림
		System.out.println("floor()" + floor(1.5));// 버림
		System.out.println("Max()" + Math.max(1.5, 1.2));// 최대값
		System.out.println("Min()" + Math.min(1.5, 1.2));// 최소값

	}

}
