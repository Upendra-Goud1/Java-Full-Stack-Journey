// 2) FuelCar.java (Child class)
package thisvssuper;
public class FuelCar extends Car {

    int fuelCapacity = 20;
    String colour = "Red";

    void print() {
        System.out.println(this.fuelCapacity); // 20 — current class variable
        System.out.println(super.colour);      // Black — parent class variable
        System.out.println(this.colour);       // Red — current class variable
    }
}