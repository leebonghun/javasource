package test;

public class Tank extends Unit {

	void changeMode() {}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("%d %d �������� �̵�",x,y);
	}
}
