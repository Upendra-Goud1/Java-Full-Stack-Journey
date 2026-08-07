import java.util.Arrays;


public class StringMethods {

	void isEqual(String s1, String s2) {
		System.out.println(s1.equals(s2));
	}

	void findLength(String s) {
		System.out.println(s.length());
	}

	void charAtIndex(String s, int index) {
		System.out.println(s.charAt(index));
	}

	void isEmpty(String s) {
		System.out.println(s.isEmpty());  // true only if length == 0
	}

	void isBlank(String s) {
		System.out.println(s.isBlank());  // true if empty or only whitespace
	}

	void equalsIgnoreCase(String s1, String s2) {
		System.out.println(s1.equalsIgnoreCase(s2));  // ignores upper/lower case
	}

	void contains(String s1, String s2) {
		System.out.println(s1.contains(s2));  // checks if s1 contains s2
	}

	void startsAndEndsWith(String s) {
		System.out.println(s.startsWith("upendra"));  // true if starts with
		System.out.println(s.endsWith("goud"));       // true if ends with
	}

	void indexOf_LastIndexOf(String s) {
		System.out.println(s.indexOf('g'));       // first occurrence of 'g'
		System.out.println(s.lastIndexOf('d'));   // last occurrence of 'd'
	}

	void substring_Example(String s) {
		System.out.println(s.substring(1, 5));  // characters from index 1 to 4
	}

	void trim_Example(String s) {
		System.out.println(s.trim());  // removes leading and trailing whitespace
	}

	void replace_Example(String s) {
		System.out.println(s.replace("upendra", "goud"));  // replace all
		System.out.println(s.replaceFirst("up", "ppp"));   // replace first occurrence only
	}

	void split_Example() {
		String s = "hi this is java class";
		String[] words = s.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println(Arrays.toString(words));
	}

	public static void main(String[] args) {

		StringMethods m = new StringMethods();

		m.isEqual("flm", "FLM");
		m.findLength("upendra");
		m.charAtIndex("goud", 3);
		m.isEmpty(" ");
		m.isBlank("  ");
		m.equalsIgnoreCase("goud", "GOUD");
		m.contains("upendra goud", "goud");
		m.startsAndEndsWith("upendra goud");

		String s = "   upendra goud";
		m.indexOf_LastIndexOf(s);
		m.substring_Example(s);
		m.trim_Example(s);
		m.replace_Example(s);
		m.split_Example();
	}
}