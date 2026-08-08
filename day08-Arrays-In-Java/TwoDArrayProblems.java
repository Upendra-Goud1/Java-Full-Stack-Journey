import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayProblems {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter r ");
		int r = sc.nextInt();
		System.out.println("enter c ");
		int c = sc.nextInt();
		int [][] arr = new int [r][c];
		
		for  (int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[1].length;j++) {
				
				System.out.println("enter arr["+i+"]"+"["+j+"]");
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j=0;j<arr[1].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		for(int [] a:arr) {
			System.out.println(Arrays.toString(a));
		}
        sc.close();
	}

}
