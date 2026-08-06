public class ExplicitTypeCasting {

	public static void main(String[] args) {

		short s = 65;
		byte b = (byte) s;
		System.out.println("s: " + s);
		System.out.println("b: " + b);

		char c = (char) s;
		System.out.println("c: " + c);

		char c1 = 'A';
		int i = (int) c1;
		System.out.println("c1: " + c1);
		System.out.println("i: " + i);
	}
}