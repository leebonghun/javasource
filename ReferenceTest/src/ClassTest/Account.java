package ClassTest;

public class Account {
	//속성 : 계좌 번호 잔액 이름
	String num;
	int money;
	String name;
	
	void input(int account1) {
		money += account1;
	}//반환값 없을땐 void
	int output(int account1) {
		if(money>account1) {
		money -= account1;
		}
		return money;
	}//반환값 있을땐 int,double 등등 사용
}
