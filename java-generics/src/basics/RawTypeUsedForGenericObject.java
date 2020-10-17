package basics;

import java.util.ArrayList;
import java.util.List;

public class RawTypeUsedForGenericObject {
public static void main(String[] args) {
	List<String> strings = new ArrayList<String>();
	strings.add("sita ram");
	strings.add(" jai sita ram");
	//strings.add(108);
	modify(strings);
	for(String str: strings) {
		System.out.println(str);
	}
}
static void modify(List rawType) {
	rawType.add(108);
}
}
