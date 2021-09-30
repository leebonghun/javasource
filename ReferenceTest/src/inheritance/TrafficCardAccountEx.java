package inheritance;

public class TrafficCardAccountEx {
	public static void main(String[] args) {
		TrafficCardAccount traffic = new TrafficCardAccount("122-14", 10000, "È«±æµ¿", 
				"3333-44", true);
		
		System.out.println("ÇöÀçÀÜ¾× : "+traffic.payTrafficCard("3333-44", 1800));

	}
}
