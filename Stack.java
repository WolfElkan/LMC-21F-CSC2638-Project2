public class Stack <T> {
	Node head;
	private int _length;
	Stack() {
		head = null;
		_length = 0;
	}
	public int length() {
		return _length;
	}
	public String toString() {
		String str = "-> ";
		Node cur = head;
		while (cur != null) {
			str += cur.data.toString();
			if (cur.next != null) {
				str += ", ";
			}
			cur = cur.next;
		}
		str += "]";
		return str;
	}
	public void push(T p_data) {
		Node<T> node = new Node<>(p_data);
		if (head != null) {
			node.next = head;
		}
		head = node;
		_length += 1;
	}
	public Node peek() {
		return head;
	}
	public Node pop() {
		Node ret = head;
		head = head.next;
		_length -= 1;
		return ret;
	}
	public static void main(String[] args) {
		Stack<String> test = new Stack<>();
		test.push("maybe");
		test.push("not");
		System.out.println(test.pop().data);
		System.out.println(test.pop());
		System.out.println(test.length());
	}
}