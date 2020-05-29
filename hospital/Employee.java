package uk.ac.qub.s2w5.practicals.hospital;

public class Employee {
	private String firstName;
	private String lastName;
	private double baseRate;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	public double getBaseRate() {
		return baseRate;
	}
	
	public double calculateWeeklySalary(double hours) {
		return hours*this.baseRate;
	}
	
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2fp/hr",this.getClass().getSimpleName(),this.firstName, this.lastName, this.baseRate);
	}

}
