package runtimepolymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		TvRemote tv = new TvRemote();
		tv.turnOn();
		AcRemote ac = new AcRemote();
		ac.turnOn();
	}

}
