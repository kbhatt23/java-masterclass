package fileoperations.randomacessfile;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fileoperations.FileUtils;

//this class supports file with lines of random size
//unlike normal randomaccessfile
public class RandomAccessLinesRandomLength implements findPosition {
	// key will be index / linenumber of file and vlaue will be lenght of chars in
	// that line
	private static Map<Integer, Integer> lengthMap = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		String fileName = FileUtils.ROOT_PATH + "randomaccess.txt";
		List<String> lines = Arrays.asList("jai shree ram", "jai radhe shyam", "jai shyam sundar", "jai uma maheshwar");
		int n = 1;
		for (String line : lines) {
			writeLine(line, n, fileName);
			n++;
		}
		//System.out.println(lengthMap);
		
		System.out.println(readLines(fileName, 3, 5));

	}

	private static void writeLine(String line, int lineNumber, String fileName) {
		if (lineNumber <= 0) {
			System.err.println("line number can not be negative or 0");
			return;
		}

		lineNumber--;
		try (RandomAccessFile rFile = new RandomAccessFile(fileName, "rw")) {
			//assuming that we always insert at a new position
				int positionChars = findPosition(lineNumber);
				rFile.seek(positionChars);
				rFile.writeUTF(line);
				// appending \n size also
				lengthMap.put(lineNumber, line.length() + 2);
		} catch (Exception e) {
			System.err.println("exception occurred while writing file " + e);
		}
	}

	private static int findPosition(int lineNumber) {
		int positionChars = 0;
		for (int i = 0; i < lineNumber; i++) {
			positionChars += lengthMap.get(i);
		}
		return positionChars;
	}

	private static String readLines(String fileName, int startLine, int endLine) {
		startLine--;
		endLine--;
		List<String> lines = new ArrayList<String>();
		try (RandomAccessFile rFile = new RandomAccessFile(fileName, "rw")) {

			for (int i = startLine; i <= endLine; i++) {
				int charPosition = findPosition(i);
				rFile.seek(charPosition);
				lines.add(rFile.readUTF());
			}
		} catch (Exception e) {
			System.err.println("exception occurred while reading file " + e);
		}

		if (lines.isEmpty()) {
			return null;
		} else {
			return lines.stream().collect(Collectors.joining(","));
		}
	}
}
