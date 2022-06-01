package hr.fer.oop.labosi.lab05.zad02;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ArrayIterator implements Iterator<Integer> {

    private int[] array;
    private int current = 0;

    public ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return current < array.length;
    }

    @Override
    public Integer next() {
        if(hasNext()) {
            return array[current++];
        } else {
            throw new NoSuchElementException();
        }
    }
}
