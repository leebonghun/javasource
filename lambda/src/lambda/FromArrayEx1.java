package lambda;

import java.util.Arrays;

public class FromArrayEx1 {

	public static void main(String[] args) {
		//��Ʈ�� : �ڹ� 8���� �߰�
		//       �÷����� ��Ҹ� �ϳ��� �����ؼ� ���ٽ����� ó���� �� �ֵ��� �����ִ� �ݺ���
		//       ���͸�, ���ΰ� ���� �߰� ó���� ������
		//       �ڵ��� ���Ἲ ����, ����� ���� ó���� �÷��� ���ο��� �˾Ƽ� ó��
		
		
		String[] strArray = {"���","�ٳ���","�ڸ�","����","�޷�",};
		
		//�迭 -> stream
		//�迭�� ���ϰ� ����� �� �ֵ��� �����Ǵ� Ŭ���� : Arrays
		
		//�迭�� ��Ʈ������ ����� �۾�
		Arrays.stream(strArray).forEach(str -> System.out.println(str));
		
	}

}
