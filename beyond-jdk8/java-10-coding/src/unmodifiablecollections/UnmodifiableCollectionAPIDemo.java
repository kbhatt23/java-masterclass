package unmodifiablecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnmodifiableCollectionAPIDemo {

	public static void main(String[] args) {
		//usingCopyConstructor();
		//usingImmutableCollectionsUtil();
		usingImmutableStaticFactoryMethod();
	}

	private static void usingImmutableStaticFactoryMethod() {
		List<String> initialNames = new ArrayList<>();
		initialNames.add("sita ram");
		initialNames.add("radhe krishna");
		
		//read only copy + not backed copy, but deep copy
		List<String> unmodifiableList = List.copyOf(initialNames);
		//unmodifiableList.add("uma mahesh");
		System.out.println("first step initialNames: "+initialNames);
		System.out.println("first step names: "+unmodifiableList);
		
		initialNames.add("uma mahesh");
		
		System.out.println("second step initialNames: "+initialNames);
		System.out.println("second step names: "+unmodifiableList);
			
	}

	private static void usingImmutableCollectionsUtil() {
		List<String> initialNames = new ArrayList<>();
		initialNames.add("sita ram");
		initialNames.add("radhe krishna");
		
		//read only copy
		List<String> unmodifiableList = Collections.unmodifiableList(initialNames);
		//unmodifiableList.add("uma mahesh");
		System.out.println("first step initialNames: "+initialNames);
		System.out.println("first step names: "+unmodifiableList);
		
		initialNames.add("uma mahesh");
		
		System.out.println("second step initialNames: "+initialNames);
		System.out.println("second step names: "+unmodifiableList);
	}

	private static void usingCopyConstructor() {
		Set<String> initialNames = new HashSet<>();
		initialNames.add("sita ram");
		initialNames.add("radhe krishna");
		initialNames.add("radhe krishna");
		
		//deep copy
		List<String> names = new ArrayList<>(initialNames);
		names.add("uma mahesh");
		names.add("shree ganesha");
		System.out.println("first step initialNames: "+initialNames);
		System.out.println("first step names: "+names);
		
		initialNames.add("vamshi dhar");
		
		System.out.println("second step initialNames: "+initialNames);
		System.out.println("second step names: "+names);
	}
}
