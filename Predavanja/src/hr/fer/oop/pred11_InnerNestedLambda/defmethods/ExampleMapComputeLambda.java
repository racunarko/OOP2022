package hr.fer.oop.pred11_InnerNestedLambda.defmethods;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarCatalog;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleMapComputeLambda {
    public static void main(String[] args) {
        Map<CarType, Integer> carTypesCount = new HashMap<>();
        List<Car> cars = CarCatalog.loadCars();
        cars.forEach(car -> {
            Integer newVal = carTypesCount.compute(car.getType(), (key, value) -> value == null ? 1 : value + 1);
            System.out.printf("%s raises number of %s cars to %d %n", car.getName(), car.getType(), newVal);
        });
        System.out.println();
        carTypesCount.forEach((type, num) -> System.out.println(type + " occurred " + num + " times"));
    }
}
