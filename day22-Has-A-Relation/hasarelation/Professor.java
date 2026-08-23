package hasarelation;
// POJO - plain Old java object 

public class Professor {
	
	private String name;
	
	private int experience;
	
	private String subject;
	
	public Professor() {
		
	}
	
	public Professor(String name, int experience, String subject) {
		this.name= name;
		this.experience = experience;
		this.subject = subject;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", experience=" + experience + ", subject=" + subject + "]";
	}
	
	

}
