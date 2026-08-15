package publictwo;

import publicone.Class1;

public class Class3 {

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		System.out.println("class 3 : "+obj.a);
		obj.Hi("class 3..");
		
		// this is a protected variable so this variables are access only with in the package..
		//System.out.println("class 3: "+obj.c);
		
		// System.out.println("D:"+obj.d); // default variables you can access with in the package..
	}
}
