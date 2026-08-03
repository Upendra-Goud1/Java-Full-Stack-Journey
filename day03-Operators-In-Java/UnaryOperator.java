public class UnaryOperator {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		int x1 = +a;
		System.out.println(x1);
		int x2 = -a;
		System.out.println(x2);
		boolean x3 = true;
		boolean s = !x3;
		System.out.println(s);

		a = 4;
		b = 2;

		// post increment
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);

		// pre increment
		System.out.println(++a);
		System.out.println(a);

		// post decrement
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);

		// pre decrement
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
	}
}