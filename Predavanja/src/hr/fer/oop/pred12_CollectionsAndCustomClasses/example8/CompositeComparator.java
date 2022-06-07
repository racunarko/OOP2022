package hr.fer.oop.pred12_CollectionsAndCustomClasses.example8;

import java.util.*;

public class CompositeComparator<T> implements Comparator<T> {
    private List<Comparator<T>> comparators;

    @SafeVarargs
    public CompositeComparator(Comparator<T>... comparators) {
        this.comparators = new ArrayList<>(comparators.length);
        Collections.addAll(this.comparators, comparators);
        //or instead do it like this
//        for (Comparator<T> c : comparators) {
//            this.comparators.add(c);
//        }
        // or like this
//        this.comparators.addAll(Arrays.asList(comparators));
    }

    public CompositeComparator(List<Comparator<T>> comparators) {
        this.comparators = new ArrayList<>(comparators.size());
        this.comparators.addAll(comparators);
    }

    @Override
    public int compare(T o1, T o2) {
        for (Comparator<T> c : comparators) {
            int r = c.compare(o1, o2);
            if(r != 0) {
                return r;
            }
        }
        return 0;
    }
}
