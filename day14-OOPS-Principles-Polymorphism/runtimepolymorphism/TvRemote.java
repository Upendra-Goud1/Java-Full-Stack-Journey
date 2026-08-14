package runtimepolymorphism;

public class TvRemote extends Remote{
	
	@Override
	void turnOn() {
		super.turnOn(); // it will call the Parent class Instance...
		System.out.println("Tv turn on....");
	}
	
	// Method Hiding...
	
	static void turnOff() {
		System.out.println("tv turned off....");
	}

}
