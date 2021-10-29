package agh.ii.prinjava.lab06.lst01_04;

@FunctionalInterface
interface Function1<T, R> {
    R apply(T x);

    /**
     * Returns a composed function that first applies the "fst" function to its input, and then applies
     * this function to the result.
     */
    default <V> Function1<V, R> compose(Function1<? super V, ? extends T> fst) {
        return (V x) -> this.apply(fst.apply(x));
    }

    /**
     * Returns a composed function that first applies this function to its input, and then applies
     * the "snd" function to the result
     */
    default <V> Function1<T, V> andThen(Function1<? super R, ? extends V> snd) {
        return (T x) -> snd.apply(this.apply(x));
    }
}
