package ClassTest;

public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		System.out.println(data);
		/*data.x = 10;
		change(data.x);//   (1). data.x = 10�� �״�� change ���� 10���� ���� 
		System.out.println(data.x); // (3) �޼ҵ尡 ������ �ٽÿö���� ������ x = 10 */
		
		System.out.println();
		change(data.x);
		System.out.println(data.x);
	}
	static void change(int x) { // (2)10�� �״�� �����ͼ� �� �޼ҵ�ȿ��� 10 ->10000���� ����
		
		x = 10000;	
		System.out.println(x);
	}
	//heap �ȿ� ����ִ� x=10��  �����ѰԾƴ϶� ,x�� �׳� �ʱ�ȭ��Ų��
	
	static void change(Data d) {
		
		System.out.println(d);
		d.x=10000;
	}
}
