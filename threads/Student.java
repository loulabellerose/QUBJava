package sem2week8practical;

/**
 * Create a class “Student” that will hold details such as 
 * first / last name, 
 * age and a student number. 
 * @author louiserosehamerston
 *
 */

public class Student {
	private String firstName, lastName;
	private int studentNo, age;
	
	
	public Student() {
		
	}
	
	public Student (String firstName, String lastName, int studentNo, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNo = studentNo;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirsName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.studentNo + " " + this.age + " yrs old\n";			
	}
}

