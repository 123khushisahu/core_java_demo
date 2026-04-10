package oops;

	import java.util.Stack;

	public class Collection4 {
		public static void main(String[] args) {
			
			Stack<Object> stack = new Stack<>();
			
			stack.push("a");
			stack.push("b");
			stack.push("c");
			stack.push("d");
			stack.push("e");
			
			System.out.println(stack); //[a, b, c, d, e]
			
			System.out.println(stack.pop()); //e
			System.out.println(stack); //[a, b, c, d]
			
			System.out.println(stack.pop()); //d
			System.out.println(stack); //[a, b, c]
			
			System.out.println(stack.peek()); //c
			System.out.println(stack); //[a, b, c]
			
			System.out.println(stack.peek()); //c
			System.out.println(stack); //[a, b, c]
		//===================================================	
			stack.add(5);
			System.out.println(stack); //[a, b, c, 5]
			
			System.out.println(stack.get(2));
			System.out.println(stack.get(0));
		//===================================================	
			
		}
	}


