package arrays;


import java.util.Arrays;
import java.util.Comparator;

/*arrays : 배열을 다루는데 유용한 메서드 제공
 * 배열 복사, 배열 채우기, 배열의 정렬, 검색, 문자열 비교, 출력
 * 배열을 리스트로 변환
 */
public class ArraysEx2 {

	public static void main(String[] args) {
		int arr3[] = {37,21,56,99,88,58,62,15,39,78};
		//58 숫자가 몇번쨰 있는지 알고싶다.
		
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i] == 58) {
				System.out.println(i+1+"번째에"+arr3[i]+"가 있습니다");
				break;
			}
		}
		System.out.println();
		
		//binarySearch : 이진검색 (정렬을 먼저 한 후 )
		Arrays.sort(arr3); //1.정렬을 먼저 해야함
		int pos = Arrays.binarySearch(arr3, 58);
		System.out.println(pos+1);
	}

}
