import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition selected");
				break;
			case 2:
				System.out.println("Subtraction selected");
				break;
			case 3:
				System.out.println("Multiplication selected");
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);

		sc.close();
	}
}