package functionalinterfaces;

@FunctionalInterface
public interface SelfUnaryOperator<T> extends SelfFunction<T, T> {

	public static <S> SelfUnaryOperator<S> identity(){
		return s -> s;
	}
}
