package ClassTest;

public class CardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card("spade",7);
		cardPrint(card1);
	
		
		
		
		Card card2 = new Card("heart",2);
		cardPrint(card2);
	}
	static void cardPrint(Card card) {
		System.out.println("���� : "+card.getNumber());
		System.out.println("��� : "+card.getKind());
		System.out.printf("ī�� ũ�� (%d, %d)\n",Card.height,Card.width);
		System.out.println();
	}

}
