package hr.fer.oop.auditorne.aud08.zad01;

import java.util.*;

public class SetOperations {

    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<T>(a);
        set.addAll(b);
        return set;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<T>(a);
        set.retainAll(b);
        return set;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<T>(a);
        set.removeAll(b);
        return set;
    }

}
