package filesandstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindWally {

	public static void main(String[] args) {
		
		String line;
		
		
		try {
			File file = new File("WarAndPeace.txt");
			FileReader fr = new FileReader(file.getName());
			BufferedReader br = new BufferedReader(fr);
			File output = new File("NoWallys.txt");
			FileWriter fw = new FileWriter(output.getName(), false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//1. Detect if “Wally” is found anywhere in the file.
			//2. Count how many times “Wally” is actually found in the file.
			//3. Output which line of the file the first occurrence of “Wally” is found.
			
			
			boolean found = false;
			int wallyCount = 0;
			int lineNumber = 1;
			int lineFirstWally = 1;
			//String newLine = "";
			
			line = br.readLine();
			while (line != null) {
				int wallysInLine = countWallysInLine(line);
				wallyCount += wallysInLine;
				if (!found && wallysInLine>0) {
					found = true;
					lineFirstWally = lineNumber;
					}
				if (wallysInLine>0) {
					line = removeWallysFromLine(line);
				}
				bw.write(line);
				bw.newLine();
				lineNumber++;
				line = br.readLine();
			}
			
			System.out.println("Number of times the word 'Wally' is found in " + file.getName() + ": " + wallyCount);
			System.out.println("First line on which the word appears " + lineFirstWally);
						
			//4. Write a new file with all occurrences of “Wally” removed.
			bw.flush();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			
			} catch(IOException e) {
			e.printStackTrace();
			}
	
	}
	
	public static int countWallysInLine(String line) {
		int wallyCount = 0;
		while (line.indexOf("Wally")!=-1) {
			wallyCount++;
			line = line.substring(line.indexOf("Wally")+5, line.length());
		}
		return wallyCount;
	}
	
	public static String removeWallysFromLine(String line) {
		//do this until there are no Wallys remaining
		while (line.indexOf("Wally")!= -1) {
			line = line.substring(0,line.indexOf("Wally")) + //gets the string value up to the occurrence of Wally
					line.substring(line.indexOf("Wally")+5, line.length());//get the rest of the string after Wally
		}
		return line;
	}

	

}
