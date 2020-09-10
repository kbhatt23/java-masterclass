package fileoperations.niousage;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ComplexReading {
public static void main(String[] args) {
	Path relativeInfo = Paths.get("../../../fileoperations/employeesNio.txt");
	if(Files.exists(relativeInfo)) {
		System.out.println("================printing file=============");
		try(BufferedReader reader  = Files.newBufferedReader(relativeInfo)){
		}catch (IOException e) {
			System.err.println("Exception occurred while reading file "+e);
		}
		
	}
	
	Path copyPAthdirectory = Paths.get("../../../fileoperations/custom");
	try {
		if(Files.notExists(copyPAthdirectory)) {
			Files.createDirectories(copyPAthdirectory);
		}
		Files.copy(relativeInfo, Paths.get(copyPAthdirectory.toAbsolutePath().toString(),"employeesNioNew.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//rename code
	Paths.get(copyPAthdirectory.toAbsolutePath().toString(),"employeesNioNew.txt");
	try {
		Files.copy(Paths.get(copyPAthdirectory.toAbsolutePath().toString(),"employeesNioNew.txt"), Paths.get(copyPAthdirectory.toAbsolutePath().toString(),"employeesNioNewmoved.txt"));
		Files.deleteIfExists(Paths.get(copyPAthdirectory.toAbsolutePath().toString(),"employeesNioNew.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
