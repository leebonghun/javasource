package Array;

public class ArrayTest8 {

	public static void main(String[] args) {
		//Ä«µå 45Àå
		int card[] = new int[45];
		int sum=1;
		for (int i = 0; i < card.length; i++) {
		card[i] = i+1;
		}
		for(int no:card) {
			System.out.println(no);
		}
		for (int i = 0; i < card.length; i++) {
			int pos = (int)(Math.random()*45);
			int temp = card[i];
			card[i] = card[pos];
			card[pos] = card[i];
		}
		System.out.println();
		for(int no:card) {
			System.out.println(no+" ");
		}
		
	}

}
