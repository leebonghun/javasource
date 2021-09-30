package collection;

import java.util.LinkedList;
import java.util.List;

/*ArrayList vs LinkedList
 * -���������� �߰�/���� �� ArrayList�� �� �� ������
 * -�߰� �����͸� �߰�/���� �� LinkedList�� �� �� ����
 */
public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		//�߰� �Ҷ��� add�� ����� �״��
		list.add("�̺���");
		list.add("��");
		list.add("���");
		list.add("������");
		list.add("����");
		
		System.out.println(list);
	}

}
