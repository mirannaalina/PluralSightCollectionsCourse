package cap2;


@FunctionalInterface
public interface Predicate<T> {

    public boolean test(T t);

    public default Predicate<T> and(Predicate<T> other){
        return t ->test(t) && other.test(t) ;
    }

}
