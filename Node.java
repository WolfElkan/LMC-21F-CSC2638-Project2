public class Node <T> {
	T data;
	Node next;
	Node(T p_data) {
		data = p_data;
		next = null;
	}
	public String toString() {
		return data.toString();
	}
	public static void main(String[] args) {
		Node<String> foo = new Node<>("Hello");
		Node<String> bar = new Node<>("Good-bye");
		foo.next = bar;
		System.out.println(foo.next.data);
	}
}