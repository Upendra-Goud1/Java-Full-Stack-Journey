package multilevelinheritance;

public class Test {
    public static void main(String[] args) {

        FuelCar fc = new FuelCar();
        fc.start();    // from Vehicles (grandparent)
        fc.driving();  // from Car (parent)
        fc.fuel();     // own method
    }
}