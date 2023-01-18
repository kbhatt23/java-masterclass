package streams;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public class CustomCollectorDemo2 {

	public static void main(String[] args) {
		
		String[] chars = {"A","B", "C" , "D"};
		
		Collector<String, StringBuilder, String> appendCollector = 
				Collector.of(StringBuilder :: new,
						(storage,item) -> storage.append(item)
						, StringBuilder :: append, 
						StringBuilder :: toString
						, Characteristics.CONCURRENT
						);
		
		String result=  Arrays.stream(chars)
		.collect(appendCollector);
		
		System.out.println(result);
	}
}
