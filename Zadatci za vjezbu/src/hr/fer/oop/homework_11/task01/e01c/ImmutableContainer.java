package hr.fer.oop.homework_11.task01.e01c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainer implements Iterable<Integer> {
    private Integer[] numbers;

    public ImmutableContainer(Integer... numbers) {
        this.numbers = numbers.clone();
    }

    @Override
    public Iterator<Integer> iterator() {
        return createLocalIterator();
    }

    private Iterator<Integer> createLocalIterator() {
        // Common forward iterator
        class LocalNamedClassIterator implements Iterator<Integer> {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < numbers.length;
            }

            @Override
            public Integer next() {
                if(!hasNext()) {
                    throw new NoSuchElementException("No mor numbers are available.");
                }
                return numbers[index++];
            }
        }

        return new LocalNamedClassIterator();
    }
}
