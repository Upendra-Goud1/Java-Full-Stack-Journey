package objectclass.HashCode;

import java.util.Objects;

public class Member {

	int age;
	String name;

	public static void main(String[] args) {

		Member m = new Member();
		m.age = 10;
		m.name = "upendra";

		Member m1 = new Member(10, "upendra");

		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		
		System.out.println(m);
		System.out.println(m1);
	}

	public Member() {

	}

	public Member(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.age, this.name);
	}
	
	@Override
	public String toString() {
		
		return this.age + " " + this.name;
	}

}
