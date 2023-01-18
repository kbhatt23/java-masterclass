package methodreferences;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class TypesOfMethodReference {
	
	private String name;

	public TypesOfMethodReference() {
		super();
	}

	public TypesOfMethodReference(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		TypesOfMethodReference typesOfMethodReference = new TypesOfMethodReference();

		typesOfMethodReference.type1();
		
		typesOfMethodReference.type2();
		
		typesOfMethodReference.type3();
	}

	private void type3() {
		TypesOfMethodReference typesOfMethodReference = new TypesOfMethodReference();
		
		BiFunction<String, String, Boolean> type = typesOfMethodReference :: equals;
		
		Stream<TypesOfMethodReference> objStream = Stream.of("sita ram", "radhe shyam", "fake killa").map(TypesOfMethodReference :: new);
		
	}
	private boolean isValid(TypesOfMethodReference obj) {
		return obj.name.contains("sita") || obj.name.contains("radhe");
	}
	private boolean equals(String a, String b) {
		return a.equals(b);
	}

	private void type2() {
		TypesOfMethodReference obj = new TypesOfMethodReference();
		
		Function<String, String> lowerCaseFunction = obj :: lowerCase;
		
		//Consumer<String> checkEmptyConsumer = obj :: checkIfEmpty;
		Consumer<String> checkEmptyConsumer = this :: checkIfEmpty;
		
		
		checkEmptyConsumer.accept(lowerCaseFunction.apply("hello"));
	}

	// static method auto referred
	// remember method and constructor reference are applicable only for functional
	// interface target type , just ike lambda
	// better cleaner compact lambda replacement
	private void type1() {
		//Consumer<String> printConsumer = str -> print(str);
		Consumer<String> printConsumer = TypesOfMethodReference :: print;
	
		//Function<String, String> upperCasefunction = str -> upperCase(str);
		//Function<String, String> upperCasefunction = TypesOfMethodReference :: upperCase;
		
		UnaryOperator<String> upperCasefunction = TypesOfMethodReference :: upperCase;
		
		printConsumer.accept(upperCasefunction.apply("jai shree sita rama lakshman hanuman"));
	}

	private static void print(String message) {
		System.out.println("print: " + message);
	}
	

	private static String upperCase(String message) {
		return message.toUpperCase();
	}
	
	private String lowerCase(String input) {
		return input.toLowerCase();
	}
	
	private void checkIfEmpty(String str) {
		System.out.println("checkIfEmpty: "+(str == null && str.isEmpty()));
	}
	
}
