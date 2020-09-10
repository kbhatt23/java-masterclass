package fileoperations.randomacessfile;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import fileoperations.FileUtils;

//we assumed number of chars per line is fixed
//like in array  and it helps in finding a line in o(1) time complexity
//unlike simple file whihc do it sequentially in O(n)
public class RandomAccessFileUsage {
	public static void main(String[] args) {
		String fileName  =FileUtils.ROOT_PATH+"randomaccess.txt";
		
		//writng first
		//all line sshud be of smae length
		String a = "jaishreeram"; String b = "jairadhajai"; String c = "jai keshava";String d = "jiumasankar";
		List<String> lines= Arrays.asList(a,b,c,d);
		//lines.forEach(line -> writeRandomfile(line, 1, a.length(), fileName));
		int index = 1;
		for(String line :lines) {
			writeRandomfile(line, index, line.length(), fileName);
			index++;
		}
		writeRandomfile(a, 1, a.length(), fileName);
		System.out.println("fetching line "+findRandomAccesedLines(fileName, 1, 5, a.length()));
	}

	private static String findRandomAccesedLines(String fileName, int startLine, int endLine, int bytesPerLine) {
		if (startLine <= 0) {
			System.err.println("Start lines starts wtih 1");
			return null;
		}
		// adding chars for \n
		bytesPerLine += 2;
		// reducing indexes for usage of array , also first line byute shud be 0 as it
		// chars in first line starts with 0
		startLine--;
		endLine--;
		List<String> allLines = new ArrayList<String>();
		try(RandomAccessFile rFile = new RandomAccessFile(fileName, "rw")){
		for(; startLine <=endLine ; startLine++) {
			int position = startLine*bytesPerLine;
			rFile.seek(position);
			//allLines.add(rFile.readLine());
			//as we stored in code using utf
			//if we use read line it wont work as utf format converts the chars
			allLines.add(rFile.readUTF());
		}
		}catch (Exception e) {
			System.err.println("Exception occurred while reading "+e);
		}
		if(allLines.isEmpty()) {
			return null;
		}else{
			return allLines.stream().collect(Collectors.joining(","));
		}
	}
	
	private static void writeRandomfile(String line, int startLine, int bytesPerLine,String fileName) {
		//adding chars \n
		bytesPerLine+=2; 
		//for first line start char byte is 0 actually -> just like arrays
		startLine--;
		//insertion at start line
		int positionTowrite = startLine*bytesPerLine;
		
		try(RandomAccessFile rFile = new RandomAccessFile(fileName, "rw")){
			rFile.seek(positionTowrite);
			rFile.writeUTF(line);
		}catch (Exception e) {
			System.out.println("Exception occured while writing "+e);
		}
	}
}
