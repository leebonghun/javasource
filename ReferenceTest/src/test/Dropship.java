package test;


public class Dropship extends Unit {
	
	void load() {}
	void upload() {}
	
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("%d %d 지점으로 이동",x,y);
	}
}
