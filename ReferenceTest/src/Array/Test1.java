package Array;

public class Test1 {

	public static void main(String[] args) {
		int oldArr[] = { 10, 20, 30 };

		int newArr[] = new int[4];

		/*for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}*/
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		newArr[3] = 40;//3번자리가 비어있음 0,1,2//3
		
		for(int i:newArr) {
			System.out.println(i);
		}
	}

}
