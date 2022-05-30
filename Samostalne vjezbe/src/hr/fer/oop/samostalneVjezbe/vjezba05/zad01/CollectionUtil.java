package hr.fer.oop.samostalneVjezbe.vjezba05.zad01;

import java.util.Collection;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

class CollectionUtil {
    public static <T> T myFilterReduce(Collection<T> coll, T init, Predicate<T> pred, BinaryOperator<T> op) {
        if(coll == null) {
            throw new NullPointerException();
        }
        for (T element : coll) {
            if (pred.test(element)) {
                init = op.apply(init, element);
            }
        }
        return init;
    }
}
