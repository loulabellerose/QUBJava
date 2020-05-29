package sem2week8practical;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentAdmin {

	public static void main(String[] args) {
		/*Create an ArrayListcalled studentList that allows 
		 * for the adding of the new Student class. 
		 * Instantiate a number of student objects and add them into the ArrayList. 
		 * This studentList can be used to model a programming class 
		 * of software developers. 
		 */
		Student student1 = new Student("Louise", "Hamerston", 40245759, 31);
		Student student2 = new Student("Neil", "Montgomery", 40245760, 41);
		Student student3 = new Student("John", "Cunningham", 40245761, 29);
		Student student4 = new Student("Phillip", "McKenna", 40245762, 34);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		printStudents(studentList);
		int av = averageAge(studentList);
		filterClass(studentList,av);
		
		
	}
	
	/*Create a method called printStudents, that takes as an argument 
	 * the ArrayList of studentsand have it print out the details 
	 * in a readable format. For this you may override toStringin your student class.
	 */
	public static void printStudents(ArrayList<Student> studentList) {
		/*
		for (Student student : studentList) {
			System.out.println(student);
		}
		*/
		
		Iterator<Student> i = studentList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}		
	}
	/**
	 * Create a method called averageAge, which
	 * will take in the list of students and compute 
	 * and output the average age of the programming class. 
	 * @param studentList
	 * @return
	 */
	public static int averageAge(ArrayList<Student> studentList) {
		int total = 0;
		for(Student student: studentList) {
			total += student.getAge();
		}
		return total/studentList.size();
	}
	
	/**
	 * Now create a method that will take the list of students 
	 * and the average age of the student list and have it filter 
	 * out people who are below the average age. 
	 * @param filterList
	 * @param averageAge
	 * @return
	 */
	public static ArrayList<Student> filterClass(ArrayList<Student> studentList, int averageAge){
		/*Create another ArrayListwithin your method that 
		 * will represent the students that are above 
		 * the average age 
		 
		ArrayList<Student> aboveAverage  = new ArrayList<Student>();
		
		for (Student student: studentList) {
			if (student.getAge() < averageAge) {
				aboveAverage.add(student);
			}
		}
		*/
		
		Iterator<Student> it = studentList.iterator();
		//cycle through the elements of studentList and test if they are below the age boundary
		
		while (it.hasNext()) {
			if (it.next().getAge() < averageAge) {
				it.remove();
			}
		}
		
		//return aboveAverage;
		return studentList;
	}

}
