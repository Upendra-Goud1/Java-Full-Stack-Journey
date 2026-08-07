import java.util.Scanner;

public class ReverseString {

	String reverseString(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}

	void reverseStringPrint(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		String s = sc.nextLine();
		String result = rs.reverseString(s);
		System.out.println(result);

		System.out.println("enter another string: ");
		String s1 = sc.nextLine();
		rs.reverseStringPrint(s1);

		sc.close();
	}
}