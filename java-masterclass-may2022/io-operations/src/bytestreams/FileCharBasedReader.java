package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//not optimized
// this is child of inputstream used to read/write from bbinary represented files like image
public class FileCharBasedReader {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			String fileName = "files/google-logo.png";
			String copyFileName = "files/google-logo-copy.png";
			byte[] readBinaryImageFile = readBinaryImageFile(fileName);
			createNewFile(readBinaryImageFile, copyFileName);

		}
		long end = System.currentTimeMillis();
		System.out.println("total time taken " + (end - start));

	}

	private static void createNewFile(byte[] readBinaryImageFile, String copyFileName) {

		try (FileOutputStream stream = new FileOutputStream(copyFileName)) {
			stream.write(readBinaryImageFile);
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static byte[] readBinaryImageFile(String fileName) {

		try (FileInputStream stream = new FileInputStream(fileName)) {
			int available = stream.available();
			byte[] storage = new byte[available];
			stream.read(storage);
			System.out.println("file read with size: " + available);
			return storage;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}
}
