package fileoperations.niousage.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorUsage {
public static void main(String[] args) {
	
	Path start = Paths.get("C:\\Kanishk\\learning\\fileoperations\\filevisitor");
	try {
		Files.walkFileTree(start, new ClassPathRemovalVisitor());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

class ClassPathRemovalVisitor extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("visitng file "+file.getFileName());
		if(file.getFileName().toString().endsWith(".class")) {
			System.err.println("removing class with name "+file.getFileName());
			Files.delete(file);
		}
		return FileVisitResult.CONTINUE;
	}
}
