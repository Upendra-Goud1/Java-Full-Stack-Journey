import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = sc.nextLine(); // accepts spaces
		System.out.println(name);

		System.out.println("Enter name2: ");
		String name2 = sc.next(); // does not accept spaces
		System.out.println(name2);

		sc.close();
	}
}