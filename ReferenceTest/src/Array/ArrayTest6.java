package Array;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = new int[2][3];
		
		score[0][0] = 15;
		score[0][1] = 15;
		score[0][2] = 15;
		
		score[1][0] = 15;
		score[1][1] = 15;
		score[1][2] = 15;
		
		System.out.println(score[0].length);//¿­
		
		for (int i = 0; i < score.length; i++) {	
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]);
			}
			System.out.println();
		}
		for(int score1[] : score) {
			for(int score2 : score1) {
				System.out.println(score2);
			}
			System.out.println();
		}
		int arr[][]= {{15,25},{65,85,95}};
		
		for(int i[]:arr) {
			for (int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	
	}

}
