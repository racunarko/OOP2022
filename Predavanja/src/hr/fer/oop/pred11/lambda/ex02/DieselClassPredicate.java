package hr.fer.oop.pred11.lambda.ex02;

import hr.fer.oop.pred11.lambda.Car;
import hr.fer.oop.pred11.lambda.CarType;

import java.util.function.Predicate;

public class DieselClassPredicate implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getType() == CarType.DIESEL;
    }
}
