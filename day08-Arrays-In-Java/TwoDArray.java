import java.util.Arrays;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		int [][] arr = new int [3][3];
		
		arr[0][0] = 10;
		arr[0][1] = 14;
		arr[0][2] = 17;
		arr[1][0] = 13;
		arr[1][1] = 18;
		arr[1][2] = 11;
		arr[2][0] = 22;
		arr[2][1] = 33;
		arr[2][2] = 44;
		
		for(int i = 0;i<arr.length; i++) {
			
			for(int j=0;j<arr[1].length;j++) {
				
				System.out.println(arr[i][j]);
			}
		}
		
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
		
	}

}
