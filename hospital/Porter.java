package uk.ac.qub.s2w5.practicals.hospital;

public class Porter extends Employee{
	private String site;
	
	public Porter() {
		
	}
	
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}
	
	public void setSite(String site) {
		this.site = site;
	}
	
	public String getSite() {
		return site;
	}
	
	public void printAll() {
		super.printAll();
		System.out.print("\tSite: " + this.site);	
	}

}
