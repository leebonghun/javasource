package Array;

public class ArrayTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
					{50,60,50}};
		
		
		int result[][] = new int[score.length+1][score[0].length+1];
		//¿­°ú ÇàÀ» ÇÑÄ­¾¿ ´Ã·È¾î
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j]= score[i][j];
				result[result.length-1][j]+=score[i][j];
				result[i][result[1].length-1]+=score[i][j];	
			}
			result[result.length-1][result[1].length-1] += result[i][result[1].length-1];
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d",result[i][j]);
			}
			System.out.println();
		}
		
	}

}
