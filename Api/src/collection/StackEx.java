package collection;

import java.util.Stack;

// stack : last in first out
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();

		stack.push("���");
		stack.push("���1");
		stack.push("���2");
		stack.push("���3");

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
