package uk.ac.qub.s2w5.practicals.hospital;

public class PayrollManager {
	public static double HOURS_PER_WEEK = 35;
	public static Employee[] employees = new Employee[6];
	
	public static void main(String[] args) {
		Porter emp1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		addEmployeeToList(emp1);
		Porter emp2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		addEmployeeToList(emp2);
		Surgeon emp3 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650);
		addEmployeeToList(emp3);
		Surgeon emp4 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800);
		addEmployeeToList(emp4);
		Pharmacist emp5 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750);
		addEmployeeToList(emp5);
		
		displayAllEmployees();
		System.out.println();
		processWeeklyPayroll();
		System.out.println();
		surgeonAdminDrugs(emp3);
		System.out.println();
		pharmaAdminDrugs(emp5);
		
		
		
	}
	//Method to add an employee to the array
	public static void addEmployeeToList(Employee emp){
		for(int loop = 0; loop < employees.length; loop++) {
			if(employees[loop] == null){
				employees[loop] = emp;
				break;
			}
		}
	}
	
	//Method to calculate all employees' pay
	public static void processWeeklyPayroll() {
		System.out.println("Payroll Run___________________________________");
		for (Employee e: employees) {
			//check if the array index is not null
			if (e!=null) {
				System.out.printf("%-10s %-10s %s * £%.2f = £%.2f\n", e.getFirstName(),e.getLastName(), HOURS_PER_WEEK, e.getBaseRate(), e.calculateWeeklySalary(HOURS_PER_WEEK));
			}
		}
		System.out.print("Total employees in system: " );
		//calculates number of employee elements in the array
		int employeeCount = 0;
			for(int loop = 0; loop<employees.length; loop++) {
				if(employees[loop] !=null) {
					employeeCount++;
				}
			}
		System.out.print(employeeCount + "\n");
	}
	//Method to print to screen all employee information
	public static void displayAllEmployees() {
		System.out.println("\nDisplay all employees_________________________");
		for(Employee e: employees) {
			//check if the array is not null
			if (e!=null){
				e.printAll();
				System.out.println();
			}
		}
		System.out.print("Number of records processed: " );
		//calculates number of employee elements in the array
		int employeeCount = 0;
			for(int loop = 0; loop<employees.length; loop++) {
				if(employees[loop] !=null) {
					employeeCount++;
				}
			}
		System.out.print(employeeCount + "\n");
	}
	
	//Method to test AdministerDrugs interface
	public static void surgeonAdminDrugs(Surgeon s) {
		System.out.println("Surgeon: administer controlled drug: " + s.adminControlledDrug());
		System.out.println("Surgeon: administer controlled drug: " + s.adminNonControlledDrug());
	}
	
	//Method to test AdministerDrugs interface
	public static void pharmaAdminDrugs(Pharmacist p) {
		System.out.println("Pharmacist: administer controlled drug: " + p.adminControlledDrug());
		System.out.println("Pharmacist: administer controlled drug: " + p.adminNonControlledDrug());
	}
	
}
