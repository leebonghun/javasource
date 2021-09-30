package ClassTest;

public class Card {
	//��� ����
	private String kind; // ī�� ��� ����
	private int number; // ī�� ���� ����
	//Ŭ���� ����
	static int width = 10;//���� ���� ����. ex) ī�� ���� ���� ����
	static int height = 7;
	//static(����) : Ŭ������ ������ ���
	//              ��ü�� �������� �ʰ� ���
	//				Ŭ������ �޸𸮿� �ε�� �� ���� 
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	//static(����) �޼ҵ� : ��ü�� �������� �ʰ� ���
	//					Ŭ������ �޸𸮿� �ε�� �� ����
    //					static �޼��� �ȿ��� �ν��Ͻ� ��� ���Ұ� this���Ұ�
	public static int getWidth() {
		return width;
	}
	public static int getHeight() {
		return height;
	}
	
	//static�� ���Ǵ� �� : �������, �޼���, �ʱ�ȭ��
	
}
