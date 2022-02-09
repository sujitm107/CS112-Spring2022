public class MyStack {
	
	LLNode head;
	int size;
	
	private class LLNode{
		int value;
		LLNode next;

		public LLNode(int value, LLNode next){
			this.value = value;
			this.next = next;
		}
	}

	public LLNode pop(){
		LLNode poppedValue = head;
		head = head.next;

		size--;

		return poppedValue;
	}

	public void push(int value){
		LLNode tmp = new LLNode(value, null);

		if(head == null){
			head = tmp;
			return;
		} else {
			tmp.next = head;
			head = tmp;		
		}

		size++;

	}

	public String toString(){

		LLNode ptr = head;
		String tmp = "";

		while(ptr != null){
			tmp += ptr.value + "\n";
			ptr = ptr.next;
		}

		return tmp;
		
	}
}