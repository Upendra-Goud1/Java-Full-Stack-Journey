public class Bus {

	String brand;
	int speed;

	Bus() {
		brand = "Toyota";
		speed = 120;
		System.out.println("Default constructor called");
	}

	Bus(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
		System.out.println("Parameterized constructor called");
	}

	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed);
	}

	public static void main(String[] args) {

		Bus b1 = new Bus();
		b1.display();

		Bus b2 = new Bus("Honda", 150);
		b2.display();

		Bus b3 = new Bus("BMW", 200);
		b3.display();
	}
}