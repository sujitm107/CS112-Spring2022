public class CLL<T> {
	private class Node<T>{
		T value;
		Node<T> next;

		public Node() {
			value = null;
			next = null;
		}

		public Node(T value, Node<T> next){
			this.value = value;
			this.next = next;
		}
	}

	private Node<T> last;

	public void insertNode(T value){

		if(last == null){
			Node<T> temp = new Node(value, null);
			last = temp;
			last.next = temp;
			return;
		}

		Node<T> temp = new Node(value, last.next);
		last.next = temp;

		return;
	}

	public void traverseCLL(){

		if(last == null){
			return;
		}

		Node<T> ptr = last.next;

		do {
			System.out.print(ptr.value + "-->");
			ptr = ptr.next;
		} while(ptr != last.next);

	}
}