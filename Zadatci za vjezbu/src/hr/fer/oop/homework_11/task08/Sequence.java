package hr.fer.oop.homework_11.task08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sequence<T> {
    private List<T> values;

    @SafeVarargs
    public Sequence(T... values) {
        this.values = List.of(values);
    }

    public Sequence(List<T> values) {
        this.values = values;
    }

    public Sequence<T> filter(Predicate<T> filter) {
        List<T> newList = new ArrayList<>();
        values.forEach(value -> {
            if(filter.test(value)) {
                newList.add(value);
            }
        });
        return new Sequence<T>(newList);
    }

    public <R> Sequence<R> map(Function<? super T, ? extends R> mapper) {
        List<R> newList = new ArrayList<>();
        for (T t : toList()) {
            R temp = mapper.apply(t);
            newList.add(temp);
        }
        return new Sequence<R>(newList);
    }

    public void forEach(Consumer<T> action) {
        values.forEach(action);
    }

    public List<T> toList() {
        return values;
    }

    public boolean all(Predicate<T> predicate) {
        for (T t : values) {
            if(!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }
}
