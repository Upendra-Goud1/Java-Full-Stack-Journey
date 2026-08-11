package inheritance;

public class Test {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();    // inherited from Vehicles
        c.driving();  // own method
    }
}