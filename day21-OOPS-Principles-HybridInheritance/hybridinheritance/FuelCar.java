package hybridinheritance;

public class FuelCar implements Vehicle,Car{

	@Override
	public void carName() {

       System.out.println("maruthi");
		
	}

	@Override
	public void start() {
		System.out.println("car started..");
		
	}

}
