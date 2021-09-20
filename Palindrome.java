import java.util.Scanner;

public class Palindrome {
	LinkStack<Character> stack;
	public Palindrome() {
		stack = new LinkStack<>();
	}
	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a word or phrase:");
		String input = user.nextLine();
		// boolean result = pal.isPalindrome(input);
		// System.out.println(result);
		if (pal.isPalindrome(input)) {
			System.out.println("This is a palindrome.");
		} else {
			System.out.println("This is not a palindrome.");
		}
	}
	public boolean isPalindrome(String input) {
		int nLetters = 0;
		for (int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
				nLetters++;
			}
		}
		int pos = 0;
		int let = 0;
		while (pos < input.length()) {
			char c = input.charAt(pos);
			if ('A' <= c && c <= 'Z') {
				c += 32;
			}
			if ('a' <= c && c <= 'z') {
				if (!testLetter(c, let, nLetters)) {
					return false;
				}
				let++;
			}
			pos++;
		}
		return true;
	}
	public boolean testLetter(char letter, int let, int nLetters) {
		if (let < nLetters / 2) {
			stack.push(letter);
		} else if (let > (nLetters - 1) / 2) {
			// System.out.print(stack.peek());
			// System.out.println(letter);
			return (char)letter == (char)stack.pop().data;
		} //else {
		// 	System.out.print(2);
		// 	System.out.println(letter);
		// }
		return true;
	}
}