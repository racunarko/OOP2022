package hr.fer.oop.homework_11.task01.e01d;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainer implements Iterable<Integer> {
    private Integer[] numbers;

    public ImmutableContainer(Integer... numbers) {
        this.numbers = numbers.clone();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = numbers.length - 1;
            // nema konstruktora jer je anonimna klasa, pa ju ne mozemo stvoriti
            {
                index = numbers.length - 1;
            }

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                if(!hasNext()) {
                    throw new NoSuchElementException("No more numbers available.");
                }
                return numbers[index--];
            }
        };
    }
}
