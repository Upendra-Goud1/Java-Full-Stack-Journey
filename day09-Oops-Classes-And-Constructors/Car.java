public class Car {

	String brand;
	int speed;

	Car() {       // non-parameterized constructor
		brand = "Toyota";
		speed = 120;
		System.out.println("Default constructor called");
	}

	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed);
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.display();
	}
}