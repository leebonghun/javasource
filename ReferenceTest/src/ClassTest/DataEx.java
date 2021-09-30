package ClassTest;

public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		System.out.println(data);
		/*data.x = 10;
		change(data.x);//   (1). data.x = 10을 그대로 change 문에 10으로 보냄 
		System.out.println(data.x); // (3) 메소드가 끝나고 다시올라오면 여전히 x = 10 */
		
		System.out.println();
		change(data.x);
		System.out.println(data.x);
	}
	static void change(int x) { // (2)10이 그대로 내려와서 이 메소드안에서 10 ->10000으로 변경
		
		x = 10000;	
		System.out.println(x);
	}
	//heap 안에 들어있는 x=10을  변경한게아니라 ,x를 그냥 초기화시킨것
	
	static void change(Data d) {
		
		System.out.println(d);
		d.x=10000;
	}
}
