package fileoperations;

import java.io.File;

public class ListDirectory {
public static void main(String[] args) {
	String filePath = "C:/Kanishk/learning/fileoperations/filevisitor";
	
	iterateFiles(new File(filePath));
	
}

private static void iterateFiles(File file) {
	System.out.println("================="+"started listing directory "+file.getName()+"=================");
	File[] listFiles = file.listFiles();
	for(File f : listFiles) {
		if(f.isDirectory()) {
			iterateFiles(f);
		}else {
			System.out.println("file found "+f.getName());
		}
	}
	System.out.println("================="+"ended listing directory "+file.getName()+"=================");
}
}
