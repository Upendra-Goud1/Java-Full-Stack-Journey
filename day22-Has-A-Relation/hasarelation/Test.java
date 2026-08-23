package hasarelation;

public class Test {
	
	
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setName("upendra");
		professor.setExperience(10);
		professor.setSubject("java");
		
		Department department = new Department();
		department.setName("CSE");
		department.setCountOfStudt(200);
		department.setProfessor(professor);
		
		Department department2 = new Department();
		department2.setName("AI ML");
		department2.setCountOfStudt(300);
		department2.setProfessor(new Professor("manoj",13,"NLP"));
		
		Department department3 = new Department("EEE",50, new Professor("vinay",22,"IOT"));
		
		System.out.println(department);
		System.out.println(department2);
		System.out.println(department3);
		
	}

}
