package abstractclass;

public class Loin extends Animal{

	@Override
	public void sound() {
		
		System.out.println("Roar...");
		
	}
	
	public void sleeping() {
		System.out.println("loin sleeping...");
	}

	@Override
	public int noOfLegs() {
		
		return 4;
	}
	
	

}
