package Test;

public class Exam2 {

	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.print("x="+x);
					System.out.println("y="+y);
				}
			}
		}
	}

}
