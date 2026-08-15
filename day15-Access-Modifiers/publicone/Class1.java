package publicone;

public class Class1 {
	
	public int a =10;
	private int b = 20;
	protected int c = 30;
	int d = 40; // ** default ** 
	
	public void Hi(String name) {
		System.out.println("name: "+name);
	}
	
	private void bye() {
		System.out.println("byee.. ");
	}
	
	protected void come(){
		System.out.println("i am comming.. ");
	}
	
	// if we make constructor as a private then we can not create object for this class in another class
//	private Class1() {
//		
//	}
	
//	protected Class1() {   // if make constructor as a protected then we can not create a variable for this class
//		                   // in the another package of the class..
//	}
	
	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		System.out.println("class 1: a="+obj.a);
		obj.Hi("class 1..");
		System.out.println("class 1: b= "+obj.b);
		obj.bye();
		System.out.println("class 1: "+obj.c);
		System.out.println("D:"+obj.d);
	}

}
