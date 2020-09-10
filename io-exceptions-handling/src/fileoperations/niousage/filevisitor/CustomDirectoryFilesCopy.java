package fileoperations.niousage.filevisitor;

import java.nio.file.Path;
import java.nio.file.Paths;

import fileoperations.FileUtils;

public class CustomDirectoryFilesCopy {
public static void main(String[] args) {
	//trying with basic way
	//but it only create directory and do not copy the internal files and subdirectories
	Path source = Paths.get("C:/Kanishk/learning/fileoperations/filevisitor");
	Path target = Paths.get("C:/Kanishk/learning/fileoperations/filevisitor_copy");
	
	FileUtils.copyDirectoryRecursively(source, target);
	//try {
		//Files.copy(source, target);
	//} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	
	//we cna use walk file tree vistor class to create directory and files recursively
}
}
