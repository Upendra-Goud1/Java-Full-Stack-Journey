import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter how many times: ");
		int times = sc.nextInt();

		while (times != 0) {
			System.out.println(times + " times");
			System.out.println("enter how many times: ");
			times = sc.nextInt();
		}

		sc.close();
	}
}