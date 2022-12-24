package collectionutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class CollectionsAddAll {
	private static final String[] narayanNames = {"lakshmi narayan", "sita ram", "radhe krishna", "lakshmi narasimha"};
	public static void main(String[] args) {
		Random random = new Random();
		
		
		
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 100 ; i++) {
			List<String> input = new ArrayList<>();
			String[] additions = new String[100000];
			for(int a = 0, len = additions.length ; a < len ; a++) {
				additions[i]  = narayanNames[random.nextInt(4)];
			}
			usingCollectionListCopy(input, additions);
		
		}
		long end = System.currentTimeMillis();
		System.out.println("C.aslist time taken "+(end-start));
		
		 start = System.currentTimeMillis();
		for(int i = 0 ; i < 100 ; i++) {
			List<String> input = new ArrayList<>();
			String[] additions = new String[100000];
			for(int a = 0, len = additions.length ; a < len ; a++) {
				additions[i]  = narayanNames[random.nextInt(4)];
			}
			usingCollectionsUtil(input, additions);
		
		}
		 end = System.currentTimeMillis();
		System.out.println("Arrays.aslist time taken "+(end-start));
	}

	private static void usingCollectionListCopy(List<String> input, String[] additions) {
		input.addAll(Arrays.asList(additions));
	}
	
	private static void usingCollectionsUtil(List<String> input, String[] additions) {
		Collections.addAll(input, additions);
	}
}
