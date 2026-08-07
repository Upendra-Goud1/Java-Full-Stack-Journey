import java.util.Scanner;

public class AllSubstrings {

	void printAllSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {

		AllSubstrings as = new AllSubstrings();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String s = sc.nextLine();

		as.printAllSubstrings(s);

		sc.close();
	}
}