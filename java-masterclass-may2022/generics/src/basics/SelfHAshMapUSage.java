package basics;

public class SelfHAshMapUSage {

	public static void main(String[] args) {
		SelfMap<Integer, String> selfHashMap = new SelfHashMap<>();
		
		System.out.println(selfHashMap.put(1, "one"));
		System.out.println(selfHashMap.put(1, "One"));
		System.out.println(selfHashMap.put(2, "two"));
		
		System.out.println(selfHashMap);
	}
}
