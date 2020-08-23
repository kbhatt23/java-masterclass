package helloworld;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
	//public static void main(String... args) {
		//possible in java thats why this structure of method works
		String[] convertedArgs = args;
		
		HelloWorld obj = new HelloWorld();
		System.out.println("jai shree ram from "+obj.getClass().getName());
		System.out.println("recieved args object "+convertedArgs+" with size "+convertedArgs.length);
		Arrays.stream(args).forEach(System.out::println);
		int customVariable =(23+6)*3;
		System.out.println("customCariable "+customVariable);
	}
}
