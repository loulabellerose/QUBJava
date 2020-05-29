package sem2week8practical;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class University {
	
	public static void main(String[] args) {
		/*Create two ArrayLists that will represent two classes in a 
		 * university year group
		 */
		
		ArrayList<Student> programmingClass = new ArrayList<Student>();
		ArrayList<Student> testingClass = new ArrayList<Student>();
		
		//Create some students objects and add these to the programmingClass. 
		Student student1 = new Student("Louise", "Hamerston", 40245759, 31);
		Student student2 = new Student("Neil", "Montgomery", 40245760, 41);
		programmingClass.add(student1);
		programmingClass.add(student2);
		
		//Create some more student objects and add these to the testingClass.
		Student student3 = new Student("John", "Cunningham", 40245761, 29);
		Student student4 = new Student("Phillip", "McKenna", 40245762, 34);
		testingClass.add(student3);
		testingClass.add(student4);
		
		//Create some more student objects and add these to BOTH classes. 
		Student student5 = new Student("Rachel", "Ferres", 40245763, 28);
		Student student6 = new Student("Johnnie", "Wilkinson", 40245764, 32);
		programmingClass.add(student5);
		programmingClass.add(student6);
		testingClass.add(student5);
		testingClass.add(student6);
		
		writeFile(merge(programmingClass, testingClass));
		}
	
	/**
	 * Create a method that will take both of these lists and return a 
	 * new list that is the merge of the inputs. The resulting list 
	 * however should have no duplicates. 
	 */
	
	public static ArrayList<Student> merge(ArrayList<Student> programmingList, ArrayList<Student> testingList){
		ArrayList<Student> classList = new ArrayList<Student>();
		
		classList = programmingList;
		for(Student student: testingList) {
			if (!classList.contains(student)) {
				classList.add(student);
			}
		}

		return classList;
	}
	
	public static void writeFile(ArrayList<Student> students) {
		try { 
			File output = new File("class_report.txt");
			if(!output.exists()) {
				output.createNewFile();}
			FileWriter fw = new FileWriter(output);
			BufferedWriter bw = new BufferedWriter(fw);
			//format the student details and write to the file here. 
			bw.write(students.toString());
			bw.close();
			} catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
	}
}
