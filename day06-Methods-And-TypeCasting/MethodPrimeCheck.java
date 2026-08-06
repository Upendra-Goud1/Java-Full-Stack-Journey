import java.util.Scanner;

public class MethodPrimeCheck {

	void Prime1(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("It is prime..");
		} else {
			System.out.println("Not prime..");
		}
	}

	void Prime2(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("It is prime..");
		} else {
			System.out.println("Not prime..");
		}
	}

	void Prime3(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("It is prime..");
		} else {
			System.out.println("Not prime..");
		}
	}

	void Prime4(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("It is a prime..");
		} else {
			System.out.println("Not prime..");
		}
	}

	void Prime5(int num) {
		int count = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("It is a prime..");
		} else {
			System.out.println("Not prime..");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();

		MethodPrimeCheck m = new MethodPrimeCheck();
		m.Prime1(num);
		m.Prime2(num);
		m.Prime3(num);
		m.Prime4(num);
		m.Prime5(num);

		sc.close();
	}
}