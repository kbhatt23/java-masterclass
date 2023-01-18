package methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencingDemo {

	private int id;
	
	private String name;

	public ConstructorReferencingDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public ConstructorReferencingDemo() {
	}

	public ConstructorReferencingDemo(String name) {
		this.name = name;
	}

	public ConstructorReferencingDemo(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ConstructorReferencingDemo [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		//Supplier<ConstructorReferencingDemo> supplier = () -> new ConstructorReferencingDemo();
		
		Supplier<ConstructorReferencingDemo> supplier = ConstructorReferencingDemo :: new;
		System.out.println(supplier.get());
		
		Function<Integer, ConstructorReferencingDemo> func1 = ConstructorReferencingDemo :: new;
		System.out.println(func1.apply(23));
		
		Function<String, ConstructorReferencingDemo> func2 = ConstructorReferencingDemo :: new;
		System.out.println(func2.apply("madhav"));
		
		BiFunction<Integer, String, ConstructorReferencingDemo> bifunc = ConstructorReferencingDemo :: new;
		
		System.out.println(bifunc.apply(108, "laxmi narayan"));
	}
}
