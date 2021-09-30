package Array;

public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {50,60,70,80,90,56,45,67,89};
		//최고점수
		//최저점수
		
		int max = score[0];
		int mim = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
			if(mim>score[i]) {
				mim = score[i];
			}
			
		}
		System.out.println(max);
		System.out.println(mim);
	}

}
