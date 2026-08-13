// Method Overloading Example
public class Calculator {
	
	public static void main(String[] args) {
		int result=Calculator.sum();
		System.out.println(result);
		int result2 = Calculator.sum(10,30);
		System.out.println(result2);
		int result3 = Calculator.sum(10,20,40);
		System.out.println(result3);
		
	}
	
     // this is called an Method Overloading or Compile time Polymorphism 
	
	static int sum() {
		int a=20+10;
		return a;
	}
	
	static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	static int sum(int a, int b,int c) {
		int d = a+b+c;
		return d;
	}
}
