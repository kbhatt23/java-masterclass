package fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUSage {
public static void main(String[] args) {
	try(FileWriter fw = new FileWriter(FileUtils.ROOT_PATH+"kangla.txt")) {
		
		fw.write("jai radha madhav ");
		//fw.append("\n jai shree ram");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	/*finally {
		if(fw != null) {
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}*/
}
}
