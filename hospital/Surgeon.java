package uk.ac.qub.s2w5.practicals.hospital;

public class Surgeon extends Employee implements AdministerDrugs {
	private String specialistArea;
	private double consultationFee;
	
	public Surgeon() {
	}
	
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}
	
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}
	
	public String getSpecialistArea() {
		return specialistArea;
	}
	
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	public double getConsultationFee() {
		return consultationFee;
	}
	
	@Override
	public double calculateWeeklySalary(double hours) {
		return (this.getBaseRate()*hours) + this.consultationFee;
	}
	
	public void printAll() {
		super.printAll();
		System.out.printf("\tSpecialist Area:  %-20s \tConsultation Fee: £%-20.2f ", this.specialistArea, this.consultationFee);
	}
	
	@Override
	public boolean adminControlledDrug() {
		return false;
	}
	
	@Override
	public boolean adminNonControlledDrug() {
		return true;
	}

}
