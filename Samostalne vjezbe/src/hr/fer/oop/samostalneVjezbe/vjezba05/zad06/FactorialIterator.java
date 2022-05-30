package hr.fer.oop.samostalneVjezbe.vjezba05.zad06;

import java.util.Iterator;
import java.util.NoSuchElementException;

class FactorialIterator implements Iterator<Integer> {

    private int toGenerate;
    private int generated = 0;
    private int last = 1, next;

    public FactorialIterator(int toGenerate) {
        if (toGenerate < 0) {
            throw new IllegalArgumentException();
        }
        this.toGenerate = toGenerate;
    }

    @Override
    public boolean hasNext() {
        return generated < toGenerate;
    }

    @Override
    public Integer next() {
        if(hasNext()) {
            generated++;
            int temp = last;
            next = last * generated;
            last = next;
            return temp;
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
