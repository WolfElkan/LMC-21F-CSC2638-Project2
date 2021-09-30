// public class ArrayStack {
// 	public static void main(String[] args) {
// 		String[] groceries = new String[5];
// 		groceries[6] = "milk";
// 		groceries[1] = "eggs";
// 		System.out.println(groceries[1]);
// 	}
// }

public class ArrayStack <T> {
	private Node[] array;
	private int _length;
	private int _array_length;
	ArrayStack(int initialCapacity) {
		array = new Node[initialCapacity];
		_length = 0;
		_array_length = initialCapacity;
	}
	public int length() {
		return _length;
	}
	public int arrayLength() {
		return _array_length;
	}
	public String toString() {
		String str = "-> ";
		int cur = _length-1;
		while (cur >= 0) {
			str += array[cur].toString();
			if (cur > 0) {
				str += ", ";
			}
			cur--;
		}
		str += "]";
		return str;
	}
	private void doubleCapacity() {
		_array_length *= 2;
		Node[] newArray = new Node[_array_length];
		for (int i = 0; i < _length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}
	public void push(T p_data) {
		if (_length >= _array_length) {
			doubleCapacity();
		}
		Node<T> node = new Node<>(p_data);
		array[_length++] = node;
	}
	public Node peek() {
		return array[_length-1];
	}
	public Node pop() {
		return array[--_length];
	}
	public static void main(String[] args) {
		ArrayStack<String> test = new ArrayStack<>(4);
		test.push("one");
		test.push("two");
		test.push("three");
		test.push("four");
		test.push("five");
		test.push("six");
		test.push("seven");
		test.push("eight");
		test.push("nine");
		test.push("ten");
		System.out.println(test);
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.length());
	}
}