package object;

public class Value {
	int value;
	
	public Value(int value) {
		super();
		this.value = value;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) { //object obj = value2 가 넘어온다.
		// TODO Auto-generated method stub
		
		Value v = (Value)obj;
		
		if(this.value == v.value) {
			return true;
		}
		return false;
	}
	
}
