public class LargestAndSmallest {
	
	static void findLargestAndSmall(int [] arr) {
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("largest: "+max);
		System.out.println("smallest: "+min);
	}
	
	public static void main(String[] args) {
		 
		int [] arr = {8,9,23,25,43,32};
		LargestAndSmallest.findLargestAndSmall(arr);
	}

}
