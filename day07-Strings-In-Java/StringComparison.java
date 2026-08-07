public class StringComparison {

	public static void main(String[] args) {

		String s1 = "upendra";
		String s2 = "upendra";
		
		// == compares memory addresses
		System.out.println(s1 == s2);  // true (both point to same SCP entry)

		String s3 = new String("goud");
		String s4 = new String("goud");
		
		// == compares memory addresses
		System.out.println(s3 == s4);  // false (different objects in heap)
		
		// .equals() compares content
		System.out.println(s1.equals(s2));  // true (same content)
		System.out.println(s3.equals(s4));  // true (same content)
	}
}