package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
//list(�������̽�) : ������ �ִ�, �������� �ߺ� ����
	// ���� Ŭ���� : vector, stack, arraylist, linkedlist
//�⺻ ���� => ��ü Ÿ�� (wrapper Ŭ����)
//int -< Integer float => Float , double => Double, 
	// char => character , boolean => Boolean

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// ������ �߰� => add()�� �߰�

		list1.add("�̺���");
		list1.add("��");
		list1.add("���");
		list1.add("������");
		list1.add("����");
		for (String e : list1) {
			System.out.println(e);
		}

		System.out.println(list1); // toString�� �������̵� �Ǿ� ����

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));

		}
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		for (int v : list2) {
			System.out.println(v);
		}
		System.out.println();
		System.out.println(list2);
		System.out.println();
		int total =0;
		for (int i = 0; i < list2.size(); i++) {
			total += list2.get(i);
		}
		System.out.println(total	);
	}

}
