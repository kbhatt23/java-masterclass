package fileoperations.randomacessfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import fileoperations.FileUtils;

public class FilesStaticMethods {
	public static void main(String[] args) {
		// List<String> lines = Arrays.asList("jai shiva", "jai ramaduta hanuman");
		List<String> lines = Arrays.asList("jai shree ram", "jai radhe shyam", "jai shyam sundar", "jai uma maheshwar");
		Path path = Paths.get(FileUtils.ROOT_PATH + "staticFile.txt");
		try {
			// Files.write(path, lines , StandardOpenOption.APPEND);
			Files.write(path, lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Files.readAllLines(path).stream().forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
