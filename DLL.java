public class DLL<T> {
	private class Node<T>{
		T value;
		Node<T> next;
		Node<T> prev;

		public Node() {
			value = null;
			next = null;
			prev = null;
		}

		public Node(T value, Node<T> next, Node<T> prev){
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}

	private Node<T> head;
}
