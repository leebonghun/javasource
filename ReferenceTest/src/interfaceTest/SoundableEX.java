package interfaceTest;

public class SoundableEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
	}
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
