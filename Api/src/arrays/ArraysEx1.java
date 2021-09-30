package arrays;

import java.util.Arrays;
import java.util.Comparator;

/*arrays : �迭�� �ٷ�µ� ������ �޼��� ����
 * �迭 ����, �迭 ä���, �迭�� ����, �˻�, ���ڿ� ��, ���
 * �迭�� ����Ʈ�� ��ȯ
 */
public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2 = { { 11, 12, 13 }, { 21, 22, 23 } };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));

		int arr3[] = { 37, 21, 56, 99, 66, 44 };
		Arrays.sort(arr3);// ��������
		System.out.println(Arrays.toString(arr3));
		
		Integer arr4[] = { 37, 21, 56, 99, 66, 44 };
		Arrays.sort(arr4, Comparator.reverseOrder());//�������� Comparator.naturalOrder �������������Ҽ�����
		System.out.println(Arrays.toString(arr4));
		
		String strArr[] = {"good","height","very","apple","zero","zoo"};
		Arrays.sort(strArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		Character chArr[] = {'��','��','��','��','��','��','��'};
		Arrays.sort(chArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(chArr));
	}

}
