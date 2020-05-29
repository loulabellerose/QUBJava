package filesandstreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

	public static void main(String[] args) {
		try {
			String teamToAdd = "Wales";
			
			File file = new File("Teams.txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
		
		FileWriter fw = new FileWriter(file, true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(teamToAdd);
		bw.close();
		System.out.println("Write complete");
	} catch (IOException e) {
		e.printStackTrace();
		}
	}

}
