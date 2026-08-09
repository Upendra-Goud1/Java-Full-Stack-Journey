public class Student {

	String name;
	int age;
	String college;

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("College: " + college);
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Upendra";
		s1.age = 22;
		s1.college = "ACE Engineering College";
		s1.display();

		Student s2 = new Student();
		s2.name = "Goud";
		s2.age = 23;
		s2.college = "Pondicherry University";
		s2.display();
	}
}