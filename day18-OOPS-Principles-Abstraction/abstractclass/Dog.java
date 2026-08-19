package abstractclass;

public class Dog extends Animal{

	@Override
	public void sound() {
		
		System.out.println("Bow Bow...");
	}

	@Override
	public int noOfLegs() {
		
		return 4;
	}

}
