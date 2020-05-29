package uk.ac.qub.s2w5.practicals.hospital;

public class Pharmacist extends Employee implements AdministerDrugs {
	private int grade;
	private double bonus;

	public Pharmacist() {
		
	}
	
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	@Override
	public double calculateWeeklySalary(double hours) {
		return (this.getBaseRate()*hours) + this.bonus;
	}
	
	public void printAll() {
		super.printAll();
		System.out.printf("\tGrade: %-20s \t\tBonus: £%.2f",this.grade, this.bonus);
	}
	
	@Override
	public boolean adminControlledDrug() {
		return true;
	}
	
	@Override
	public boolean adminNonControlledDrug() {
		return true;
	}
}
