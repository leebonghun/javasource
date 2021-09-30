package ClassTest;

public class TvEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv3 tv3[]= new Tv3[3];
		
		tv3[0] = new Tv3("검은색",true, 1);
		tv3[1] = new Tv3("빨간색",true, 2);
		tv3[2] = new Tv3("파란색",true, 3);
		
		tvprint(tv3);
		
	}
	
	static void tvprint(Tv3 tv3[]) {
		for (int i = 0; i < tv3.length; i++) {
			System.out.print(tv3[i].getChannel()+"\t");
			System.out.print(tv3[i].getColor()+"\t");
			System.out.println(tv3[i].isPower());
		}
		
	}
	

}
