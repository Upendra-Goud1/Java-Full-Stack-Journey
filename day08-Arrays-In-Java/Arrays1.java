public class Arrays1 {
	
	void CharArray() {
		char [] arr = new char[5];
		
		arr[0]= 'a';
		arr[1]= 'b';
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
	
	void stringArray() {
		String [] arr = new String[4];
		
		System.out.println(arr[0]); // it will print default value as null
		
		arr[0] = "upendra";
		arr[1] = "vinay";
		arr[2] = "vamshi";
		arr[3] = "pavan";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

	}
	
	public static void main(String[] args) {
		
		Arrays1 a = new Arrays1();
		a.CharArray();
		a.stringArray();
		
		int [] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 23;
		arr[2] = 33;
		arr[3] = 22;
		arr[4] = 11;
		
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		int [] arr1 = {2,4,5,0,4};
		
		System.out.println(arr1[4]);
		System.out.println(arr1.length);
		System.out.println(arr.length);
	}

}
