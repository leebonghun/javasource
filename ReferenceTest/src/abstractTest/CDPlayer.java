package abstractTest;

public class CDPlayer extends Player {


	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println(pos+"부분에서 재생");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("재생 멈춤");
	}

}
