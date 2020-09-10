package fileoperations.niousage;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathiteration {
public static void main(String[] args) {
	Path path = Paths.get("C:/Kanishk/learning");
	for(Path p:path) {
		System.out.println(p.getFileName());
	}
	
	System.out.println("=====================");
	try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
		stream.forEach(f -> System.out.println(f.getFileName()));
	}catch (IOException e) {
		System.err.println("exception occurred while iterating path "+e);
	}
}
}
