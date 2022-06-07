package hr.fer.oop.pred11_InnerNestedLambda.defmethods;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarCatalog;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleMapMergeLambda {
    public static void main(String[] args) {
        Map<CarType, Integer> carTypesCount = new HashMap<>();
        List<Car> cars = CarCatalog.loadCars();

        cars.forEach(car -> carTypesCount.merge(car.getType(), 1, Integer::sum));
        System.out.println(carTypesCount);
    }
}
