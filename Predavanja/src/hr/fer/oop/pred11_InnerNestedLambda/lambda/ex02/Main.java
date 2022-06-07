package hr.fer.oop.pred11_InnerNestedLambda.lambda.ex02;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarCatalog;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarCatalog.loadCars();
        System.out.println("Cheap cars: ");
        printCars(cars, new CheapClassPredicate());
        System.out.println("Diesel cars: ");
        printCars(cars, new DieselClassPredicate());
    }

    private static void printCars(Iterable<Car> cars, Predicate<Car> predicate) {
        for (Car car : cars) {
            if(predicate.test(car)) {
                System.out.println(car);
            }
        }
    }
}
