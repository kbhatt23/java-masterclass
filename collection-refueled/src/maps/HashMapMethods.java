package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
	public static void main(String[] args) {
		Map<Integer, String> mapTest = new HashMap<Integer, String>();
		mapTest.put(1, "one");
		mapTest.put(2, "two");
		mapTest.put(2, "two updated");

		System.out.println(mapTest);

		Map<Integer, String> mapTestCopy = new HashMap<Integer, String>(mapTest);
		mapTestCopy.put(3, "three");
		mapTestCopy.put(2, "two from copy map");

		// put all will merge like a union set
		// all common key will repeat only once and it will get overriden by passing map

		System.out.println(mapTest);

		System.out.println(mapTestCopy);

		mapTest.putAll(mapTestCopy);

		System.out.println(mapTest);

		System.out.println(mapTestCopy);
		System.out.println("get non present key "+mapTest.get(23));
		System.out.println("getorDefault non present key "+mapTest.getOrDefault(23, "jai sita ram"));

	}
}
