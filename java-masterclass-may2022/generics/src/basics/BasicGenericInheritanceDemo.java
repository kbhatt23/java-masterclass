package basics;

public class BasicGenericInheritanceDemo {

	public static void main(String[] args) {
		Container<String> store = new StoreString();

		// wont work
		// Container<Number> number = new StoreString();

		Container<Number> numberStore = new Store<Number>();

		// typed child wont work unlike arrays
		// Container<Number> numberStore1 = new Store<Integer>();

		numberStore.set(Integer.valueOf(23));

		Number a = numberStore.get();
		System.out.println(a);

		// possible but no good thing
		// better
		if (a instanceof Integer) {
			Integer b = (Integer) a;
			System.out.println(b);
		}
	}
}
