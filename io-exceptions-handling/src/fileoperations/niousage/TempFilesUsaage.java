package fileoperations.niousage;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempFilesUsaage {
public static void main(String[] args) {
	try {
		Path createTempFile = Files.createTempFile("kapela", ".fakefile");
		System.out.println("Crated tmep file "+createTempFile.toAbsolutePath());
		
		Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
		for(FileStore store: fileStores) {
			System.out.println(store+" : "+store.getTotalSpace());
		}
		System.out.println("===========");
		
		Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
		for(Path pa : rootDirectories) {
			System.out.println(pa);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
