package fileoperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileUtils {

	public static final String ROOT_PATH = "C:/Kanishk/learning/fileoperations/";

	public static void copyDirectoryRecursively(Path source, Path target) {
		/*
		 * try { Files.createDirectories(target); } catch (IOException e) {
		 * System.out.println("Error creating target directory "+e); }
		 */

		try {
			Files.walkFileTree(source, new CopyDirectoryVisitor(target, source));
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}

class CopyDirectoryVisitor extends SimpleFileVisitor<Path> {
	private Path target;
	private Path source;

	public CopyDirectoryVisitor(Path target, Path source) {
		this.target = target;
		this.source = source;
	}

	// on each pre isti directory we can creat directory if do not exist
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		String ka = source.toAbsolutePath().toString();
		String[] la = ka.split("\\\\");
		String last = null;
		for (String l : la) {
			last = l;
		}
		// if(!dir.getFileName().toString().equals(last)) {
		// String newFileName =
		// dir.toAbsolutePath().toString().substring(source.toAbsolutePath().toString().length());
		// Path pathDirNEw = Paths.get(target.toAbsolutePath().toString()+newFileName);
		Path pathDirNEw = target.resolve(source.relativize(dir));
		System.out.println("creating directory with path " + pathDirNEw);
		Files.createDirectory(Paths.get(pathDirNEw.toAbsolutePath().toString()));
		// }
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

		// String newFileName =
		// file.toAbsolutePath().toString().substring(source.toAbsolutePath().toString().length());
		// Path newFilePAth = Paths.get(target.toAbsolutePath().toString()+newFileName);
		// using reoslve and relativizing
		Path newFilePAth = target.resolve(source.relativize(file));
		System.out.println(
				"Copying from " + file.toAbsolutePath().toString() + " to " + newFilePAth.toAbsolutePath().toString());
		Files.copy(file, newFilePAth);
		return FileVisitResult.CONTINUE;
	}
}
