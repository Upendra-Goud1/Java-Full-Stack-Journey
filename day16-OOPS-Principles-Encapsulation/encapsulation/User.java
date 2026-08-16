package encapsulation;

public class User {
	
	private String name;
	private int age;
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int newAge) {
		if(newAge>0) {
			this.age = newAge;
		}else {
			System.out.println("Invalid age !!!");
		}
		
	}
	
	public int getAge() {
		return this.age;
	}

}
