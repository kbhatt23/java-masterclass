package fileoperations.niousage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import fileoperations.FileUtils;

public class FileWriterNIO {
	public static void main(String[] args) {
		Path path = Paths.get(FileUtils.ROOT_PATH + "niofilewrite.txt");
		List<String> lines = Arrays.asList("jai shree ram", "jai radhe shyam", "jai shyam sundar", "jai uma maheshwar");
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			for(String line: lines) {
				writer.write(line+"\n");	
			}
			
		} catch (IOException e) {
			System.err.println("excpetion occured while writing file " + e);
		}
	}
}
