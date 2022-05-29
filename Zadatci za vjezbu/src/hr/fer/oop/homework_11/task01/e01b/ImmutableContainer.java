package hr.fer.oop.homework_11.task01.e01b;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainer implements Iterable<Integer>{
    private Integer[] numbers;

    public ImmutableContainer(Integer... numbers) {
        this.numbers = numbers.clone();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new InnerClassIterator();
    }

    // Common forward iterator
    public class InnerClassIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            if(!hasNext()) {
                throw new NoSuchElementException("No more numbers are available.");
            }
            return numbers[index++];
        }
    }

}
