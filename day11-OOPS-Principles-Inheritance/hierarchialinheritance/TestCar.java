package hierarchialinheritance;

public class TestCar {
    public static void main(String[] args) {

        FuelCar fc = new FuelCar();
        fc.driving(); // from Car
        fc.fuel();    // own method

        EvCar ev = new EvCar();
        ev.driving();  // from Car
        ev.charging(); // own method

        CngCar cr = new CngCar();
        cr.driving(); // from Car
        cr.gas();     // own method
    }
}