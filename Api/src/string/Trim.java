package string;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "            aadasd            asdads            asdad                 ";
		String newStr1 = str1.trim();
		System.out.println(str1);
		System.out.println(newStr1);
		
		System.out.println(newStr1.equals(str1));
	}

}
