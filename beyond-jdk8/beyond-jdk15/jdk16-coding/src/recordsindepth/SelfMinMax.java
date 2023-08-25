package recordsindepth;

import java.util.Objects;

public class SelfMinMax<T> {
    private final T min;
    private final T max;

    public SelfMinMax(T min, T max){
        this.min = min;
        this.max = max;

    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelfMinMax<?> that = (SelfMinMax<?>) o;
        return Objects.equals(min, that.min) && Objects.equals(max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }

    @Override
    public String toString() {
        return "SelfMinMax{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
