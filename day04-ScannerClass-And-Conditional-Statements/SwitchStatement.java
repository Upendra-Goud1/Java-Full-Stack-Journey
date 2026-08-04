import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value: ");
		int a = sc.nextInt();
		System.out.println("enter b value: ");
		int b = sc.nextInt();

		System.out.println("choose your operation:\n1)+\n2)-\n3)*\n");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case 2:
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case 3:
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		default:
			System.out.println("invalid");
		}

		sc.close();
	}
}