import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter marks: ");
		int marks = sc.nextInt();

		String grade = (marks >= 90) ? "Grade A" :
			           (marks >= 70) ? "Grade B" :
			           (marks >= 50) ? "Grade C" : "Fail";
		System.out.println(grade);

		// example two

		System.out.println("enter day");
		int day = sc.nextInt();

		String week = (day == 1) ? "Monday" :
			          (day == 2) ? "Tuesday" :
			          (day == 3) ? "Wednesday" :
			          (day == 4) ? "Thursday" :
			          (day == 5) ? "Friday" :
			          (day == 6) ? "Saturday" :
			          (day == 7) ? "Sunday" : "Invalid";
		System.out.println(week);

		sc.close();
	}
}