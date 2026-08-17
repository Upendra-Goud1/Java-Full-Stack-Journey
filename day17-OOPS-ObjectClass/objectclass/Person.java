package objectclass;

//import java.util.Objects;

public class Person {
	
	int age;
	String name;
	
    // parameterized constructor
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
    // default constructor
	public Person() {
		
	}
	
     // overriding equals() from Object class
     // to compare content instead of memory address
	@Override
	public boolean equals(Object obj) {
		
		Person person = (Person) obj;
		return this.age == person.age && this.name.equals(person.name);
	}

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.age=10;
		person1.name="upendra";
		
		Person person2 = new Person(10,"upendra");
		boolean isSame=person1.equals(person2);
		System.out.println(isSame);
		
	}

}
