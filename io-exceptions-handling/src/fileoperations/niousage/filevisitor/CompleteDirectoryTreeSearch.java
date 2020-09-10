package fileoperations.niousage.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CompleteDirectoryTreeSearch {
public static void main(String[] args) {
	try {
		Files.walkFileTree(Paths.get("C:\\Kanishk\\learning\\fileoperations\\filevisitor"), new JustVisitAll());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
class JustVisitAll extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Visitng file "+file.getFileName());
		return super.visitFile(file, attrs);
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("Pre Visitng directory "+dir.getFileName());
		return super.preVisitDirectory(dir, attrs);
	}
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Post Visitng directory "+dir.getFileName());
		return super.postVisitDirectory(dir, exc);
	}
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("exception occured while Visitng file "+file.getFileName());
		return super.visitFileFailed(file, exc);
	}
	
}
