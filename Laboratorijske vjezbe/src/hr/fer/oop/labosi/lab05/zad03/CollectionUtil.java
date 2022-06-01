package hr.fer.oop.labosi.lab05.zad03;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.BiFunction;

class CollectionUtil {
    static <T,R,S> LinkedList<S> myZip(Collection<T> colla, Collection<R> collb, BiFunction<T,R,S> zipper) {
        LinkedList<S> out = new LinkedList<>();
        var a = colla.iterator();
        var b = collb.iterator();
        while (a.hasNext() && b.hasNext()) {
            out.add(zipper.apply(a.next(), b.next()));
        }
        return out;
    }
}
