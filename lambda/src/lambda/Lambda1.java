package lambda;

public class Lambda1 {
	int max(int a,int b) {
		return a> b? a: b;
	}
	// (int a, int b) -> { return a > b ? a: b;}
	// (int a, int b) -> a>b? a:b;
	//(a,b) -> a>b? a:b;
	
	void printVar(String name,int i) {
		System.out.println(name +"=" + i);
	}
	//람다식 : (String name,int i) -> System.out.println(name + "=" +i);
	//람다식 : name,i -> System.out.println(name + "=" +i);

	int square(int x) {
		return x *x;
	}
	//x -> x*x;

	int roll() {
		return (int)(Math.random()*6);
	}
	// 
}
