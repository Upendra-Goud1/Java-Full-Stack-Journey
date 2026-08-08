import java.util.Scanner;

public class Problem1 {
	
	Scanner sc = new Scanner(System.in);
	
	void case1() {
		
		System.out.println("enter num of students: ");
		int std = sc.nextInt();
		int [] stud = new int[std];
		
		double [] marks = new double[std];
		for(int i = 0; i<stud.length;i++) {
			System.out.println("enter student "+(i+1)+" marks:");
			marks[i] = sc.nextDouble();
		}
		
		for(int i=0;i<stud.length;i++) {
			System.out.println("Student "+(i+1)+"  marks->"+marks[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Problem1 p = new Problem1();
		
		p.case1();
		
	}

}
