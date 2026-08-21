package multipleinheritance;

public class C implements A,B{

	@Override
	public void m3() {
		System.out.println("this is m3");
		
	}

	@Override
	public void m1() {
		System.out.println("this is m1");
		
	}

	@Override
	public void m2() {
		System.out.println("this is m2");
		
	}

}
