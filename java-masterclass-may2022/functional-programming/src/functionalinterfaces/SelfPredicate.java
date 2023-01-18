package functionalinterfaces;

import java.util.Objects;

@FunctionalInterface
public interface SelfPredicate<T> {

	public boolean test(T t);
	
	default SelfPredicate<T> and(SelfPredicate<T> other){
		//fail fast
		Objects.requireNonNull(other);
		
		return t -> test(t) && other.test(t);
	}
	
	default SelfPredicate<T> or(SelfPredicate<T> other){
		//fail fast
		Objects.requireNonNull(other);
		
		return t -> test(t) || other.test(t);
	}
	

	default SelfPredicate<T> not(){
		return t -> !test(t);
	}
}
