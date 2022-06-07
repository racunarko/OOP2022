package hr.fer.oop.pred11_InnerNestedLambda.lambda.ex02;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarType;

import java.util.function.Predicate;

public class DieselClassPredicate implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getType() == CarType.DIESEL;
    }
}
