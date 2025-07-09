package stack;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.toString());
		
		System.out.println("POPPED: " + stack.pop());
		System.out.println(stack.toString());
		System.out.println("PEEK: " + stack.peek());
		System.out.println(stack.toString());
		
	}
}
