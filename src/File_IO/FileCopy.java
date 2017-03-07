package File_IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public void file_Write() throws IOException {
		
		FileWriter fw = new FileWriter("sonali.txt");
		fw.write("HI My name is Sonali");
		fw.close();
	}
	
}
