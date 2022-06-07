package hr.fer.oop.pred11_InnerNestedLambda.lambda.ex02;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;

import java.util.function.Predicate;

public class CheapClassPredicate implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getPrice() < 100000;
    }
}
