package inheritance;

public class CaptionTVEx {
	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("���� ä�� "+ctv.channel);
		
		ctv.displayCaption("Hell World");
		ctv.caption = true;
		ctv.displayCaption("Hell java");

	}
}
