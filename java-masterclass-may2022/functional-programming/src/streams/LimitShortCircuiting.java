package streams;

import java.util.Arrays;
import java.util.List;

public class LimitShortCircuiting {

	private static final int BREAK_COUNT = 2;
	public static void main(String[] args) {
		// shortcircuit means
		// if one condition is met no need to process other remaining elements
		List<String> names = Arrays.asList("sita rama", "lakshman hanuman", "fake ", "joke");
		shortCircuitLoop(names);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=");
		shortCircuitStream(names);
	}

	private static void shortCircuitStream(List<String> names) {
		
		names.stream()
		     .limit(BREAK_COUNT)
		     .map(LimitShortCircuiting :: upperCase)
		     .forEach(i -> System.out.println("shortCircuitStream.element: "+i));
	}

	private static void shortCircuitLoop(List<String> names) {
		for(int i = 0 ; i < names.size() ; i++) {
			if(i == BREAK_COUNT) {
				break;
			}
			System.out.println("shortCircuitLoop.element: "+ upperCase(names.get(i)));
			
		}
	}

	private static String upperCase(String str) {
		System.out.println("doing uppercase for " + str);
		return str.toUpperCase();
	}
}
