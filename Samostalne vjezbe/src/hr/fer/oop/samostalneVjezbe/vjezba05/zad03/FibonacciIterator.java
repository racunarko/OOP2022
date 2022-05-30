package hr.fer.oop.samostalneVjezbe.vjezba05.zad03;

import java.util.Iterator;
import java.util.NoSuchElementException;

class FibonacciIterator implements Iterator<Integer>{
    private int toGenerate;
    private int num1 = 0, num2 = 1, num3 = 0;
    private int count = 0;

    public FibonacciIterator(int toGenerate) {
        if (toGenerate < 0) {
            throw new IllegalArgumentException();
        }
        this.toGenerate = toGenerate;
    }

    @Override
    public boolean hasNext() {
        return count < toGenerate;
    }

    @Override
    public Integer next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        if(count == 0) {
            count++;
            return 0;
        }
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        count++;
        return num1;
    }
}
