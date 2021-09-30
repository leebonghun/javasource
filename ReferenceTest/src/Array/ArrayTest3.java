package Array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayTest3 {

	public static void main(String[] args) {
		int arr[] = {0,10,20,30,40};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t\n");
		}
		for(int i:arr) {
			System.out.print(i+"\t\n");
		}
		
		String arr2[] = {"바나나","사과","포도","자두","망고"};
		
		/*for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}*/
		for(String f:arr2) {
			System.out.print(f+"\t");
		}
	}   //향상된 for 문 enhanced for 문

}
