package arrays;


import java.util.Arrays;
import java.util.Comparator;

/*arrays : �迭�� �ٷ�µ� ������ �޼��� ����
 * �迭 ����, �迭 ä���, �迭�� ����, �˻�, ���ڿ� ��, ���
 * �迭�� ����Ʈ�� ��ȯ
 */
public class ArraysEx2 {

	public static void main(String[] args) {
		int arr3[] = {37,21,56,99,88,58,62,15,39,78};
		//58 ���ڰ� ����� �ִ��� �˰�ʹ�.
		
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i] == 58) {
				System.out.println(i+1+"��°��"+arr3[i]+"�� �ֽ��ϴ�");
				break;
			}
		}
		System.out.println();
		
		//binarySearch : �����˻� (������ ���� �� �� )
		Arrays.sort(arr3); //1.������ ���� �ؾ���
		int pos = Arrays.binarySearch(arr3, 58);
		System.out.println(pos+1);
	}

}
