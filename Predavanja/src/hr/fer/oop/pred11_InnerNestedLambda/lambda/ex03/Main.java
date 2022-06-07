package hr.fer.oop.pred11_InnerNestedLambda.lambda.ex03;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarCatalog;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarType;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarCatalog.loadCars();
        printCars(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getType() == CarType.DIESEL;
            }
        });
    }
    private static void printCars(Iterable<Car> cars, Predicate<Car> predicate) {
        for (Car car : cars) {
            if (predicate.test(car)) {
                System.out.println(car);
            }
        }
    }
}
