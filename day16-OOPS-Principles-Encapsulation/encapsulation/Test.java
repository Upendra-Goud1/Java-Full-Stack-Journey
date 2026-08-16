package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		User user = new User();
		
		user.setAge(25);
		System.out.println(user.getAge());
		
		user.setName("upendra");
		System.out.println(user.getName());
		
		
	}

}
