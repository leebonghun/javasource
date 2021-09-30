package Array;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {50,60,70,80,90,56,45,67,89};
		int sum=0;
		/*for (int i = 0; i < score.length; i++) {
			sum = score[i]+ sum; 
		}
		System.out.println(sum+sum/score.length);*/
		
		for(int idx : score) {
			sum +=idx;
		}
		System.out.println(sum/score.length);
		
	}

}
