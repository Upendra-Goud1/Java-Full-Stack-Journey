package hasarelation;

public class Department {

	private String name;

	private int countOfStudt;

	// Has A Relationship...
    Professor professor;

	public Department() {

	}

	public Department(String name, int countOfStudt,Professor professor) {
           
		this.name = name;
		this.countOfStudt = countOfStudt;
		this.professor = professor;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCountOfStudt(int countOfStudt) {
		this.countOfStudt = countOfStudt;
		
	}
	
	public int getCountOfStudt() {
		return countOfStudt;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", countOfStudt=" + countOfStudt + ", professor=" + professor + "]";
	}
	
	

}
