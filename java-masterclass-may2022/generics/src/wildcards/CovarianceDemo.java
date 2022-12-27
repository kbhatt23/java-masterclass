package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2 ways of covariance
// using bounded/unbounded wildcards : also ensure compiler check on mutating methods that can corrupt data
//-> methods that take argument type as generic clas level type defined
// second is using bounded method level generics : but can corrupt data
public class CovarianceDemo {

	public static void main(String[] args) {
		List<GenericsParent> parents = new ArrayList<>();
		parents.add(new GenericsParent("simple"));
		parents.add(new ChildWorker("simple-worker", 101d));

		invariance(parents);
		System.out.println("final parents " + parents);

		// below invariance is nto allowed to be safe from data corruption and
		// runtimeexception during classcast

		List<ChildWorker> workers = new ArrayList<>();
		// workers.add(new GenericsParent("worker1"));
		workers.add(new ChildWorker("worker-1", 99d));

		// invariance(workers);
		System.out.println("first covariance");

		safeCovarianceUsingWildCard(parents);
		System.out.println("final parent " + parents);
		safeCovarianceUsingWildCard(workers);
		System.out.println("final workers " + workers);
	}

	// invariance allow same type of generic and children can not be passed
	// can only pass arraylist/linkedlist<GenericPArent> only
	private static void invariance(List<GenericsParent> parents) {

		System.out.println("exisiting parents " + parents);
		// will allow all mutations and other things

		parents.add(new GenericsParent("fake"));
		parents.add(new ChildStudent("fake-student", "6"));
	}

	// safer one
	private static void safeCovarianceUsingWildCard(List<? extends GenericsParent> parents) {

		System.out.println("exisiting parents " + parents);
		// will allow all mutations and other things

		// these are not compile safe due to data corruption
//		parents.add(new GenericsParent("fake"));
//		parents.add(new ChildStudent("fake-student", "6"));
	}

	// unsafe one
	// allow mutations but can cause classcast exeption at runtime
	private static <T extends GenericsParent> void unsafeCovarianceUsingWildCard(List<T> parents) {

		System.out.println("exisiting parents " + parents);
		// will allow all mutations and other things
		parents.add((T)(new GenericsParent("fake")));
		parents.add((T) (new ChildStudent("fake-student", "6")));
	}
}
