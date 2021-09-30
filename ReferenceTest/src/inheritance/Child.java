package inheritance;

// 확장
//  extends 부모클래스명
//  생성자와 초기화 블럭은 상속되지 않음
//  private 멤버변수는 접근이 제한됨

public class Child extends Parent {

	public Child(int age) {
		super(age);		//Parent의 int 를 받는 생성자 호출
	}
	//Implicit super constructor Parent() is undefined for default constructor. 
	//Must define an explicit constructor
		
	//	public Child() {
	//		super(); //Parent 기본 생성자 호출
	//	}
	
	void play() {
		System.out.println("놀자!!!!");
	}
	
	@Override
	public void print() {
		System.out.println("안녕하세요");
	}	
	
}























