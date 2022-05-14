//create directory based on this
package org.learning;

import java.util.Arrays;
import java.util.stream.Collectors;
public class MergeUtil{
	
	public String merge(String... inputs){
		System.out.println("MergeUtil: input recieved with size: "+inputs.length);

		//part of java.lang package and hence no need to import
		StringBuilder sb = new StringBuilder();
		
		// Arrays and collectors not part of java.lang and hence need to import
		 String a = Arrays.stream(inputs)
			.collect(Collectors.joining(","));
		
		sb.append(a);
		return sb.toString();
	}
}