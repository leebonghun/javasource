package collection;

import java.util.Stack;

// stack : last in first out
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();

		stack.push("사과");
		stack.push("사과1");
		stack.push("사과2");
		stack.push("사과3");

		for (int i = 0; i < stack.size(); i++) {
			System.out.println(i);
		}
		System.out.println(stack);
		System.out.println();
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}

}
