package Array;

public class ArrayTest1 {

	public static void main(String[] args) {
		//참조타입 : 힙/null/자동으로 초기화
//		정수 : 0  실수 : 0.0, boolean false
		int arr[] = new int[10];
		//개별 요소에 접근 0번부터 시작(0~9)
	
		
		for(int i=0; i<10; i++) {
			arr[i]++;
			System.out.println(arr[i]);
		}
	}

}
