package fileoperations.niousage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import fileoperations.FileUtils;

public class Pathusage {
public static void main(String[] args) {
	Path path = Paths.get(FileUtils.ROOT_PATH+"niocreate.txt");
	System.out.println(path.getRoot());
	System.out.println(Files.exists(path));
	System.out.println(Files.isDirectory(path));
	Path fakePAth = Paths.get("fakefile.txt");
	System.out.println(Files.exists(fakePAth));
	System.out.println(path.getName(1));
	
	try {
		Files.deleteIfExists(fakePAth);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Path relativeInfo = Paths.get("../../../fileoperations/employeesNio.txt");
	System.out.println(Files.exists(relativeInfo));
	System.out.println(relativeInfo.toAbsolutePath());
}
}
