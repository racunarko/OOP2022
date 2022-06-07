package hr.fer.oop.pred11_InnerNestedLambda.lambda.ex01;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarCatalog;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarCatalog.loadCars();
        printDieselCars(cars);
    }

    private static void printDieselCars(Iterable<Car> cars) {
        for (Car car : cars) {
            if(car.getType() == CarType.DIESEL) {
                System.out.println(car);
            }
        }
    }
}
