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
		System.out.println("숫자 : "+card.getNumber());
		System.out.println("모양 : "+card.getKind());
		System.out.printf("카드 크기 (%d, %d)\n",Card.height,Card.width);
		System.out.println();
	}

}
