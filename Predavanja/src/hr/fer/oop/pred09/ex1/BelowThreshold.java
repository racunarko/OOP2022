package hr.fer.oop.pred09.ex1;

import java.util.function.Predicate;

public class BelowThreshold implements Predicate<Number> {

    private final double threshold;

    public BelowThreshold(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean test(Number number) {
        return number.doubleValue() < threshold;
    }
}
