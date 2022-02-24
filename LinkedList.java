class LinkedList{

	LLNode head;

	private class LLNode{
		int value;
		LLNode next;

		public LLNode(int value, LLNode next){
			this.value = value;
			this.next = next;
		}
	}
		
	public void insertNode(int value){
		LLNode tmp = new LLNode(value, null);

		if(head == null){
			head = tmp;
			return;
		}

		LLNode ptr = head;

		while(ptr.next != null){
			ptr = ptr.next;
		}
		ptr.next = tmp;
	}

	public void printList(){

		LLNode ptr = head;

		while(ptr != null){
			System.out.println(ptr.value + "->");
		}
	}

	public LLNode deleteNode(int value){

		return null;
	}

	public LLNode removeAfter(int value){

		// Write code here

		return null;
	}

	public LLNode getMax(){

		// Write code here
				
		return null;
	}

	public LLNode partition(){

		return null;
	}

}
