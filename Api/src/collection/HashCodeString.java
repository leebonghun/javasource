package collection;

public class HashCodeString {
//set => hashcode() 값을 확인 => 같다면 같은 객체 => 저장하지 않음
//                         => 조건 : equals 검사 후 그것도 같다면     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1 = "안녕하세요";
		String obj2 = new String("안녕하세요");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
