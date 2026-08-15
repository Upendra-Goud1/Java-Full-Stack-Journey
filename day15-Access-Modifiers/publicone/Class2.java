package publicone;

public class Class2 {
	
	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		System.out.println("class 2 : "+obj.a);
		obj.Hi("class 2..");
		
		//System.out.println("class 1: b= "+obj.b); // this is private variable so we can not access this variable in this class
	    // obj.bye(); // this is a private method so we can not access in this class
	
		System.out.println("class 2: "+obj.c);
		System.out.println("D:"+obj.d);
		
	}

}
