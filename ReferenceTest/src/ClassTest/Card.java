package ClassTest;

public class Card {
	//멤버 변수
	private String kind; // 카드 모양 지정
	private int number; // 카드 숫자 지정
	//클래스 변수
	static int width = 10;//같은 값을 쓸때. ex) 카드 가로 세로 길이
	static int height = 7;
	//static(정적) : 클래스에 고정된 멤버
	//              객체를 생성하지 않고 사용
	//				클래스가 메모리에 로드될 때 생성 
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	//static(정적) 메소드 : 객체를 생성하지 않고 사용
	//					클래스가 메모리에 로드될 때 생성
    //					static 메서드 안에서 인스턴스 멤버 사용불가 this사용불가
	public static int getWidth() {
		return width;
	}
	public static int getHeight() {
		return height;
	}
	
	//static이 사용되는 곳 : 멤버변수, 메서드, 초기화블럭
	
}
