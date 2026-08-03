public class LogicalOperator {

	public static void main(String[] args) {

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;

		System.out.println(b1 && b2); // T && F = F
		System.out.println(b1 && b3); // T && T = T
		System.out.println(b2 && b3); // F && T = F
		System.out.println(b2 && b4); // F && F = F

		System.out.println(b1 || b2); // T || F = T
		System.out.println(b1 || b3); // T || T = T
		System.out.println(b2 || b4); // F || F = F

		System.out.println(!b1); // !T = F
		System.out.println(!b2); // !F = T

		System.out.println(b1 && b2 || b3);        // (T && F) || T = T
		System.out.println(b2 || b3 && b4);         // F || (T && F) = F
		System.out.println(b1 && (b2 || b3));       // T && (F || T) = T
	}
}