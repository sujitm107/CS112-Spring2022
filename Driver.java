public class Driver {
	

	public static void main(String[] args){
		MyStack stk = new MyStack();

		stk.push(7);
		stk.push(15);

		stk.pop();
		stk.pop();
		stk.pop();

		System.out.println(stk);
	}
}
