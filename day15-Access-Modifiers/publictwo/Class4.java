package publictwo;

import publicone.Class1;

public class Class4 extends Class1{
	
	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		System.out.println("class 4 : "+obj.a);
		obj.Hi("class 4...");
		
		// here i accessed protected variable in the other package 
		// protected variables and methods can be accessible within the package but they are access
		// in the different package when they are sub class
		
		Class4 obj2 = new Class4();
		System.out.println("class 4: "+obj2.c);
		obj2.come();
		
		//System.out.println("D:"+obj.d); // we can not access default variables in the another package
		                                  // even if it is sub class 
	}

}
