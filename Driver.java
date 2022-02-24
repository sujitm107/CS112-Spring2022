import java.util.*;

public class Driver {
	

	public static void main(String[] args){
		// MyStack stk = new MyStack();

		// stk.push(7);
		// stk.push(15);

		// stk.pop();
		// stk.pop();
		// stk.pop();

		// System.out.println(stk);

		// System.out.println(validParen("[]("));

		CLL<Integer> list = new CLL<Integer>();

		list.insertNode(5);
		list.insertNode(6);
		list.insertNode(7);
		list.insertNode(8);

		list.traverseCLL();
	}

	public static boolean validParen(String s){
		
		Stack<Character> stk = new Stack<>();

		char[] array =  s.toCharArray();

		for(int i = 0; i < array.length; i++){
			char c = array[i];

			if(c == '(' || c == '{' || c == '['){ //opening parentheses
				stk.push(c);
			} else { // closing parentheses
				if(stk.size() == 0){
					return false;
				}

				char pop = stk.pop();

				if(( c != ')' && pop == '(' ) || (c == ']' && pop != '[' ) || (c == '}' && pop != '{' ) ) {
					return false;
				}

			}
		}

		if(stk.size() > 0){
			return false;
		}

		return true;
	}

}
