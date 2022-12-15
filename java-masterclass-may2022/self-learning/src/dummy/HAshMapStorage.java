package dummy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HAshMapStorage {

	public static void main(String[] args) {
		String[] cmd = new String[1];
		cmd[0] = "C:/Kanishk/learning/java-masterclass/java-masterclass/java-masterclass-may2022/self-learning/src/dummy/File.java";
		try {
			Process exec = Runtime.getRuntime().exec(cmd);
			
			System.out.println("welcome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
