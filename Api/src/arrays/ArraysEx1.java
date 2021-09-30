package arrays;

import java.util.Arrays;
import java.util.Comparator;

/*arrays : 배열을 다루는데 유용한 메서드 제공
 * 배열 복사, 배열 채우기, 배열의 정렬, 검색, 문자열 비교, 출력
 * 배열을 리스트로 변환
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2 = { { 11, 12, 13 }, { 21, 22, 23 } };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));

		int arr3[] = { 37, 21, 56, 99, 66, 44 };
		Arrays.sort(arr3);// 오름차순
		System.out.println(Arrays.toString(arr3));
		
		Integer arr4[] = { 37, 21, 56, 99, 66, 44 };
		Arrays.sort(arr4, Comparator.reverseOrder());//내림차순 Comparator.naturalOrder 오름차순으로할수있음
		System.out.println(Arrays.toString(arr4));
		
		String strArr[] = {"good","height","very","apple","zero","zoo"};
		Arrays.sort(strArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		Character chArr[] = {'ㅎ','ㅅ','ㄱ','ㄷ','ㅁ','ㅂ','ㅊ'};
		Arrays.sort(chArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(chArr));
	}

}
