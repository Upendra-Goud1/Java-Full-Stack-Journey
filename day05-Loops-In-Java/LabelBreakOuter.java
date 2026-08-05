public class LabelBreakOuter{

	public static void main(String[] args) {

		outer: for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break outer;
				}
				System.out.println("i: " + i + ", j: " + j);
			}
		}
	}
}