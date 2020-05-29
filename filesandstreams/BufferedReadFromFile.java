package filesandstreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadFromFile {

	public static void main(String[] args) {
		
		String line;
		try {
			//create a file object
			File file = new File("Teams.txt");
			//create a file reader object relating to the file
			FileReader filereader = new FileReader(file.getParent());
			//Note - using BufferWriter is more efficient with multiple write to file
			BufferedReader bufferReader = new BufferedReader(filereader);
			//read the contents
			line = bufferReader.readLine();
			while(line!= null) {
				System.out.println(line);
				line = bufferReader.readLine();
			}
			//close all resources
			bufferReader.close();
			filereader.close();
			System.out.println("File end....");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
