package hr.fer.oop.homework_11.task01.e01a;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainer implements Iterable<Integer>{
    private Integer[] numbers;

    public Integer[] getNumbers() {
        return numbers;
    }

    public ImmutableContainer(Integer... numbers) {
        this.numbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = numbers[i];
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StaticNestedClassIterator(this);
    }

    // Backward skipping iterator
    private static class StaticNestedClassIterator implements Iterator<Integer> {
        private int index;
        private ImmutableContainer col;

        public StaticNestedClassIterator(ImmutableContainer col) {
            this.col = col;
            this.index = col.numbers.length - 1;
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            index = index - 2;
            return col.numbers[index + 2];
        }
    }
}