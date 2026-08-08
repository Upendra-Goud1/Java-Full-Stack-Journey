public class ArrayReverse {
	
	// array reverse 
	
	static int[] arrayReverse(int [] arr) {
		
		int [] newarr = new int [arr.length];
		int j = 0;
		
		for(int i=arr.length-1;i>=0;i--) {
			
			newarr [j] = arr[i];
			j++;
		}
		return newarr;
	}
	
	// optimized logic for array reverse
	
	static void arrReverseUsingWhile(int [] array) {
		
		int start = 0;
		int end = array.length-1;
		
		while(start<end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = {3,45,67,23,45,55};
		int [] result=ArrayReverse.arrayReverse(arr);
		
		// for each loop (or) enhanced for loop
		
		for(int a:result) {
			System.out.print(a+" , ");
		}
		System.out.println("");
		
		
		int [] array = {7,9,4,2,3,6};
		ArrayReverse.arrReverseUsingWhile(array);
		
		for(int a:array) {
			System.out.print(a+" , ");
		}
		
	}

}
