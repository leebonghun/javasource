package stringtoken;

import java.util.StringTokenizer;

public class Token1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "È«±æµ¿/¼ºÃáÇâ/¹Ú¿¬¼ö/ÀÌ¼öÈ«";


		StringTokenizer st = new StringTokenizer(text, "/");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String text1 = "È«±æµ¿ ¼ºÃáÇâ ¹Ú¿¬¼ö ÀÌ¼öÈ«";
		
		StringTokenizer st1 = new StringTokenizer(text1, " ");

		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		String[] name = text.split("/");
		for (String s : name) {
			System.out.println(s);
		}
		
		System.out.println();
	}

}
