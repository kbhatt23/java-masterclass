package fileoperations.niousage;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamGlobsUsage {
	public static void main(String[] args) {
		Path path = Paths.get("C:/Kanishk/learning");
		//adding filter so that all the files are picked and directories are ignored
		DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(path,filter)){
			for(Path currentPath : stream) {
				System.out.println(currentPath.getFileName());
			}
		}catch (IOException e) {
			System.err.println("Exception occurred while iterating directory "+e);
		}
		
		//file seperator
		System.out.println("basic file seperator "+File.separator);
		System.out.println("OS bsaed seperator "+FileSystems.getDefault().getSeparator());
	}
}
