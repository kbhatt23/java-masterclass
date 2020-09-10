package fileoperations;

import java.util.Arrays;

public class StringSplit {
public static void main(String[] args) {
	String ka = "C:/Kanishk/learning/fileoperations/filevisitor/lapela";
	String targetRoot = "C:/Kanishk/learning/fileoperations/filevisitor_copy";
	String[] la = ka.split("/");
	String last=null;
	for(String l: la) {
		last = l;
	}
	System.out.println(last);
	
	System.out.println(ka.substring("C:/Kanishk/learning/fileoperations/filevisitor".length()));
	String kama = "12.21.44.55.66";
	String[] splits = kama.split("\\.");
	Arrays.stream(splits).forEach(System.out::println);
}
}
