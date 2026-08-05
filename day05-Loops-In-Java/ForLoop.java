import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("how many times: ");
		int times = sc.nextInt();

		for (int i = 1; i <= times; i++) {
			System.out.println(i + " times");
		}

		sc.close();
	}
}