package abstractclass;

public class Test {
	
	public static void main(String[] args) {
		
		Loin loin = new Loin();
		loin.sound();
		loin.sleeping();
		System.out.println("No of legs: "+loin.noOfLegs());
		
		Dog dog = new Dog();
		dog.sound();
		System.out.println("No of legs: "+dog.noOfLegs());
		
	}

}
