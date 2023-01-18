package functionalinterfaces;

import java.util.Objects;

@FunctionalInterface
public interface SelfFunction<T,R> {

	public R apply(T t);
	
	default <S> SelfFunction<T, S> thenApply(SelfFunction<R,S> other){
		Objects.requireNonNull(other);
		
		return t -> other.apply(apply(t));
	}
	
	default <S> SelfFunction<S, R> beforeApply(SelfFunction<S,T> other){
		Objects.requireNonNull(other);
		
		return s -> apply(other.apply(s));
	}
	
	//identity is a static method
	//hence can be called without instance
	//input and output are same
	static <S> SelfFunction<S,S> identity(){
		return s -> s;
	}
}
