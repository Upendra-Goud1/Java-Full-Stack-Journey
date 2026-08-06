public class ImplicitTypeCasting {

	public static void main(String[] args) {

		byte b = 127;
		short s = b;
		System.out.println("b: " + b);
		System.out.println("s: " + s);

		int i = s;
		i = 333;
		System.out.println("i: " + i);

		long l = i;
		System.out.println("l: " + l);

		float f = l;
		System.out.println("f: " + f);

		f = 23.333f;
		double d = f;
		System.out.println("d: " + d);
	}
}